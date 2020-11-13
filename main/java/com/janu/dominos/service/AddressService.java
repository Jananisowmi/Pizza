package com.janu.dominos.service;

import com.janu.dominos.dto.AddressRequest;
import com.janu.dominos.dto.AddressResponse;

public interface AddressService {

	AddressResponse addAddress(Integer userId, AddressRequest request);

}
