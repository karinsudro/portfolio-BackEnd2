package com.miportfolio.karin.repository;

import com.miportfolio.karin.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface REducation extends JpaRepository<Education, Integer>{
    
}