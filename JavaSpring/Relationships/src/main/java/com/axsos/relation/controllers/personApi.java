package com.axsos.relation.controllers;

import java.sql.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.axsos.relation.models.Person;
import com.axsos.relation.services.pesronServices;

@Controller
public class personApi {
	private final  pesronServices personservice;

	public personApi(pesronServices personservice) {
		this.personservice = personservice;
	}
	@RequestMapping("/new")
	 public String index(Model model) {
    	List<Person> person = personservice.allPersons();
        model.addAttribute("person", person);
        return "newperson.jsp";
    }

  
	@RequestMapping(value="/new", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("person")Person person, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:/";
        } else {
        	personservice.create(person);
            return "redirect:/persons/"+person.getId();
        }
	}

        @RequestMapping("/persons/{id}")
    	public String ShowPerson(@PathVariable("id") Long id, Model model) {
    		Person person = personservice.getPerson(id);
    	
        	model.addAttribute("person", person);
    		return "show.jsp";
    	}

    	@RequestMapping("/license/new")
    	public String licenseIndex(Model model) {
    		List<Person> person = personservice.allPersons();
    		model.addAttribute("person", person);
    		return "newlicense.jsp";
    	}
    	@RequestMapping(value="/license/new", method=RequestMethod.POST)
    	public String addLicense (@Valid @ModelAttribute(value ="person")Person person, 
    			@ModelAttribute(value ="state")String state,
    			@ModelAttribute(value ="expirationDate") Date expirationDate) {
    			personservice.createLicense(state,person,expirationDate) ;
    			return "redirect:/new";
    			
    			
    	
    	}
    	
    			
        }
	

	


