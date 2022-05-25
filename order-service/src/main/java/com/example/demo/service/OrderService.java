package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.OrderVO;

public interface OrderService {

	public void saveOrder(OrderVO ordervo);

	public List<OrderVO> getOrders();

}
