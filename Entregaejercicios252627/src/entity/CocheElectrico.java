package entity;

import entity.Coche;

public class CocheElectrico extends Coche {
    private String marcaBateria;

    public CocheElectrico(int id, String marca, String modelo, int ano, double precio, String marcaBateria) {
        super(id, marca, modelo, ano, precio);
        this.marcaBateria = marcaBateria;
    }



    public String getMarcaBateria() {
        return marcaBateria;
    }

    public void setMarcaBateria(String marcaBateria) {
        this.marcaBateria = marcaBateria;
    }

    @Override
    public String toString() {
        return super.toString()+"CocheElectrico{" +
                "marcaBateria='" + marcaBateria + '\'' +
                '}';
    }
}
