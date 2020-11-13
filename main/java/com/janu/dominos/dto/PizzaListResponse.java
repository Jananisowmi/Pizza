package com.janu.dominos.dto;

import java.util.List;

import com.janu.dominos.entity.Pizza;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PizzaListResponse {
	
	private String message;
	private String statusCode;
	
	List<Pizza> pizzas;

}
