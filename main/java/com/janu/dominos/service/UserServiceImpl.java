package com.janu.dominos.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.janu.dominos.dto.LoginRequest;
import com.janu.dominos.dto.LoginResponse;
import com.janu.dominos.dto.RegistrationRequest;
import com.janu.dominos.dto.RegistrationResponse;
import com.janu.dominos.entity.User;
import com.janu.dominos.repository.UserRepository;
import com.janu.dominos.utils.MailService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	MailService mailService;

	@Override
	public RegistrationResponse registration(RegistrationRequest request) {
		RegistrationResponse response = new RegistrationResponse();
		User user = new User();
		BeanUtils.copyProperties(request, user);
		User userSaved = userRepository.save(user);
		if (Optional.ofNullable(userSaved).isPresent()) {
			mailService.sendEmail(user);
		}
		response.setMessage("Your registration completed successfully");
		response.setStatusCode("201");
		return response;

	}  

	@Override
	public LoginResponse loginUser(LoginRequest request) {
		User user = userRepository.findUserByEmailId(request.getEmailId());
		LoginResponse response = new LoginResponse();
		if (Optional.ofNullable(user).isPresent()) {
			if (user.getPassWord().equals(request.getPassWord())) {
				response.setMessage("Login successfull");
				response.setStatusode("202");
			}
			else {
				response.setMessage("Password not matched");
				response.setStatusode("401");
			}
		}
		else {
			response.setMessage("User not found");
			response.setStatusode("404");
		}
		
		return response;
	}

}
