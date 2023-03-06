package com.miportfolio.karin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Red {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //@Column(name="id_red")
    private int id;   
    
    //@NotNull
    @Column(name="red")
    private String red;
    
    //@NotNull
    @Column(name="icono")
    private String icono;
    
    //@NotNull
    @Column(name="link")
    private String link;
    

    public Red() {
    }

    public Red(int id, String red, String icono, String link ) {
        this.id = id;
        this.red = red;
        this.icono = icono;
        this.link = link;
        
    }

    
}
