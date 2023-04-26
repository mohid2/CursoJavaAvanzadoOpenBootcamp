package refactor;

public class Main {
    public static void main(String[] args) {
        EmpleadoIteratorImpl empleados=new EmpleadoIteratorImpl();
        empleados.crear(new Empleado("moha","jefe",21));
        empleados.crear(new Empleado("sofia","empleado",30));
        empleados.crear(new Empleado("carlos","empleado",18));
        empleados.crear(new Empleado("paco","empleado",35));


        while (empleados.hasMore()){
            System.out.println(empleados.next());
        }
    }
}