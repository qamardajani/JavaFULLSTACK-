package com.axsos.dojo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.axsos.dojo.models.Dojo;
import com.axsos.dojo.models.Ninja;
import com.axsos.dojo.services.dojoninjaservice;

@Controller
public class dojoninjaApi {

	private final dojoninjaservice dojoninjaservices;

	public dojoninjaApi(dojoninjaservice dojoninjaservices) {
		
		this.dojoninjaservices = dojoninjaservices;
	}
	@RequestMapping("/dojos/new" )
	public String newdojo()
	{
		return "newdojo.jsp";
	}
	
	
	@RequestMapping( value ="/dojos/new" , method=RequestMethod.POST)
	public String createdojo(@Valid@ModelAttribute("dojo")Dojo dojo )
	{
		dojoninjaservices.createdojo(dojo);
	   
		return "redirect:/dojos/new";
	}

	
	@GetMapping("/ninjas/new")
	public String ninja(@ModelAttribute("ninja")Ninja ninja , Model model)
	{
		List<Dojo> dojo = dojoninjaservices.alldojos();
    model.addAttribute("dojo", dojo);
		return "newninja.jsp";
	}
	@PostMapping("/ninjas/new")
	public String createNinja(@Valid@ModelAttribute("ninja")Ninja ninja,BindingResult result ) {
		if(result.hasErrors()) {
			return "newninja.jsp";
		}
		else {
				dojoninjaservices.create(ninja);
	            return "redirect:/ninjas/new";
				
			}
		}
	@RequestMapping("/dojos/{id}")
	
		public String show (@PathVariable("id") Long id , Model model) {
		Dojo dojo=dojoninjaservices.finddojo(id);
		model.addAttribute("dojo", dojo);
		return "show.jsp";
		}
	
	}


