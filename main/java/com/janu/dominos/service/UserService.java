package com.janu.dominos.service;

import com.janu.dominos.dto.LoginRequest;
import com.janu.dominos.dto.LoginResponse;
import com.janu.dominos.dto.RegistrationRequest;
import com.janu.dominos.dto.RegistrationResponse;

public interface UserService {
	
	RegistrationResponse registration(RegistrationRequest request);

	LoginResponse loginUser(LoginRequest request);
	
	
	

}
