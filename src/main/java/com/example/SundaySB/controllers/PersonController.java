package com.example.SundaySB.controllers;
import com.example.SundaySB.entities.PersonEntity;
import com.example.SundaySB.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
public class PersonController {

    @Autowired
    PersonService personService;
    @RequestMapping("/home")
    public String home(){
        return "Hellooo";
    }
    @PostMapping("/person")
    public String savePerson(@RequestBody PersonEntity personEntity){
        personService.savePerson(personEntity);
        return "successfully saved.";
    }
    @GetMapping("/getAllPersons")
    public List<PersonEntity> getAllPersons(){
        return personService.getAllPersons();
    }
    @GetMapping("/getPerson/{id}")
    public Optional<PersonEntity> getPerson(@PathVariable Long id){
        return personService.getPerson(id);
    }
    @DeleteMapping("/deletePerson/{id}")
    public String deletePerson(@PathVariable Long id){
        personService.deletePerson(id);
        return "successfully deleted.";
    }
    @PutMapping("/updatePerson/{id}")
    public void updatePerson(@RequestBody PersonEntity entity, @PathVariable Long id){
        personService.updatePerson(entity,id);
    }

}
