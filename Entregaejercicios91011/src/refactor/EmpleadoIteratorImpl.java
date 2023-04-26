package refactor;

import java.util.ArrayList;


public class EmpleadoIteratorImpl implements EmpleadoIterator {
    private final ArrayList<Empleado> listaEmpleados=new ArrayList<>();
    private static int  posicionActual;


   public void crear(Empleado empleado){
       listaEmpleados.add(empleado);
   }


    @Override
    public Empleado next() {
        Empleado empleado=listaEmpleados.get(posicionActual);
        posicionActual++;
        return empleado ;
    }

    @Override
    public void reset() {
        posicionActual=0;
    }


    @Override
    public boolean hasMore() {
       return posicionActual < listaEmpleados.size();
    }
}
