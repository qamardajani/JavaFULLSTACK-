package com.axsos.relation.services;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.axsos.relation.models.License;
import com.axsos.relation.models.Person;
import com.axsos.relation.repositories.licenseRepository;
import com.axsos.relation.repositories.personRepository;


@Service
public class pesronServices {
	private final personRepository personRepo;
	private final licenseRepository licenseRepo;
	private  Integer count=0;
	public pesronServices(personRepository personRepo,licenseRepository licenseRepo) {

		this.personRepo = personRepo;
		this.licenseRepo=licenseRepo;
		
	}
	public List<Person> allPersons() {
		return personRepo.findAll();
	}
	
	public Person create(Person person) {
		return personRepo.save(person);
	}
	public Person getPerson(Long id) {
		return personRepo.findById(id).orElse(null);
}

	public License createLicense (String state ,Person person , Date expirationDate)
	{
		License licenses =  new License();
		licenses.setNumber(counter());
		licenses.setPerson(person);
		licenses.setState(state);
		licenses.setExpirationDate(expirationDate);
		return licenseRepo.save(licenses);
		
	}
	public String counter() {
		count=1+count;
		String c=String.valueOf(count);
		return c;
	}
}
	
