package com.janu.dominos.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.janu.dominos.entity.User;


@Component
public class MailService {
	
	@Autowired
	JavaMailSender mailSender;
	
	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendEmail(User user) {
		System.out.println("Inside Mail service"+user.getEmailId());
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(user.getEmailId());
		mail.setSubject("Dominos Application Registration");
		mail.setText("Hi"+" "+user.getUserName()+" "+"Your registration completed successfully");
		
		mailSender.send(mail);
	   		
	}
	

}
