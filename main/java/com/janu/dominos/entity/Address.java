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

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "a_id")
	private Integer aId;
	@Column(name = "door_number")
	private String doorNumber;
	@Column(name = "street")
	private String street;
	@Column(name = "potal_code")
	private Integer potalCode;
	@Column(name = "land_mark")
	private String landMark;
	@Column(name = "city")
	private String city;
}
