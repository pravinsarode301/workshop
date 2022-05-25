package com.lab.poc.service;

import javax.validation.Valid;

import com.lab.poc.dto.User;

import antlr.collections.List;

public interface UserService {

	java.util.List<User> getUsers();

	User saveUser(User user);

}
