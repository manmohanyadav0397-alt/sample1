package com.kodewala.service;

import org.springframework.stereotype.Service;

import com.kodewala.entity.OrderEntity;
import com.kodewala.repository.OrderRepository;
import com.kodewala.request.response.OrderRequest;

@Service
public class OrderService {
	
	private final OrderRepository orderRepository;
	
	public OrderService (OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public OrderEntity createOrder(OrderRequest request) {
		
		OrderEntity order = new OrderEntity();
		
		order.setCustomerId(request.getCustomerId());
		order.setCustomerName(request.getCustomerName());
		order.setProductId(request.getProductId());
		order.setProductName(request.getProductName());
		order.setQuantity(request.getQuantity());
		order.setAmount(request.getAmount());
		order.setDeliverAddress(request.getDeliveryAddress());
		order.setStatus("CREATED");
		
	   return orderRepository.save(order);
	}
}
