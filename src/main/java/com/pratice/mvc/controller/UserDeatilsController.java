package com.pratice.mvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pratice.mvc.exception.IdNotFoundException;
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
	public ResponseEntity<?> getById(@PathVariable int id) {
		User user = userService.getById(id);
		if (user == null) {
			throw new IdNotFoundException(id + ":Id Not Found");
		}
		return ResponseEntity.ok(user);
	}

	@PostMapping(path = "/save")
	public ResponseEntity<?> save(@RequestBody User user) {

		List<User> userList = userService.save(new User(0, user.getName(), user.getDOB()));
		System.out.println(userList);
		return ResponseEntity.ok(userList);
	}
}
