package com.miportfolio.karin.controller;

import com.miportfolio.karin.entity.Persona;
import com.miportfolio.karin.service.PersonaDto;
import com.miportfolio.karin.service.SPersona;
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


//@CrossOrigin(origins="*", allowedHeaders="*")
@RestController
@CrossOrigin(origins = "https://portfolio-karinsd.web.app/")
//@CrossOrigin(origins = "http://localhost:4200") //xq se cruza con angular, desp se cambia por firebase
@RequestMapping("persona/") //localhost:8080/persona y cdo se sube se saca
public class CPersona {
    
    //controller conectada al servicio, servicio al repo y repo a la db
    @Autowired
    SPersona persoServ;
   
    //Endpoints
    @GetMapping("lista")
    @ResponseBody 
    public List<Persona> getPersonas(){
       return persoServ.getPersonas();  
    }
    
    //para ver las personas 
    @GetMapping("find/{id}")
    @ResponseBody 
    public Persona findPersona(@PathVariable int id){
        //si retorna vacío no pasa nada
        return persoServ.findPersona(id);  
    }
    
    //@RequestBody es para recibir una persona nueva. Viene en un JSON
    @PostMapping ("new")
    @ResponseBody
    public String savePersona(@RequestBody Persona pers){
        persoServ.savePersona(pers);
        return "La persona fue creada correctamente";   
    }
    
    //para editar
    @PutMapping("update/{id}")   
    public String updatePersona(@RequestBody Persona pers){
        persoServ.updatePersona(pers);
        return "La persona se actualizó correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    @DeleteMapping("delete/{id}")
    public String deletePersona(@PathVariable int id){
        persoServ.deletePersona(id);
        return "La persona fue borrada correctamente";
    }
    
    //Login. en local fciona bien
    @PostMapping ("auth/login") 
    @ResponseBody
    public PersonaDto loginPersona(@RequestBody Persona perso) {
        return persoServ.loginPersona(perso.getEmail(), perso.getClave());
    }
    
}