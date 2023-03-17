package com.miportfolio.karin.controller;

import com.miportfolio.karin.entity.Project;
import com.miportfolio.karin.service.SProject;
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
@RequestMapping("project/") //localhost:8080/project
public class CProject {
    
    //controller conectada al servicio, servicio al repo y repo a la db
    @Autowired
    SProject projectServ;
    
    @GetMapping("lista")
    @ResponseBody 
    public List<Project> getProjects(){
        return projectServ.getProjects();  
    }
    
    //para ver las carreras 
    @GetMapping("find/{id}")
    @ResponseBody 
    public Project findProject(@PathVariable int id){
        //si retorna vacío no pasa nada
        return projectServ.findProject(id);  
    }
    
    //@RequestBody es para recibir un proyecto nuevo. Viene en un JSON
    @PostMapping ("new")
    @ResponseBody
    public String saveProject(@RequestBody Project proj){
        projectServ.saveProject(proj);
        return "El proyecto fue creado correctamente";   
        //return ResponseEntity.ok().body(proj);
    }
  
    //para editar
    @PutMapping("update/{id}")   
    public String updateProject(@RequestBody Project proj){
        projectServ.updateProject(proj);
        return "El proyecto se actualizó correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    @DeleteMapping("delete/{id}")
    public String deleteProject(@PathVariable int id){
        projectServ.deleteProject(id);
        return "El proyecto fue borrado correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    
}