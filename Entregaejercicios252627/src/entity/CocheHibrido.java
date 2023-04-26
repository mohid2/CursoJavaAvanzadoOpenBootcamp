package entity;

import entity.Coche;

public class CocheHibrido extends Coche {
    private String marcaBateria;
    private double capacidadTanque;

    public CocheHibrido(int id, String marca, String modelo, int ano, double precio, String marcaBateria, double capacidadTanque) {
        super(id, marca, modelo, ano, precio);
        this.marcaBateria = marcaBateria;
        this.capacidadTanque = capacidadTanque;
    }

    public String getMarcaBateria() {
        return marcaBateria;
    }

    public void setMarcaBateria(String marcaBateria) {
        this.marcaBateria = marcaBateria;
    }

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    @Override
    public String toString() {
        return super.toString()+"CocheHibrido{" +
                "marcaBateria='" + marcaBateria + '\'' +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}
