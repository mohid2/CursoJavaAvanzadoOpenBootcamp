import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploFileNotFound {
    public static void main(String[] args) {
        leerArchivoTxt("ruta/al/archivo.txt");
    }
    public static void leerArchivoTxt(String ruta){
        try {
            File file = new File(ruta);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encontró en la ruta especificada.");
            e.printStackTrace();
        }
    }

}
