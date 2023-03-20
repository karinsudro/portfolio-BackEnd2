package com.miportfolio.karin.service;

import com.miportfolio.karin.entity.Persona;
import com.miportfolio.karin.repository.RPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SPersona {
    
    //para hacer inyección de dependencias sin crear tantas instancias con new
    @Autowired  
    RPersona persoRepo;

    //Endpoints
    public List<Persona> getPersonas() {
        return persoRepo.findAll();
    }
    
    //si no encuentra la persona retorna null
    public Persona findPersona(Integer id) {
        return persoRepo.findById(id).orElse(null);   
    }
    
    //ya no hay create, sino q modifica lo q hay y si no hay, lo crea
    public void savePersona(Persona per) {
        persoRepo.save(per);  
    }

    //mismo que create
    public void updatePersona(Persona pers) {
        persoRepo.save(pers);
    }
    
    public void deletePersona(Integer id) {
        persoRepo.deleteById(id);
    }
    
   //Login
    //public Persona loginPersona(String email, String clave) {
    //    List <Persona> personas = persoRepo.findByEmailAndClave(email, clave);
    //    if(!personas.isEmpty()){
    //        return personas.get(0); //si la lista no esta vacía ,e devuelve la de la posición 0
    //    }
    //    return null;
    //}
    
    //login con dto
    public PersonaDto login(String email, String clave){
	Persona persona = persoRepo.findByEmailAndClave(email, clave);
	PersonaDto personaDto = new PersonaDto(persona.getId(), persona.getHola(), persona.getNombre(), persona.getApellido(),persona.getCargo());
	return personaDto;
    }
    
}