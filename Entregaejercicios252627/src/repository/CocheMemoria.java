package repository;

import entity.Coche;

import java.util.ArrayList;
import java.util.List;

public class CocheMemoria implements ChocheRepository {
    ArrayList<Coche> coches = new ArrayList();


    @Override
    public List<Coche> obtenerCoches() {
        return coches;
    }

    @Override
    public Coche obtenerCoche(int id) {
        for (Coche coche : coches) {
            if (coche.getId() ==id){
                return coche;
            }
        }
        return null;
    }

    @Override
    public void insertarCoche(Coche coche) {
        if (coches.contains(coche)){
            return;
        }
        coches.add(coche);
    }

    @Override
    public void borarCoche(int id) {
        for (int i = 0; i < coches.size(); i++) {
            if(coches.get(i).getId() == id){
                coches.remove(i);
            }
        }
    }
}
