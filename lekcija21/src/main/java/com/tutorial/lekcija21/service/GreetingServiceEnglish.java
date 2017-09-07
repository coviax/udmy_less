package com.tutorial.lekcija21.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("english")
public class GreetingServiceEnglish implements GreetingService {

	@Override
	public String sayHello(String yourName) {
		
		return "Hello, " + yourName;
	}

}
