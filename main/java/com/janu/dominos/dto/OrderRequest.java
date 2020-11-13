package com.janu.dominos.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
	
	
	private String pizzaCode;
	private Integer quantity;
	private String type;
	 
		 
}