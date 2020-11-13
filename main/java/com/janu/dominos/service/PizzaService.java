package com.janu.dominos.service;

import com.janu.dominos.dto.PizzaListResponse;
import com.janu.dominos.dto.PizzaRequest;
import com.janu.dominos.dto.PizzaResponse;

public interface PizzaService {

	PizzaResponse savePizza(PizzaRequest request);

	PizzaListResponse listAllPizza();

	PizzaListResponse listPizzaByName(String name);

}
