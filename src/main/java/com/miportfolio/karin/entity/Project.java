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
public class Project {
  
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //@Column(name="id_proj")
    int id;   
    
    //@NotNull
    @Column(name="imagen")
    private String imagen;
    
    //@NotNull
    @Column(name="proyecto")
    private String proyecto;    
    
    @Lob
    @Column(name="descripcion", length=1000)
    private String descripcion;
    
    @Column(name="live_url")
    private String live_url;

    @Column(name="repo_url")
    private String repo_url;

    
   
    public Project() {
    }

    public Project(String imagen, String proyecto, String descripcion, String live_url, String repo_url) {
        this.imagen = imagen;
        this.proyecto = proyecto;
        this.descripcion = descripcion;
        this.live_url = live_url;
        this.repo_url = repo_url;
    }

    
}