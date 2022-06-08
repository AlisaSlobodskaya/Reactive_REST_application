package com.application.service;

import com.application.entity.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonService {
    Flux<Person> findAllPersons();

    Mono<Person> findPersonById(long id);

    Flux<Person> findPersonByFullName(String fullName);
}
