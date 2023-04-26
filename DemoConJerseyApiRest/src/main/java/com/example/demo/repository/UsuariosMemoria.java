package com.example.demo.repository;



import com.example.demo.entity.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public class UsuariosMemoria implements UsuariosRepository {
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
