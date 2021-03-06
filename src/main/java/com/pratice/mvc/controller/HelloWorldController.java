package com.pratice.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pratice.mvc.model.HelloWorldBean;

@RestController
public class HelloWorldController {

	//GET
	//URI : "/hello"
	//method : helloWorld
	@GetMapping(path = "/hello")
	public String helloWorld() {
		
		return "Hi";
		
	}
	
	@GetMapping(path = "/hello-bean")
	public HelloWorldBean helloWorldBean() {
		
		return new HelloWorldBean("Welcome");
		
	}
	
	@GetMapping(path = "/hello/pathvariable/{value}")
	public String helloPathVariable(@PathVariable String value) {
		
		return String.format("You sent this value : "+value);
		
	}
}
