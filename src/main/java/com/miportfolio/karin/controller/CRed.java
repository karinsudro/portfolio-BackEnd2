package com.miportfolio.karin.controller;

import com.miportfolio.karin.entity.Red;
import com.miportfolio.karin.service.SRed;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
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
@RequestMapping("red/") //localhost:8080/red
public class CRed {
    
    //controller conectada al servicio, servicio al repo y repo a la db
    @Autowired
    SRed redServ;
    
    @GetMapping("lista")
    @ResponseBody 
    public List<Red> getRedes(){
        return redServ.getRedes();  
    }
    
    //para ver las redes 
    @GetMapping("find/{id}")
    @ResponseBody 
    public Red findRed(@PathVariable int id){
        //si retorna vacío no pasa nada
        return redServ.findRed(id);  
    }
    
    //@RequestBody es para recibir una red nueva. Viene en un JSON
    @PostMapping ("new")
    @ResponseBody
    public String saveRed(@RequestBody Red redes){
        redServ.saveRed(redes);
        return "La red fue creada correctamente";
            //return ResponseEntity.ok().body(redes);
    
    }
    
    
    //para editar
    @PutMapping("update/{id}")   
    public String updateRed(@RequestBody Red redes){
        redServ.updateRed(redes);
        return "La red se actualizó correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    @DeleteMapping("delete/{id}")
    public String deleteRed(@PathVariable int id){
        redServ.deleteRed(id);
        return "La red fue borrada correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    
}