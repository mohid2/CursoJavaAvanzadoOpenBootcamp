public class Main {
    public static void main(String[] args) {
        System.out.println(convertirMayuscula(null));
        System.out.println(calcularAreaTriangulo(5,6));
    }

    public static String convertirMayuscula(String sFrase) {
        if (sFrase == null || sFrase.isEmpty()) {
            return "La cadena de texto es nula o está vacía.";
        }
        return sFrase.equals(sFrase.toUpperCase()) ?
                sFrase + ": La cadena de texto ya está en mayúsculas." :
                sFrase.toUpperCase();
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            return 0;
        }
        return (base * altura) / 2;

    }


}