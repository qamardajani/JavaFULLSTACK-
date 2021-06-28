package com.axsos.Join.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axsos.Join.models.City;
import com.axsos.Join.models.Country;
import com.axsos.Join.models.Language;
import com.axsos.Join.services.JoinServices;

@RestController
public class JoinController {
	@Autowired
	private JoinServices wService;
	@GetMapping("/")
	public List<Country> Index() {
		return this.wService.getCountries();
	}
	@GetMapping("/Solv")
	public List<Object[]> CountryByNameSolv() {
		return this.wService.getCountryByLanguageSolv();
	}
	@GetMapping("/cityCount")
	public List<Object[]> CountryByCityCount() {
		return this.wService.getCountriesByCityCount();
	}
	@GetMapping("/region")
	public List<Object[]> CountryByRegion() {
		return this.wService.getCountryByRegion();
	}
	@GetMapping("/city")
	public List<City> Cities() {
		return this.wService.getCities();
	}
	@GetMapping("/mexico")
	public List<City> MexicanCities() {
		return this.wService.getMexicanCities();
	}
	@GetMapping("/arg")
	public List<Object[]> BACities() {
		return this.wService.getBuenosAiresCities();
	}
	@GetMapping("/l")
	public List<Language> Languages() {
		return this.wService.getLanguages();
	}
	@GetMapping("/countrylang")
	public List<Object[]> CountryLangs() {
		return this.wService.getCountryLanguagues();
	}
}

