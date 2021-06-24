package com.axsos.Language.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.Language.models.Language;
import com.axsos.Language.repositories.languageRepository;



@Service
public class LanguageServices {
	private final languageRepository langRepository;
	
public LanguageServices(languageRepository langRepository) {
	this.langRepository=langRepository;
	
}
   public List<Language> allLanguage() {
	  return langRepository.findAll();
	  }
   public  Language createLanguage(Language language) {
	   return langRepository.save(language);
   }
   public Language findLang(Long id) {
	   Optional<Language> findLang = langRepository.findById(id);
	   if(findLang.isPresent()) {
        return findLang.get();
    } else {
    	return null;
    }
        
   }
   public Language update(Long id ,String name , String creator , Integer vesrion ) {
	   Optional<Language> language = langRepository.findById(id);
	   if(language.isPresent()) {
		   language.get().setName(name);
		   language.get().setCreator(creator);
		   language.get().setVersion(vesrion);
		   
        return language.get();
    } else {
    	return null;
    } 
   }
   public void destroy(Long id ) {
	   Optional<Language> language = langRepository.findById(id);
		if (language.isPresent()) {
			langRepository.deleteById(id);
		}
   }
}
	   
	   
   


	

