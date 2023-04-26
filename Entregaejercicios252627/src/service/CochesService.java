package service;

import entity.Coche;

import java.util.List;

public interface CochesService {
    List<Coche> obtenerCoches();
    Coche obtenerCochePorId(int id);
    void borrarCochePorId(int id);

    void craearChoche(Coche coche);
}
