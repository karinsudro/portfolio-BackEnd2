package com.miportfolio.karin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
@Table(name="persona")
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //@Column(name="id")
    private int id;   
    
    //@NotNull
    //@Size(min=1, max=45, message="No cumple con la longitud")
    @Column(name="hola")
    private String hola;
    
    //@NotNull
    //@Size(min=1, max=45, message="No cumple con la longitud")
    @Column(name="nombre")
    private String nombre;
    
    //@NotNull
    //@Size(min=1, max=45, message="No cumple con la longitud")
    @Column(name="apellido")
    private String apellido;
    
    //@NotNull
    //@Size(min=1, max=45, message="No cumple con la longitud")
    @Column(name="cargo")
    private String cargo;
    
    //@NotNull
    @Column(name="email")
    private String email;
    
    //@NotNull
    @Column(name="clave")
    private String clave;
    

    public Persona() {
    }

    public Persona(int id, String hola, String nombre, String apellido, String cargo, String email, String clave) {
        this.id = id;
        this.hola = hola;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.email = email;
        this.clave = clave;
    }

    
}