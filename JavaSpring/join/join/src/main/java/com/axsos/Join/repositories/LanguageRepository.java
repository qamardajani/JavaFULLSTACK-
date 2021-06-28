package com.axsos.Join.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.axsos.Join.models.Language;

public interface LanguageRepository extends CrudRepository<Language, Long> {
	List<Language> findAll();
	@Query(value="select countries.name,languages.percentage from countries join languages on country_id=countries.id where languages.percentage >=89 order by languages.percentage DESC", nativeQuery=true)
	List<Object[]> findCountryLangs();
	
}
