package com.axsos.dojo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.axsos.dojo.models.Dojo;

public interface dojoRepository extends CrudRepository <Dojo , Long> {
	List<Dojo> findAll();
	Optional <Dojo> findById(Long id);
}
