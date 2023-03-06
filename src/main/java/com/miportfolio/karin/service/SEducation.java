package com.miportfolio.karin.service;

import com.miportfolio.karin.entity.Education;
import com.miportfolio.karin.repository.REducation;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SEducation {
    
    //para hacer inyección de dependencias sin crear tantas instancias con new
    @Autowired  
    REducation educRepo;

    //Endpoints
    public List<Education> getEducations() {
        return educRepo.findAll();
    }
    
    //ya no hay create, sino q modifica lo q hay y si no hay, lo crea
    public void saveEducation(Education educ) {
        educRepo.save(educ);  
    }
    
    //si no encuentra la carrera retorna null
    public Education findEducation(Integer id) {
        return educRepo.findById(id).orElse(null);   
    }
    
    //mismo que create
    public void updateEducation(Education educ) {
        educRepo.save(educ);
    }
    
    public void deleteEducation(Integer id) {
        educRepo.deleteById(id);
    }
    
    
    
}