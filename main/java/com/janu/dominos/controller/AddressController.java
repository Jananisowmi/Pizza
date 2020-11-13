package com.janu.dominos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.janu.dominos.dto.AddressRequest;
import com.janu.dominos.dto.AddressResponse;
import com.janu.dominos.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@PostMapping("/address/{userId}")
	public ResponseEntity<AddressResponse> addAddress(@PathVariable Integer userId ,@RequestBody AddressRequest request){
		AddressResponse response = addressService.addAddress(userId,request);
		return new  ResponseEntity<AddressResponse>(response,HttpStatus.CREATED);
		
	}

}
