package com.example.demo.repository;



import com.example.demo.entity.Usuario;

import java.util.ArrayList;

public interface UsuariosRepository {
    ArrayList<Usuario> obtenerUsuarios();
    Usuario obtenerUsuario(String username);
    void insertarUsuarios(Usuario usuario);
     void  borarUauario(Usuario usuario);

}
