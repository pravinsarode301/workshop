package com.lab.poc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.poc.dto.User;
import com.lab.poc.repository.UserRespositiry;
import com.lab.poc.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRespositiry userRepo;

	@Override
	public User saveUser(User user) {
		
		return userRepo.save(user);

	}

	@Override
	public List<User> getUsers() {
		
		return userRepo.findAll();
	}

}
