package com.miportfolio.karin.controller;

import com.miportfolio.karin.entity.ExpeDesign;
import com.miportfolio.karin.service.SExpeDesign;
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
@RequestMapping("expeDesign/") //localhost:8080/expeDesign
public class CExpeDesign {
    
    //controller conectada al servicio, servicio al repo y repo a la db
    @Autowired
    SExpeDesign expeDesServ;
    
    @GetMapping("lista")
    @ResponseBody 
    public List<ExpeDesign> getExpeDesigns(){
        return expeDesServ.getExpeDesigns();  
    }
    
    //para ver las experiencias 
    @GetMapping("find/{id}")
    @ResponseBody 
    public ExpeDesign findExpeDesign(@PathVariable int id){
        //si retorna vacío no pasa nada
        return expeDesServ.findExpeDesign(id);  
    }
    
    //@RequestBody es para recibir un cargo. Viene en un JSON
    @PostMapping ("new")
    @ResponseBody
    public String saveExpeDesign(@RequestBody ExpeDesign expeDe){
        expeDesServ.saveExpeDesign(expeDe);
        return "El cargo fue creado correctamente";
        //return ResponseEntity.ok().body(exper);
    } 

    //para editar
    @PutMapping("update/{id}")   
    public String updateExpeDesign(@RequestBody ExpeDesign expeDe){
        expeDesServ.updateExpeDesign(expeDe);
        return "El cargo se actualizó correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    @DeleteMapping("delete/{id}")
    public String deleteExpeDesign(@PathVariable int id){
        expeDesServ.deleteExpeDesign(id);
        return "El cargo fue borrado correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    
}