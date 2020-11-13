package com.janu.dominos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.janu.dominos.dto.PizzaListResponse;
import com.janu.dominos.dto.PizzaRequest;
import com.janu.dominos.dto.PizzaResponse;
import com.janu.dominos.entity.Pizza;
import com.janu.dominos.repository.PizzaRepository;

@Service
public class PizzaServiceImpl implements PizzaService {
	
	@Autowired
	PizzaRepository  pizzaRepository;
	
	@Override
	public PizzaResponse savePizza(PizzaRequest request) {
		PizzaResponse response =new PizzaResponse();
		Pizza pizza = new Pizza();
		pizza.setPizzaCode(request.getPizzaCode());
		pizza.setName(request.getName());
		pizza.setLarge(request.getLarge());
		pizza.setMedium(request.getMedium());
		pizza.setSmall(request.getSmall());
		pizzaRepository.save(pizza);
		response.setMessage("Pizza added");
		response.setStatusCode("201");
		return response;
	
	}

	@Override
	public PizzaListResponse listAllPizza() {
		PizzaListResponse response = new PizzaListResponse();
		List<Pizza> pizzas = pizzaRepository.findAll();
		if(Optional.ofNullable(pizzas) != null) {
		response.setPizzas(pizzas);
		response.setMessage("List of pizzas");
		response.setStatusCode("200");
		} else {
			response.setMessage("no pizzas found");
		}
		return response;
	}

	@Override
	public PizzaListResponse listPizzaByName(String name) {
		PizzaListResponse response = new PizzaListResponse();
		List<Pizza> pizzas = pizzaRepository.findByNameContaining(name);
		if(Optional.ofNullable(pizzas).isPresent()) {
		response.setPizzas(pizzas);
		response.setMessage("List of pizzas");
		response.setStatusCode("200");
		} else {
			response.setMessage("no pizzas found");
		}
		return response;
	}

}





