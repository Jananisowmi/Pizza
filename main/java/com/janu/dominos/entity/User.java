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
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "password")
	private String passWord;
	@Column(name = "phone_number")
	private Double phoneNumber;
	@Column(name = "a_id")
	private Integer aId;

}
