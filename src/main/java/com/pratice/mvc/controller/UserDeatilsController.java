package com.pratice.mvc.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pratice.mvc.model.User;
import com.pratice.mvc.service.UserService;

@RestController
public class UserDeatilsController {

	@Autowired
	UserService userService;

	@GetMapping(path = "/getAll")
	public List<User> getAllUserDeatails() {

		return userService.getAll();
	}

	@GetMapping(path = "/getId/{id}")
	public List<User> getById(@PathVariable int id) {

		return userService.getById(id);
	}

	@PostMapping(path = "/save")
	public List<User> save(@RequestBody User user) {

		List<User> userList = userService.save(new User(0, user.getName(), user.getDOB()));
		System.out.println(userList);
		return userList;
	}
}
