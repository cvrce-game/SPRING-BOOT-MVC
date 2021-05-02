package com.pratice.mvc.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.pratice.mvc.model.User;

@Component
public class UserServiceImpl implements UserService {

	private List<User> userList = new ArrayList<User>(10);
	int id = 0;

	@PostConstruct
	public void init() {
		id++;
		userList.add(new User(1, "Papun", new Date()));
		id++;
		userList.add(new User(2, "Papun2", new Date()));
		id++;
		userList.add(new User(3, "Papun3", new Date()));
	}

	@Override
	public List<User> getAll() {

		return this.userList;
	}

	@Override
	public List<User> getById(int id) {
		return userList.stream().filter(user -> user.getId() == id).collect(Collectors.toList());
	}

	@Override
	public List<User> save(User user) {
		if (user.getId() == 0) {
			id++;
		}
		userList.add(new User(id, user.getName(), user.getDOB()));
		return userList;
	}
}
