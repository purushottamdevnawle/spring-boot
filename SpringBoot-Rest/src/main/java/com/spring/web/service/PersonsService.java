package com.spring.web.service;

import com.spring.web.controller.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonsService {

    private List<Person> personList = new ArrayList<>();

    public PersonsService() {
        personList.addAll(List.of(new Person("Purushottam", "Nawle", 40), new Person("Kaustubh", "K", 25)));
    }

    public List<Person> getPersons() {
        return personList;
    }

    public Person addPerson(Person person) {
        personList.add(person);
        return person;
    }
}
