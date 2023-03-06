package com.miportfolio.karin.repository;

import com.miportfolio.karin.entity.ExpeDesign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RExpeDesign extends JpaRepository<ExpeDesign, Integer>{
    
    
}
