package com.axsos.dojo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.axsos.dojo.models.Ninja;

public interface ninjaRepository extends CrudRepository <Ninja,Long> {
	List<Ninja> findAll();
	Optional <Ninja> findById(Long id);
}
