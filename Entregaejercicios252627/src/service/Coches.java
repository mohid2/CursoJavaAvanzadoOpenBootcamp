package service;

import entity.Coche;
import repository.ChocheRepository;

import java.util.List;

public class Coches implements  CochesService{
    ChocheRepository chocheRepository;

    public Coches(ChocheRepository chocheRepository) {
        this.chocheRepository = chocheRepository;
    }

    @Override
    public List<Coche> obtenerCoches() {
        return chocheRepository.obtenerCoches();
    }

    @Override
    public Coche obtenerCochePorId(int id) {
        return chocheRepository.obtenerCoche(id);
    }

    @Override
    public void borrarCochePorId(int id) {
        chocheRepository.borarCoche(id);
    }

    @Override
    public void craearChoche(Coche coche) {
        if(chocheRepository.obtenerCoche(coche.getId()) != null){
            return;
        }
        chocheRepository.insertarCoche(coche);
    }
}
