package com.spring.web.rest;

import com.spring.web.controller.Person;
import com.spring.web.service.PersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonsRestController {

    @Autowired
    private PersonsService personsService;

    @GetMapping("/api/persons")
    public List<Person> getPersons() {
        return personsService.getPersons();
    }

    @PostMapping("/api/person")
    public Person create(@RequestBody Person person) {
        return personsService.addPerson(person);
    }
}
