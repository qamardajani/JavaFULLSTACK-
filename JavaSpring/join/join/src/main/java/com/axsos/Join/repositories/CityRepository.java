package com.axsos.Join.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.axsos.Join.models.City;

public interface CityRepository extends CrudRepository<City, Long>{
	List<City> findAll();
	@Query(value="SELECT cities.name,cities.population from cities  join countries on country_id=countries.id where cities.population >=500000 and countries.name=\"Mexico\" order by cities.population DESC", nativeQuery=true)
	List<City> mexicanCities();
	@Query(value="SELECT countries.name,cities.name,cities.population,cities.district FROM cities JOIN countries ON countries.code=cities.country_code where cities.population >=500000 AND cities.district=\"Buenos Aires\"", nativeQuery=true)
	List<Object[]> argentinaBuenosAires();
}
