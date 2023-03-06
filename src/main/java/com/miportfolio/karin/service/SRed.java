package com.miportfolio.karin.service;

import com.miportfolio.karin.entity.Red;
import com.miportfolio.karin.repository.RRed;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SRed {
    
    //para hacer inyección de dependencias sin crear tantas instancias con new
    @Autowired  
    public RRed redRepo;

    //Endpoints
    public List<Red> getRedes() {
        return redRepo.findAll();
    }
    //ya no hay create, sino q modifica lo q hay y si no hay, lo crea
    public void saveRed(Red redes) {
        redRepo.save(redes);  
    }

    //si no encuentra la red retorna null
    public Red findRed(Integer id) {
        return redRepo.findById(id).orElse(null);   
    }
    
    //mismo que create
    public void updateRed(Red redes) {
        redRepo.save(redes);
    }
    
    public void deleteRed(Integer id) {
        redRepo.deleteById(id);
    }
    
    
}