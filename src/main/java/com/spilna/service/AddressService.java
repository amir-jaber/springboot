package com.spilna.service;

import java.util.List;

import com.spilna.model.Address;

public interface AddressService {

	List<Address> addressList();
	
	Address findOne(Long id);
	Address addAddress(Address address);
	String deleteAddress(Long id);
}
