package ejerccio3.service;



import ejerccio3.entity.Usuario;
import ejerccio3.repository.UsuariosDb;

import java.util.ArrayList;

public class Usuarios {
    private UsuariosDb usuariosDb;


    public Usuarios(UsuariosDb usuariosDb) {
        this.usuariosDb = usuariosDb;
    }
    public ArrayList<Usuario> listarUsuarios() {
        return usuariosDb.obtenerUsuarios();
    }
    public Usuario obtenerUsuarios(String username) {
       return usuariosDb.obtenerUsuario(username);
    }
    public void crearUsuario(Usuario usuario) {
        if(usuariosDb.obtenerUsuario(usuario.getNombreUsuario())!=null){
            return;
        }
        usuariosDb.insertarUsuarios(usuario);
    }
    public void borrarUsuario(String username){
        Usuario usuario=usuariosDb.obtenerUsuario(username);
        usuariosDb.borarUauario(usuario);
    }


}
