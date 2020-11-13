package com.janu.dominos.entity;

import java.util.Date;

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
@Table(name="orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "order_id")
	private Integer orderId;
	@Column(name = "order_code")
	private String orderCode;
	@Column(name = "timeStamp")
	private Date timeStamp;
	@Column(name = "pizza_code")
	private String pizzaCode;
	@Column(name = "user_id")   
	private Integer userId;
	@Column(name = "price")
	private Double price;
	@Column(name = "status")  
	private String status;
	@Column(name = "otp")  
	private String otp;
	@Column(name="quantity")
	private Integer quantity;
	@Column(name = "type")
	private String type;

}
