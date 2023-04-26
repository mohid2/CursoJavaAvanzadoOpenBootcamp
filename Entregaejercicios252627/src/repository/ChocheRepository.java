package repository;

import entity.Coche;

import java.util.List;

public interface ChocheRepository {
    List<Coche> obtenerCoches();
    Coche obtenerCoche(int id);
    void insertarCoche(Coche coche);
    void  borarCoche(int id);
}
