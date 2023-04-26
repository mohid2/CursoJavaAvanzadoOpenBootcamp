package entity;

import entity.Coche;

public class CocheCombustible extends Coche {

        private double capacidadTanque;


    public CocheCombustible(int id, String marca, String modelo, int ano, double precio, double capacidadTanque) {
        super(id, marca, modelo, ano, precio);
        this.capacidadTanque = capacidadTanque;
    }

    public double getCapacidadTanque() {
            return capacidadTanque;
        }

        public void setCapacidadTanque(double capacidadTanque) {
            this.capacidadTanque = capacidadTanque;
        }

        @Override
        public String toString() {
            return super.toString()+"CocheCombustible{" +
                    "capacidadTanque=" + capacidadTanque +
                    '}';
        }


}
