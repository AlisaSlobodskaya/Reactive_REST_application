package com.application.repository;

import com.application.entity.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface PersonRepository extends ReactiveCrudRepository<Person, Long> {
    Mono<Person> findPersonByPersonId(long id);
    Flux<Person> findPersonByFullName(String fullName);
}
