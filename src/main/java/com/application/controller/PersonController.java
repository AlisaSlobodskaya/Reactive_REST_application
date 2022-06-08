package com.application.controller;

import com.application.entity.Person;
import com.application.service.impl.PersonServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/persons")
public class PersonController {
    private final PersonServiceImpl personService;

    @GetMapping
    public Flux<Person> getAllPersons() {
        return personService.findAllPersons();
    }

    @GetMapping("/id/{id}")
    public Mono<Person> findPersonById(@PathVariable long id) {
        return personService.findPersonById(id);
    }

    @GetMapping("/fullName/{fullName}")
    public Flux<Person> findPersonByFullName(@PathVariable String fullName) {
        return personService.findPersonByFullName(fullName);
    }
}
