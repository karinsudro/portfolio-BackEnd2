package com.miportfolio.karin.repository;

import com.miportfolio.karin.entity.ExpeTeaching;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RExpeTeaching extends JpaRepository<ExpeTeaching, Integer>{
    
}