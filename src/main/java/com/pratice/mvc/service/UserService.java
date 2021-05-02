package com.pratice.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pratice.mvc.model.User;

@Service
public interface UserService {

	public List<User> getAll();

	public List<User> save(User user);

	public User getById(int id);
}
