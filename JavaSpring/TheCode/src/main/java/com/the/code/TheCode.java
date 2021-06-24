package com.the.code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller 
public class TheCode {
	 @RequestMapping("/")
	 public String code() {
		 return "code.jsp";
	 }
	
	
	
    @RequestMapping(value="/code", method=RequestMethod.POST)
    public String code(@RequestParam(value="code") String code,RedirectAttributes redirectAttributes) {
    	if (code.equals("bushido")) {
    	
    		return "result.jsp" ;
    	
    	}
 
 
    redirectAttributes.addFlashAttribute("error", "You Must train harder");
    
        return "redirect:/";
    }
}

