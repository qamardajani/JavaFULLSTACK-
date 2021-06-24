package com.dojo.survey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoSurvey {
	@RequestMapping("/")
	public String dojo( ) {
		return "info.jsp";
	}

	  @RequestMapping(value="/result", method=RequestMethod.POST)
	  public String result(@RequestParam(value="username") String user, 
			  @RequestParam(value="dojolocation") String dojolocation,
			  @RequestParam(value="favlan") String favlan,
			  @RequestParam(value="comment") String comment ,Model model) {
		  model.addAttribute("username", user);
		  model.addAttribute("dojolocation", dojolocation);
		  model.addAttribute("favlan", favlan);
		  model.addAttribute("comment", comment);
	           
	            return "result.jsp";
	      }
}
	
	