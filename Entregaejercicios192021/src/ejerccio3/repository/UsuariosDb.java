package ejerccio3.repository;





import ejerccio3.entity.Usuario;

import java.util.ArrayList;

public interface UsuariosDb {
    ArrayList<Usuario> obtenerUsuarios();
    Usuario obtenerUsuario(String username);
    void insertarUsuarios(Usuario usuario);
     void  borarUauario(Usuario usuario);

}
