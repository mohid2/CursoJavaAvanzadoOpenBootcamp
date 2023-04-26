package patronSingleton;

import java.util.ArrayList;
import java.util.List;

public class CRUD {
    private static CRUD crud;
    private List<Alumno> alumnos=new ArrayList<>();
    private CRUD() {
        rellenarLaLista();
    }
    public static CRUD getInstance(){
        if(crud==null){
            return crud=new CRUD();
        }
        return crud;
    }
    private void rellenarLaLista(){
       alumnos.add(new Alumno(1,"Carlos","Perez",25));
       alumnos.add(new Alumno(2,"Fran","Perez",40));
        alumnos.add(new Alumno(3,"Jorge","Gomez",21));
        alumnos.add(new Alumno(4,"Sofia","Gonzales",28));
        alumnos.add(new Alumno(5,"Sara","Paco",35));

    }

    public List<Alumno> listarAlumnos(){
        return alumnos;
    }
    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    public Alumno buscarAlumno(int id){
        for (Alumno a:alumnos) {
            if(a.getId()==id){
                return a;
            }
        }
        return null;
    }



}
