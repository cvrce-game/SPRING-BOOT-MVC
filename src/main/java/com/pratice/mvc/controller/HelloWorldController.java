package com.pratice.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	//GET
	//URI : "/hello"
	//method : helloWorld
	@GetMapping(path = "/hello")
	public String helloWorld() {
		
		return "Hi";
		
	}
}
