package com.example.demo.service;

import com.example.demo.model.Users;

public interface UserService {

	void save(Users user);
	Users findByUsername(String username);
}
