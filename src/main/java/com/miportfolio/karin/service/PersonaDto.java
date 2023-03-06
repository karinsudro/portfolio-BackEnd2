package com.miportfolio.karin.service;

import lombok.Getter;
import lombok.Setter;



@Getter @Setter
public class PersonaDto {
    
    private int id;   
    
    private String hola;
    
    private String nombre;
    
    private String apellido;
    
    private String cargo;

    
    public PersonaDto() {
    }

    public PersonaDto(int id, String hola, String nombre, String apellido, String cargo) {
        this.id = id;
        this.hola = hola;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
    }
    
    
    
    
}