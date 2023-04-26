package com.example.demo.entity;

public class UsuarioBuilder {
    Usuario usuario = new Usuario();

    public UsuarioBuilder(String nombreUsuario) {
        usuario.setNombre("");
        usuario.setApellidos("");
        usuario.setEmail("");
        usuario.setNivelAcceso(0);
        usuario.setNombreUsuario(nombreUsuario);
    }
    public UsuarioBuilder nombre(String nombre){
        usuario.setNombre(usuario.getNombre().length() > 0 ? usuario.getNombre() : "sin nombre");
        return this;
    }
    public UsuarioBuilder apellidos(String apellidos){
        usuario.setApellidos(usuario.getApellidos().length() > 0 ? usuario.getApellidos() : "sin apellidos");
        return this;
    }
    public UsuarioBuilder email(String email){
        usuario.setEmail(usuario.getEmail().length() > 0 ? usuario.getEmail() : "sin email");
        return this;
    }
    public UsuarioBuilder nivelAcceso(int nivelAcceso){
        usuario.setNivelAcceso(usuario.getNivelAcceso() > 0 ? usuario.getNivelAcceso() : 0);
        return this;
    }
    public Usuario build(){
        return usuario;
    }
}
