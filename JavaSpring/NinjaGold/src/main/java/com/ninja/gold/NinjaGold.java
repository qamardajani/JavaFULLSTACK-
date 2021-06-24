package com.ninja.gold;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NinjaGold {
@RequestMapping("/")
	public String ninja () {
	
	return "gold.jsp";
}
@RequestMapping("/pocess_money")
	public String gold () {
	
	
}
	
	
}