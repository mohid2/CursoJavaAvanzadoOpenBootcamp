package ejerccio3;

import ejerccio3.entity.Usuario;
import ejerccio3.repository.UsuariosFechero;
import ejerccio3.service.Usuarios;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("openbootcamp","Open","Bootcamp",
                "ejemplos@open-bootcamp.com",10);
        Usuario usuario2 = new Usuario("openbootcamp2","Open","Bootcamp",
                "ejemplos@open-bootcamp.com",10);


        Usuarios usuarios = new Usuarios(new UsuariosFechero());
        usuarios.crearUsuario(usuario);
        usuarios.crearUsuario(usuario2);

        //Usuario openbootcamp = usuarios.obtenerUsuario("openbootcamp2");
        //System.out.println(openbootcamp);

        usuarios.borrarUsuario("openbootcamp2");
        for (Usuario a : usuarios.listarUsuarios()) {
            System.out.println(a);
        }
    }
}