package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

//We can import the libraries bc we used maven and maven included the libraries in the pom.xml as dependencies bc we selected the dependency by selecting them in the creation on the website
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//Used to build RestAPI 
@RestController
public class GreetingController {
	//We need a controller for exp hiding some private information
	

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	//greeting is our resource 
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@PostMapping("/greeting")
	public Greeting createGreeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
