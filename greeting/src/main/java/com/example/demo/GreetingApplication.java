package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingApplication {

	public static void main(String[] args) {
		//Start spring application - telling which is out server application
		SpringApplication.run(GreetingApplication.class, args);
	}

}
