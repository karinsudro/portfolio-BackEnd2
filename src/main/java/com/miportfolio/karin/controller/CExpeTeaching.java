package com.miportfolio.karin.controller;

import com.miportfolio.karin.entity.ExpeTeaching;
import com.miportfolio.karin.service.SExpeTeaching;
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
@CrossOrigin(origins = "https://portfolio-karinsd.web.app/")
//@CrossOrigin(origins = "http://localhost:4200") //xq se cruza con angular, desp se cambia por firebase
@RequestMapping("expeTeaching/") //localhost:8080/exp_laboral
public class CExpeTeaching {
    
    //controller conectada al servicio, servicio al repo y repo a la db
    @Autowired
    SExpeTeaching expeTeachServ;
    
    @GetMapping("lista")
    @ResponseBody 
    public List<ExpeTeaching> getExpeTeachings(){
        return expeTeachServ.getExpeTeachings();  
    }
    
    //para ver las experiencias 
    @GetMapping("find/{id}")
    @ResponseBody 
    public ExpeTeaching findExpeTeaching(@PathVariable int id){
        //si retorna vacío no pasa nada
        return expeTeachServ.findExpeTeaching(id);  
    }
    
    //@RequestBody es para recibir un cargo. Viene en un JSON
    @PostMapping ("new")
    @ResponseBody
    public String saveExpeTeaching(@RequestBody ExpeTeaching expeTeach){
        expeTeachServ.saveExpeTeaching(expeTeach);
        return "El cargo fue creado correctamente";
        //return ResponseEntity.ok().body(exper);
    } 

    //para editar
    @PutMapping("update/{id}")   
    public String updateExpeTeaching(@RequestBody ExpeTeaching expeTeach){
        expeTeachServ.updateExpeTeaching(expeTeach);
        return "El cargo se actualizó correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    @DeleteMapping("delete/{id}")
    public String deleteExpeTeaching(@PathVariable int id){
        expeTeachServ.deleteExpeTeaching(id);
        return "El cargo fue borrado correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    
    
}