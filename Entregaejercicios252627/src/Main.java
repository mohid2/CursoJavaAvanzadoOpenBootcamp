import entity.Coche;
import entity.CocheCombustible;
import entity.CocheElectrico;
import entity.CocheHibrido;
import repository.CocheMemoria;
import service.Coches;
import service.CochesService;

public class Main {
    public static void main(String[] args) {
        Coche cocheCombustible=new CocheCombustible(1,"BMW","120D",2010,12000,40);
        Coche cocheElectrico=new CocheElectrico(2,"Ford","Focus",2010,6000,"0.1");
        Coche cocheHibrido=new CocheHibrido(3,"Mercedes","AMG",2010,40000,"2.5",25);

        Coches coches=new Coches(new CocheMemoria());
        coches.craearChoche(cocheCombustible);
        coches.craearChoche(cocheElectrico);
        coches.craearChoche(cocheHibrido);
        System.out.println(coches.obtenerCochePorId(2));

        for (Coche coche:coches.obtenerCoches()){
            System.out.println(coche);
        }
    }
}