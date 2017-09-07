package com.tutorial.lekcija21.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("croatian")
public class GreetingServiceCroatian implements GreetingService {

	@Override
	public String sayHello(String yourName) {

		return "Pozdrav, " + yourName;
	}

}
