package com.spilna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spilna.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
