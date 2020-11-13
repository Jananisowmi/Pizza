package com.janu.dominos.service;

import com.janu.dominos.dto.OrderRequest;
import com.janu.dominos.dto.OrdersResponse;

public interface OrderService {

	OrdersResponse orderPizza(Integer userId, OrderRequest request);
	
	

}
