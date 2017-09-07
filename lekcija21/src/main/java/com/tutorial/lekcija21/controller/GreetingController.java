package com.tutorial.lekcija21.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.lekcija21.service.GreetingService;

@RestController
@RequestMapping(path = "/")
public class GreetingController {

	@Autowired
	private GreetingService greetingService;
	
	@RequestMapping(path ="hello/{name}", method = RequestMethod.GET)
	public String hello(@PathVariable(value = "name" ) String yourName) {
	
		return greetingService.sayHello(yourName); 
	}
	
}
