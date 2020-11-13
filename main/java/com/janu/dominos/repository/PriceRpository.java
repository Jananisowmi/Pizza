package com.janu.dominos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.janu.dominos.entity.Price;

public interface PriceRpository extends JpaRepository<Price, Integer>{

	Price findPriceByPizzaCode(String pizzaCode);

}
