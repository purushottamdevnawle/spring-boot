package com.spring.web.mustache.rest;

import com.spring.web.mustache.controller.Person;
import com.spring.web.mustache.service.PersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
