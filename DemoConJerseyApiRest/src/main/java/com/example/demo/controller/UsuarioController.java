package com.example.demo.controller;


import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuariosService;



import org.springframework.stereotype.Component;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.ArrayList;
@Component
@Path("/")
public class UsuarioController {
    private final UsuariosService usuariosService;

    public UsuarioController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }
    @GET
    @Path("/usuarios")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Usuario> getUsuarios() {
        return usuariosService.listarUsuarios();
    }
    @GET
    @Path("/usuarios/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario getUser(@PathParam("nombre") String username) {
        return usuariosService.obtenerUsuarios(username);
    }
    @POST
    @Path("/usuarios")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crearUsuarios(Usuario usuario){
        usuariosService.crearUsuario(usuario);
        return Response.created(URI.create("/usuarios/"+usuario.getNombreUsuario())).build();
    }
    @DELETE
    @Path("/usuarios/{nombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response borrarUsuarios(@PathParam("nombre") String nombre){
        usuariosService.borrarUsuario(nombre);
        return Response.ok().build();
    }
}
