package com.example.demo.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.OrderVO;
import com.example.demo.repository.OrderRepository;
import com.example.demo.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	RestTemplate template = new RestTemplate();

	private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Autowired
	OrderRepository repository;

	@Override
	public void saveOrder(OrderVO ordervo) {

		// template.getForEntity("http://localhost:8080/email?address=" +
		// ordervo.getEmail(), String.class);

		OrderVO orderovo = repository.save(ordervo);
		logger.info(ordervo.toString());

	}

	@Override
	public List<OrderVO> getOrders() {
		return repository.findAll();
	}

}
