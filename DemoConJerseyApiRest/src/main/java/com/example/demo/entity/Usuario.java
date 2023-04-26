package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Usuario {
    private String nombreUsuario;
    private String nombre;
    private String apellidos;
    private String email = "";
    private int nivelAcceso;

}
