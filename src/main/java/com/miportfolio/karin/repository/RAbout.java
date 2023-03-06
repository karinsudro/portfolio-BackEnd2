package com.miportfolio.karin.repository;

import com.miportfolio.karin.entity.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RAbout extends JpaRepository<About, Integer>{
    
}