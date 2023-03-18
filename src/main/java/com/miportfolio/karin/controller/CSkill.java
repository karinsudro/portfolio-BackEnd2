package com.miportfolio.karin.controller;

import com.miportfolio.karin.entity.Skill;
import com.miportfolio.karin.service.SSkill;
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
<<<<<<< HEAD
@CrossOrigin(origins = "https://portfolio-karinsd.web.app/")
//@CrossOrigin(origins = "http://localhost:4200") //xq se cruza con angular, desp se cambia por firebase
=======
//@CrossOrigin(origins = "http://localhost:4200") //xq se cruza con angular, desp se cambia
@CrossOrigin(origins = "https://portfolio-karinsd.web.app/")
>>>>>>> 3b72263ccfe97bd336ae397f82af8477d2ecd248
@RequestMapping("skill/") //localhost:8080/skill
public class CSkill {
    
    //controller conectada al servicio, servicio al repo y repo a la db
    //@Autowired
    //SSkillTipo skilltipoServ;
    
    @Autowired
    SSkill skillServ;
    
    
    //Endpoints
    @GetMapping("lista")
    @ResponseBody 
    public List<Skill> getSkills(){
        return skillServ.getSkills();  
    }
    
    //para ver las habilid 
    @GetMapping("find/{id}")
    @ResponseBody 
    public Skill findSkill(@PathVariable int id){
        //si retorna vacío no pasa nada
        return skillServ.findSkill(id);  
    }
    
    //@RequestBody es para recibir una habilidad nueva. Viene en un JSON
    @PostMapping ("new")
    @ResponseBody
    public String saveSkill(@RequestBody Skill habil){
        skillServ.saveSkill(habil);
        return "La habilidad fue creada correctamente";
        //return ResponseEntity.ok().body(habil);
    
    }
    
    //para editar
    @PutMapping("update/{id}")   
    public String updateSkill(@RequestBody Skill habil){
        skillServ.updateSkill(habil);
        return "La habilidad se actualizó correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    @DeleteMapping("delete/{id}")
    public String deleteSkill(@PathVariable int id){
        skillServ.deleteSkill(id);
        return "La habilidad fue borrada correctamente";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    
    
    
    //según la relac one to many, en el lado del many se pone ???
    //@GetMapping("/find/skilltipo/{id}/skill")
    //public List<Skill> getSkillsBySkillTipo(@PathVariable int id){
     //   return skillServ.getSkillsBySkillTipo(id);
    //}
    
}