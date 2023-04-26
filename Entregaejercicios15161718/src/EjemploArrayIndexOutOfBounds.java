import java.util.ArrayList;

public class EjemploArrayIndexOutOfBounds {
    public static void main(String[] args) {

        ArrayList<String> nombres=new ArrayList<>();
        nombres.add("Carlos");
        nombres.add("Pepe");
        nombres.add("Paco");
        nombres.add("Fran");
        nombres.add("Sara");
        nombres.add("Maria");
        for(int i=0;i<9;i++){
            System.out.println(nombres.get(i));
        }

    }
}

