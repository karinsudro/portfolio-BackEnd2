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
public class About {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    //@NotNull
    @Column(name="foto")
    private String foto;
    
    //@NotNull
    @Lob
    @Column(name="saludoA", length=1000)
    private String saludoA;
    
    @Column(name="saludoB")
    private String saludoB;
    
    @Column(name="saludoC")
    private String saludoC;
    
    @Column(name="saludoD")
    private String saludoD;
    
    @Column(name="saludoE")
    private String saludoE;
    
    @Column(name="saludoF")
    private String saludoF;
    
    @Column(name="saludoG")
    private String saludoG;

    public About() {
    }

    public About(int id, String foto, String saludoA, String saludoB, String saludoC, String saludoD, String saludoE, String saludoF, String saludoG) {
        this.id = id;
        this.foto = foto;
        this.saludoA = saludoA;
        this.saludoB = saludoB;
        this.saludoC = saludoC;
        this.saludoD = saludoD;
        this.saludoE = saludoE;
        this.saludoF = saludoF;
        this.saludoG = saludoG;
    }

}