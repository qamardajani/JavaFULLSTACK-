package com.fim.route;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DojoController{
//public static void main(String[] args) {
//	SpringApplication.run(DojoController.class, args);
//}

	@RequestMapping("/{name}")
	public String dojo(@PathVariable("name") String name) {

		if ( name.equals("dojo")) {
			return "the" + name +" is awsome !" ;
		}
		else if ( name.equals("burbank-dojo")){
			return "Burbank Dojo is located in Southern California";
				}
	
	else if ( name.equals("san-jose")) {
		return "SJ dojo is the headquarters";
	}
	else {
		return "no dojo";
	}
}
}