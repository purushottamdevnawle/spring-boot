package com.spring.web.controller;

import com.spring.web.service.PersonsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

    private final PersonsService personsService;

    public PersonController(PersonsService personsService) {
        this.personsService = personsService;
    }

    @GetMapping("/persons")
    public String listPersons(Model model) {
        model.addAttribute("persons", personsService.getPersons());
        return "persons";
    }

    @PostMapping("/person")
    public String addPerson(@ModelAttribute Person person) {
        personsService.addPerson(person);
        return "redirect:/persons";
    }
}
