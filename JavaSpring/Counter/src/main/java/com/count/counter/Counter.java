package com.count.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class Counter {
	@RequestMapping("/counter")
	
    public String index(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		if(session.getAttribute("count")== null )
		{	session.setAttribute("count", 0);
			
		}
		else {
			session.setAttribute("count", count.intValue()+1);
			
		}
	
        return "counter.jsp";

      
}
	@RequestMapping("/")
	public String welcome() {
	return "welcome.jsp";
}
}