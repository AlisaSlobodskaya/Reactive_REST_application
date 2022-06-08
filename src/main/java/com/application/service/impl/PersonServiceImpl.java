package com.application.service.impl;

import com.application.entity.Person;
import com.application.repository.PersonRepository;
import com.application.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    @Override
    public Flux<Person> findAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public Mono<Person> findPersonById(long id) {
        return personRepository.findPersonByPersonId(id);
    }

    @Override
    public Flux<Person> findPersonByFullName(String fullName) {
        return personRepository.findPersonByFullName(fullName);
    }
}
