package ejerccio3.repository;




import ejerccio3.entity.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosFechero implements UsuariosDb {
    private String ficheroDatos = "usuarios.txt";

    ArrayList<Usuario> usuarios;
    @Override
    public ArrayList<Usuario> obtenerUsuarios() {
        usuarios = new ArrayList();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(ficheroDatos));
            while (scanner.hasNext()) {
                String usuarioActual = scanner.next();
                String[] partes = usuarioActual.split(",");

                Usuario usuario = new Usuario();
                usuario.setNombreUsuario(partes[0]);
                usuario.setNombre(partes[1]);
                usuario.setApellidos(partes[2]);
                usuario.setEmail(partes[3]);
                usuario.setNivelAcceso(Integer.parseInt(partes[4]));

                usuarios.add(usuario);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if(scanner!=null){
            scanner.close();
        }

        return usuarios;
    }

    @Override
    public Usuario obtenerUsuario(String username) {
        usuarios = obtenerUsuarios();
        for (Usuario u:usuarios) {
            if (u.getNombreUsuario().equalsIgnoreCase(username)){
                return u;
            }
        }
        return  null;
    }

    @Override
    public void insertarUsuarios(Usuario usuario) {
        FileOutputStream fos =null;
        PrintStream ps = null;
        try {
            fos = new FileOutputStream(ficheroDatos, true);
            ps = new PrintStream(fos);
            ps.println(separarPorComas(usuario));
            ps.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (fos!=null){
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (ps!=null){
            ps.close();
        }

    }

    private String separarPorComas(Usuario usuario) {
        return usuario.getNombreUsuario() + ","
                + usuario.getNombre() + ","
                + usuario.getApellidos() + ","
                + usuario.getEmail() + ","
                + usuario.getNivelAcceso();
    }
    @Override
    public void borarUauario(Usuario usuario) {
        FileWriter writer = null;
        usuarios = obtenerUsuarios();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNombreUsuario().equalsIgnoreCase(usuario.getNombreUsuario())) {
                usuarios.remove(i);
            }
        }
        try {
            writer = new FileWriter(ficheroDatos);
            for (Usuario us : usuarios) {
                writer.write(separarPorComas(us));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
