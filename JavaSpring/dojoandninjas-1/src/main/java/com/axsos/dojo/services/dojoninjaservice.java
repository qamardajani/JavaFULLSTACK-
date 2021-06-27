package com.axsos.dojo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.dojo.models.Dojo;
import com.axsos.dojo.models.Ninja;
import com.axsos.dojo.repositories.dojoRepository;
import com.axsos.dojo.repositories.ninjaRepository;

@Service
public class dojoninjaservice {

	private final dojoRepository dojoRepo;
	private final ninjaRepository ninjaRepo;
	
	public dojoninjaservice (dojoRepository dojoRepo , ninjaRepository ninjaRepo) {
		this.dojoRepo=dojoRepo;
		this.ninjaRepo=ninjaRepo;
		
	}
	public List<Dojo> alldojos() {
		return dojoRepo.findAll();
	}
	
	public Dojo createdojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	public List<Ninja> allninja() {
		return ninjaRepo.findAll();
	}
	
	public Ninja create(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	 
	
	 public	Dojo finddojo(Long id) {
		 Optional<Dojo> dojo=dojoRepo.findById(id);
	     return dojo.get();
	    }
	 public	Ninja findNinja(Long id) {
		 Optional<Ninja> ninja=ninjaRepo.findById(id);
	     return ninja.get();
	    }
	 
	
}
