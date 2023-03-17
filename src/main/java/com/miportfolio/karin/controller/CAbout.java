package com.miportfolio.karin.controller;

import com.miportfolio.karin.entity.About;
import com.miportfolio.karin.service.SAbout;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@CrossOrigin(origins = "http://localhost:4200") //xq se cruza con angular, desp se cambia
@CrossOrigin(origins = "https://portfolio-karinsd.web.app/")
@RequestMapping("about/") //localhost:8080/about
public class CAbout {
    
    //controller conectada al servicio, servicio al repo y repo a la db
    @Autowired
    SAbout aboutServ;
   
    //Endpoints
    @GetMapping("lista")
    @ResponseBody 
    public List<About> getAbouts(){
        return aboutServ.getAbouts();  
    }
    
    //para ver about me 
    @GetMapping("find/{id}")
    @ResponseBody 
    public About findAbout(@PathVariable int id){
        //si retorna vacío no pasa nada
        return aboutServ.findAbout(id);  
    }
    
    //@RequestBody es para recibir un about nuevo. Viene en un JSON
    @PostMapping ("new")
    @ResponseBody
    public String saveAbout(@RequestBody About aboutme){
        aboutServ.saveAbout(aboutme);
        return "Los datos fueron creados correctamente";
        //return ResponseEntity.ok().body(pers);
    }
    
    //para editar
    @PutMapping("update/{id}")   
    public String updateAbout(@RequestBody About aboutme){
        aboutServ.updateAbout(aboutme);
        return "Los datos se actualizaron correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    @DeleteMapping("delete/{id}")
    public String deleteAbout(@PathVariable int id){
        aboutServ.deleteAbout(id);
        return "Los datos fueron borrados correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    
}