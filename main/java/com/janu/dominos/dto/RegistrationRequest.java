package com.janu.dominos.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationRequest {
	
	private String userName;
	private String emailId;
	private String passWord;
	private Double phoneNumber;

}
