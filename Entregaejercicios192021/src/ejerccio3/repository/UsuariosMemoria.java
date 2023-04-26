package ejerccio3.repository;




import ejerccio3.entity.Usuario;

import java.util.ArrayList;

public class UsuariosMemoria implements UsuariosDb {
    ArrayList<Usuario> usuarios = new ArrayList();

    @Override
    public ArrayList<Usuario> obtenerUsuarios() {
        return usuarios;
    }

    @Override
    public Usuario obtenerUsuario(String username) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equalsIgnoreCase(username)){
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void insertarUsuarios(Usuario usuario) {
        if (usuarios.contains(usuario)){
            return;
        }
        usuarios.add(usuario);

    }

    @Override
    public void borarUauario(Usuario usuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getNombreUsuario().equalsIgnoreCase(usuario.getNombreUsuario())){
                usuarios.remove(i);
            }
        }
    }
}
