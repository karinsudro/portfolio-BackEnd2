package com.miportfolio.karin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Education {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //@Column(name="id_educ")
    int id;   
    
    //@NotNull
    @Column(name="carrera")
    private String carrera;
    
    //@NotNull
    @Column(name="inicio")
    private String inicio;
    
    //@NotNull
    @Column(name="fin")
    private String fin;
    
    //@NotNull
    @Column(name="institucion")
    private String institucion;
    
    //@NotNull
    @Lob
    @Column(name="descripcion", length=1000)
    private String descripcion;

    
    public Education() {
    }

    public Education(String carrera, String inicio, String fin, String institucion, String descripcion) {
        this.carrera = carrera;
        this.inicio = inicio;
        this.fin = fin;
        this.institucion = institucion;
        this.descripcion = descripcion;
    }

    
}