package com.miportfolio.karin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class Skill{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //@Column(name="id_skill")
    int id;   
    
    @Column(name="skill_tipo")
    private String skill_tipo;  
    
    //@NotNull
    @Column(name="skill")
    private String skill;
    
    @Column(name="icono")
    private String icono;
    
    //@NotNull
    @Min(0)  @Max(100)
    @Column(name="progreso")
    private int progreso;
    
    //@NotNull
    @Column(name="color")
    private String color;  //hacer relac para color?

    
    //relación skillTipo para tipo de habilid
    //@ManyToOne(fetch=FetchType.LAZY)
    //@JoinColumn(name="skillTipo_id")  //esta es la FK
    //private SkillTipo skillTipo; 

    public Skill() {
    }

    public Skill(String skill_tipo, String skill, String icono, int progreso, String color) {
        this.skill_tipo = skill_tipo;
        this.skill = skill;
        this.icono = icono;
        this.progreso = progreso;
        this.color = color;
    }


}
