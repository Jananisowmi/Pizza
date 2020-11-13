package com.janu.dominos.service;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.janu.dominos.dto.AddressRequest;
import com.janu.dominos.dto.AddressResponse;
import com.janu.dominos.entity.Address;
import com.janu.dominos.repository.AddressRepository;
import com.janu.dominos.repository.UserRepository;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	@Transactional
	public AddressResponse addAddress(Integer userId,AddressRequest request) {
		Address address= new Address();
		BeanUtils.copyProperties(request, address);
		Address savedAddress =addressRepository.save(address);
		userRepository.updateAddress(savedAddress.getAId(),userId);
		AddressResponse response = new AddressResponse();
		response.setMessage("Adrress saved");
		response.setStatusCode("201");
		return response;
	} 

}
