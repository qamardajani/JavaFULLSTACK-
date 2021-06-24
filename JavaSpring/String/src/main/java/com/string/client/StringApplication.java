package com.string.client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//1. Annotation
@RestController

@SpringBootApplication
public class StringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringApplication.class, args);
	}
	@RequestMapping("/")
	// 3. Method that maps to the request route above
    public String hello() { // 3
            return "Hello client! how are you ?";
    }

	@RequestMapping("/random")
	
	public String helloclient()
	{
	
	return " we are so glad to meet you !";

}
}
