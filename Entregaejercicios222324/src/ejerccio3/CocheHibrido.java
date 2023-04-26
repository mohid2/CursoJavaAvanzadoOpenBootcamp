package ejerccio3;

public class CocheHibrido extends Coche{
    private String marcaBateria;
    private double capacidadTanque;

    public CocheHibrido(String marca, String modelo, int ano, double precio, String marcaBateria, double capacidadTanque) {
        super(marca, modelo, ano, precio);
        this.marcaBateria = marcaBateria;
        this.capacidadTanque = capacidadTanque;
    }
}
