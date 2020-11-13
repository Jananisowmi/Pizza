package com.janu.dominos.service;


import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.janu.dominos.dto.OrderRequest;
import com.janu.dominos.dto.OrdersResponse;
import com.janu.dominos.entity.Orders;
import com.janu.dominos.entity.Price;
import com.janu.dominos.repository.OrdersRepository;
import com.janu.dominos.repository.PizzaRepository;
import com.janu.dominos.repository.PriceRpository;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrdersRepository ordersRepository;
	
	@Autowired
	PizzaRepository pizzaRepository;
	
	@Autowired
	PriceRpository priceRepository;

	@Override
	public OrdersResponse orderPizza(Integer userId, OrderRequest request) {
		OrdersResponse response = new OrdersResponse();
		Orders order = new Orders();
		Price price = priceRepository.findPriceByPizzaCode(request.getPizzaCode());
		
		if(request.getType().equals("MEDIUM")) {
			order.setPrice(request.getQuantity() * price.getMedium());
			order.setType(request.getType());
		}
		else if (request.getType().equals("SMALL")) {
			order.setPrice(request.getQuantity() * price.getSmall());
			order.setType(request.getType());
		}else {

		order.setPrice(request.getQuantity() * price.getLarge());
		order.setType(request.getType());
		}
		
		
		order.setPizzaCode(request.getPizzaCode());
		order.setQuantity(request.getQuantity());
		order.setTimeStamp(new Date());
		order.setStatus("ORDERED");
		order.setUserId(userId);
		order.setOtp("JAANU28");
		order.setOrderCode("JAANU-123");
		Orders savedOrder = ordersRepository.save(order);
		
		if(Optional.ofNullable(savedOrder).isPresent()) {
			response.setMessage("Order placed successfully . please enter the otp for confirmation");
			response.setStatusCode("201");
		}
		
		
		return response;
	}

}
