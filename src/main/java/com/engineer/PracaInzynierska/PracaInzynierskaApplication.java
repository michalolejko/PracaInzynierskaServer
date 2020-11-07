package com.engineer.PracaInzynierska;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracaInzynierskaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracaInzynierskaApplication.class, args);
	}
/*
	@GetMapping("/hello")
	public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}*/
}
