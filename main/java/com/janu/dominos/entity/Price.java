package com.janu.dominos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="price")
public class Price {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
 	private Integer id;
	@Column(name = "pizza_code")
	private String pizzaCode;
	@Column(name = "medium")
	private Double medium;
	@Column(name = "large")
	private Double large;
	@Column(name = "small")
	private Double small;
}
