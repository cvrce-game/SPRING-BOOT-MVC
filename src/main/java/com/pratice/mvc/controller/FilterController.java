package com.pratice.mvc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.pratice.mvc.model.SomeBean;

@RestController
@RequestMapping("/controller")
public class FilterController {

	@GetMapping("/filter")
	@Bean
	public SomeBean filter() {
		return new SomeBean("1", "2", "3");
	}
}
