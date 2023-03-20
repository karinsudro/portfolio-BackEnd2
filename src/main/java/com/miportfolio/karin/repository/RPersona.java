package com.miportfolio.karin.repository;

import com.miportfolio.karin.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RPersona extends JpaRepository<Persona, Integer>{

    public Persona findByEmailAndClave(String email, String clave);
}