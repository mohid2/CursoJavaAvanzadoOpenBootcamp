package com.example.demo.service;



import com.example.demo.entity.Usuario;
import com.example.demo.entity.UsuarioBuilder;
import com.example.demo.repository.UsuariosRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class UsuariosService {
    private final UsuariosRepository usuariosRepository;

    public UsuariosService(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }
    public ArrayList<Usuario> listarUsuarios() {
        return usuariosRepository.obtenerUsuarios();
    }
    public Usuario obtenerUsuarios(String username) {
       return usuariosRepository.obtenerUsuario(username);
    }
    public void crearUsuario(Usuario usuario) {
        if(usuariosRepository.obtenerUsuario(usuario.getNombreUsuario())!=null){
            return;
        }
        Usuario ub = crearUsuarioReal(usuario);
        usuariosRepository.insertarUsuarios(ub);
    }
    private Usuario crearUsuarioReal(Usuario usuario){
        UsuarioBuilder usuarioBuilder=new UsuarioBuilder(usuario.getNombreUsuario());
        return usuarioBuilder
                .nombre(usuario.getNombre())
                .apellidos(usuario.getApellidos())
                .email(usuario.getEmail())
                .nivelAcceso(usuario.getNivelAcceso())
                .build();
    }
    public void borrarUsuario(String username){
        Usuario usuario= usuariosRepository.obtenerUsuario(username);
        usuariosRepository.borarUauario(usuario);
    }



}
