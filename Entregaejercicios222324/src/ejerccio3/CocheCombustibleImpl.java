package ejerccio3;

import ejerccio1.Coche;

public class CocheCombustibleImpl extends Coche {

        private double capacidadTanque;

        public CocheCombustibleImpl(String marca, String modelo, int ano, double precio, double capacidadTanque) {
            super(marca, modelo, ano, precio);
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
            return "ejerccio3.CocheCombustibleImpl{" +
                    "capacidadTanque=" + capacidadTanque +
                    '}';
        }


}
