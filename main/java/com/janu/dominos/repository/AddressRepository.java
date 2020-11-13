package com.janu.dominos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.janu.dominos.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
