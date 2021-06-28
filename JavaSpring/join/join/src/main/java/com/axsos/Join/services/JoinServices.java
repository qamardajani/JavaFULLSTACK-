package com.axsos.Join.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.Join.models.City;
import com.axsos.Join.models.Country;
import com.axsos.Join.models.Language;
import com.axsos.Join.repositories.CityRepository;
import com.axsos.Join.repositories.CountryRepository;
import com.axsos.Join.repositories.LanguageRepository;

@Service
public class JoinServices {
	@Autowired
	private CountryRepository cRepo;
	@Autowired
	private CityRepository ciRepo;
	@Autowired
	private LanguageRepository lRepo;
	public List<Country> getCountries() {
		return this.cRepo.findConMonCountries();
	}
	public List<City> getCities() {
		return this.ciRepo.findAll();
	}
	public List<Language> getLanguages() {
		return this.lRepo.findAll();
	}
	public List<Object[]> getCountryByLanguageSolv() {
		return this.cRepo.findCountryByLangSolv();
	}
	public List<Object[]> getCountryByRegion() {
		return this.cRepo.findCountryByRegion();
	}
	public List<Object[]> getCountriesByCityCount() {
		return this.cRepo.findCountryCityCount();
	}
	public List<Object[]> getCountryLanguagues() {
		return this.lRepo.findCountryLangs();
	}
	public List<City> getMexicanCities() {
		return this.ciRepo.mexicanCities();
	}
	public List<Object[]> getBuenosAiresCities() {
		return this.ciRepo.argentinaBuenosAires();
	}
	public List<Country> getDenseCountries(){
		return this.cRepo.findDenseCountries();
	}
}




