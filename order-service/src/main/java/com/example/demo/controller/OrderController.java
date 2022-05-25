package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.OrderVO;
import com.example.demo.service.impl.OrderServiceImpl;

@RestController
public class OrderController {

	@Autowired
	OrderServiceImpl service;

	@PostMapping("/order")
	public void createOrder(@Valid @RequestBody OrderVO ordervo) {

		service.saveOrder(ordervo);

	}

	@GetMapping("/orders")
	public List<OrderVO> getOrders(@RequestBody @Valid OrderVO ordervo) {

		return service.getOrders();

	}

}
