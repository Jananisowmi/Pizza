package com.janu.dominos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PizzaRequest {
	
	private String pizzaCode;
	private String name;
	private Integer medium;
	private Integer large;
	private Integer small;
	

}
