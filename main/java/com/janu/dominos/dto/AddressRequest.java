package com.janu.dominos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressRequest {
	
	private String doorNumber;
	private String street;
	private Integer potalCode;
	private String landMark;
	private String city;

}
