package com.miportfolio.karin.repository;

import com.miportfolio.karin.entity.Red;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RRed  extends JpaRepository<Red, Integer>{
    
}
