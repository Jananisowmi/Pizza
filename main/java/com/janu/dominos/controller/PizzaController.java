package com.janu.dominos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.janu.dominos.dto.PizzaListResponse;
import com.janu.dominos.dto.PizzaRequest;
import com.janu.dominos.dto.PizzaResponse;
import com.janu.dominos.service.PizzaService;

@RestController
public class PizzaController {
	
	
	@Autowired
	PizzaService pizzaService;
	
	@PostMapping("/pizza")
	public ResponseEntity<PizzaResponse> savePizza(@RequestBody PizzaRequest request){
		PizzaResponse response = pizzaService.savePizza(request);
		return new ResponseEntity<PizzaResponse>(response, HttpStatus.OK);
		
	}

	
	@GetMapping("/pizzas")
	public ResponseEntity<PizzaListResponse> listAllPizzas(){
		PizzaListResponse response = pizzaService.listAllPizza();
		return new ResponseEntity<PizzaListResponse>(response,HttpStatus.OK);
		
	}
	
	@GetMapping("/pizzas/{name}")
	public ResponseEntity<PizzaListResponse> listPizzaByName(@PathVariable String name){
		PizzaListResponse response = pizzaService.listPizzaByName(name);
		return new ResponseEntity<PizzaListResponse>(response,HttpStatus.OK);
		
	}
	
	
	
	
	
	
	
	
	
}
