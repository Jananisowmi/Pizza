package com.janu.dominos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Pizza {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "pizza_code")
	private String pizzaCode;
	@Column(name = "name")
	private String name;
	@Column(name = "medium")
	private Integer medium;
	@Column(name = "large")
	private Integer large;
	@Column(name = "small")
	private Integer small;
}
 