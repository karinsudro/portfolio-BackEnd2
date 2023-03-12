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
public class ExpeTeaching {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //@Column(name="id_exp")
    int id;  
    
    //@Column(name="expe_tipo")
    //private String expe_tipo;
     
    //@NotNull
    @Column(name="cargo")
    private String cargo;
    //@NotNull
    @Column(name="inicio")
    private String inicio;
    
    @Column(name="fin")
    private String fin;
    //@NotNull
    @Column(name="lugar")
    private String lugar;
    
    //@NotNull
    @Lob
    @Column(name="descripcion", length=1000)
    private String descripcion;

    //relación categoría para experiencia Teaching y Design
    //@ManyToOne(fetch=FetchType.LAZY)
    //@JoinColumn(name="categoria_id")
    //private Categoria categoria;

    public ExpeTeaching() {
    }

    public ExpeTeaching(String cargo, String inicio, String fin, String lugar, String descripcion) {
        this.cargo = cargo;
        this.inicio = inicio;
        this.fin = fin;
        this.lugar = lugar;
        this.descripcion = descripcion;
    }
    

}