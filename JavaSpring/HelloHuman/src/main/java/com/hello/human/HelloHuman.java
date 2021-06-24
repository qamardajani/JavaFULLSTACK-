package com.hello.human;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloHuman {
	

	@RequestMapping("/")
    public String welcome(@RequestParam(value="name" , required= false) String searchQuery) {
       
	
		if (searchQuery ==null)
		{
			return "Hello Human!";
		}
		else {
			return "Hello " + searchQuery + "!";
		}
        
    }

}
