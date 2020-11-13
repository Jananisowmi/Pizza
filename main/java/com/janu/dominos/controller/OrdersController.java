package com.janu.dominos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.janu.dominos.dto.OrderRequest;
import com.janu.dominos.dto.OrdersResponse;
import com.janu.dominos.service.OrderService;

@RestController
public class OrdersController {
	
	@Autowired
	OrderService orderService;
	
	
	@PostMapping("/order/{userId}")
	public ResponseEntity<OrdersResponse> orderPizza(@PathVariable(name="userId") Integer userId,@RequestBody OrderRequest request){
		OrdersResponse response = orderService.orderPizza(userId,request);
		
		return new  ResponseEntity<OrdersResponse>(response, HttpStatus.CREATED);
		
	}
}
