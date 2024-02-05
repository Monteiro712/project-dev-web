package br.edu.iff.gamekingdom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.iff.gamekingdom.entities.Person;
import br.edu.iff.gamekingdom.entities.GameLibrary;
import br.edu.iff.gamekingdom.repository.PersonRepository;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person findPersonByName(String name) {
        return personRepository.findByName(name);
    }

}
