public class EjemploArithmeticException {
    public static void main(String[] args) {
        division(5,0);
    }
    public static void division(int x, int y){
        try {
            System.out.println( x / y);
        }catch (ArithmeticException e) {
            System.out.println("no se puede dividir entre 0 "+e.getMessage()+e.getClass());
        }
    }
}