package com.tutorial.lekcija21.service;

import org.springframework.stereotype.Component;

@Component
public interface GreetingService {

	String sayHello(String yourName);
}
