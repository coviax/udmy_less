package com.tutorial.lekcija24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Lekcija24Application {

	//TODO lekcija 24
	public static void main(String[] args) {
		SpringApplication.run(Lekcija24Application.class, args);
	}
}

/**
 * Test Controller 
 * @author dpondeljak
 *
 */
@RestController
@RequestMapping(path = "/")
class TestController {
	
	@RequestMapping(value = "hello/{name}", method = RequestMethod.GET)
	public String hello(@PathVariable(value="name") String name) {
		return "Pozdrav, " + name;
	}
	
	

}