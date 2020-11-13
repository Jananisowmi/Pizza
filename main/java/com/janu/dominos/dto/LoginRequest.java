package com.janu.dominos.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {
	
   private String emailId;
   private String passWord;

}
