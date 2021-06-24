package com.axsos.relation.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.relation.models.Person;

@Repository
public interface personRepository extends CrudRepository <Person , Long> {

	List <Person> findAll();
}

