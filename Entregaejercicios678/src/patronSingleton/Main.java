package patronSingleton;

import patronSingleton.CRUD;

public class Main {
    public static void main(String[] args) {
        CRUD crud=CRUD.getInstance();
        System.out.println(crud.listarAlumnos());
        System.out.println(crud.buscarAlumno(3));

        //probando que es la misma instancia
        System.out.println(crud);
        CRUD crud1=CRUD.getInstance();
        System.out.println(crud1);

    }
}