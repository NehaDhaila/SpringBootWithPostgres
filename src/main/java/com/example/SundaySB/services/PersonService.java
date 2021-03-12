package com.example.SundaySB.services;

import com.example.SundaySB.entities.PersonEntity;
import com.example.SundaySB.repository.PersoneRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class PersonService {

    @Autowired
    PersoneRepository personeRepository;

    @Autowired
    EntityManager entityManager;

    public void savePerson(PersonEntity personEntity) {
       personeRepository.save(personEntity);
    }

    public List<PersonEntity> getAllPersons() {
        return personeRepository.findAll();
    }

    public Optional<PersonEntity> getPerson(Long id) {
        return personeRepository.findById(id);
    }

    public void deletePerson(Long id) {
        personeRepository.deleteById(id);
    }

    public void updatePerson(PersonEntity entity,Long id) {
        String name=entity.getName();
        String age=entity.getAge();
        String address=entity.getAddress();
        String mobile_number=entity.getMobile_number();
        String adhar_number=entity.getAdhar_number();
        System.out.println("name> "+name+" age> "+age+" add> "+address+" mob> "+mobile_number+" adh> "+ adhar_number);
       personeRepository.updatePerson(name,age,address,mobile_number,adhar_number,id);

    }
}
