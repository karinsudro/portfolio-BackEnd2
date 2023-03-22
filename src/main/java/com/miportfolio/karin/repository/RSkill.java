package com.miportfolio.karin.repository;

import com.miportfolio.karin.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RSkill extends JpaRepository<Skill, Integer>{
    
}

