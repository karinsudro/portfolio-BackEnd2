package com.miportfolio.karin.repository;

import com.miportfolio.karin.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RProject  extends JpaRepository<Project, Integer>{
    
}
