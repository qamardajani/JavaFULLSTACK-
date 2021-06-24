package com.axsos.Language.controllers;
	
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.axsos.Language.models.Language;
import com.axsos.Language.services.LanguageServices;
	@Controller
	public class LanguageApi {
	    private final LanguageServices langServices;
	    public LanguageApi(LanguageServices langServices){
	        this.langServices = langServices;
	    }
	    @RequestMapping("/languages")
	    public String index(Model model) {
	    	Iterable<Language> language = langServices.allLanguage();
	        model.addAttribute("language", language);
	        return "main.jsp";
	    }
	    @RequestMapping(value="/new", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("language")Language language, BindingResult result) {
	        if (result.hasErrors()) {
	            return "redirect:/languages";
	        } else {
	        	langServices.createLanguage(language);
	            return "redirect:/languages";
	        }
	    }	    
	    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
	    public Language update(@PathVariable("id") Long id, @RequestParam(value="name") String name, @RequestParam(value="creator") String creator, @RequestParam(value="version") String version) {
	        Book book = bookService.updateBook( id ,name ,creator, version);
	        return book;
	    }
//	    
//	    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
//	    public void destroy(@PathVariable("id") Long id) {
//	        LanguageService.deleteLanguage(id);
//	    }
//	    @RequestMapping("/api/books/{id}")
//	    public String show(@PathVariable("id") Long id,Model model) {
//	        Language language =	languageServices.findLangu(id);
//	        model.addAttribute("book", book);
//	       
//	        return "/books/show.jsp";
//	    }
//	    
	}
