package com.axsos.Language.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.Language.models.Language;

@Repository
public interface languageRepository extends  CrudRepository <Language , Long>{
	
	List<Language>  findAll();
	
}
