package com.axsos.Join.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.axsos.Join.models.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {
	List<Country> findAll();
	@Query(value="SELECT countries.name, languages.language, languages.percentage FROM languages LEFT JOIN countries ON languages.country_code = countries.code WHERE language=\"Slovene\" ORDER BY languages.percentage DESC", nativeQuery=true)
	List<Object[]> findCountryByLangSolv();
	@Query(value="SELECT countries.name, COUNT(cities.id) FROM countries JOIN cities ON countries.code = cities.country_code GROUP BY countries.code ORDER BY COUNT(cities.id) desc", nativeQuery=true)
	List<Object[]> findCountryCityCount();
	@Query(value="SELECT c FROM Country c WHERE c.surfaceArea < 501 AND c.population > 100000 ORDER BY c.population DESC", nativeQuery=true)
	List<Country> findDenseCountries();
	@Query(value="SELECT name,  capital, life_expectancy,government_form FROM countries  WHERE government_form = 'Constitutional Monarchy' and capital > 200 and life_expectancy > 75", nativeQuery=true)
	List<Country> findConMonCountries();
	@Query(value="SELECT countries.region,count( countries.region) FROM countries where countries.region=countries.region group by countries.region ORDER BY count( countries.region) DESC", nativeQuery=true)
	List<Object[]> findCountryByRegion();
}
