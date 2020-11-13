package com.janu.dominos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.janu.dominos.dto.LoginRequest;
import com.janu.dominos.dto.LoginResponse;
import com.janu.dominos.dto.RegistrationRequest;
import com.janu.dominos.dto.RegistrationResponse;
import com.janu.dominos.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/register")
	public ResponseEntity<RegistrationResponse> register(@RequestBody RegistrationRequest request) {
		RegistrationResponse response = userService.registration(request);
		System.out.println("Respone"+response);
		if(response.getMessage().equalsIgnoreCase("Your registration completed successfully")) {
			return new ResponseEntity<RegistrationResponse>(response, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
		}
		
	}
	
	@PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
		LoginResponse response = userService.loginUser(request);
		if(response.getMessage().equalsIgnoreCase("Login successfull")) {
			return new ResponseEntity<LoginResponse>(response,HttpStatus.ACCEPTED);
		}
		else if(response.getMessage().equalsIgnoreCase("password not matched")){
			return new ResponseEntity<LoginResponse>(response,HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<LoginResponse>(response,HttpStatus.NOT_FOUND);
		}
		
		
	}
	

}


