package com.miportfolio.karin.service;

import com.miportfolio.karin.entity.ExpeTeaching;
import com.miportfolio.karin.repository.RExpeTeaching;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SExpeTeaching {
    
    //para hacer inyección de dependencias sin crear tantas instancias con new
    @Autowired  
    public RExpeTeaching expeTeachRepo;

    //Endpoints
    public List<ExpeTeaching> getExpeTeachings() {
        return expeTeachRepo.findAll();
    }
    
    //ya no hay create, sino q modifica lo q hay y si no hay, lo crea
    public void saveExpeTeaching(ExpeTeaching expeTeach) {
        expeTeachRepo.save(expeTeach);  
    }
    
    //si no encuentra el trabajo retorna null
    public ExpeTeaching findExpeTeaching(Integer id) {
        return expeTeachRepo.findById(id).orElse(null);   
    }
    
    //mismo que create
    public void updateExpeTeaching(ExpeTeaching expeTeach) {
        expeTeachRepo.save(expeTeach);
    }

    public void deleteExpeTeaching(Integer id) {
        expeTeachRepo.deleteById(id);
    }
    
    
    
}