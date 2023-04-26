package ejerccio2;

import ejerccio1.Coche;

public class CocheElectrico extends Coche {
    private String marcaBateria;

    public CocheElectrico(String marca, String modelo, int ano, double precio, String marcaBateria) {
        super(marca, modelo, ano, precio);
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
        return "ejerccio3.CocheElectrico{" +
                "marcaBateria='" + marcaBateria + '\'' +
                '}';
    }
}
