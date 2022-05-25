package com.lab.poc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lab.poc.dto.User;
import com.lab.poc.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;

	@PostMapping("/user")
	public ResponseEntity<User> createOrder(@RequestBody @Valid User user) {

	return new ResponseEntity<>(service.saveUser(user),HttpStatus.OK);

	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getOrders() {

	return new ResponseEntity<>(service.getUsers(),HttpStatus.OK);

	}

}
