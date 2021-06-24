package com.fim.route;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class CodingControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingControllerApplication.class, args);
	} @RequestMapping("/")
	public String hello() {
		return "index.jsp";
	}
	@RequestMapping("/coding/python")
	public  String hellopython() {
		return "Python/Django was awesome!";
	}
	@RequestMapping("/coding/java")
	public  String hellojava() {
		return "Java/Spring is better!";
	}
}
