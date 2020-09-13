package com.Xisser.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Message {
	
	@Id
	private String name;
	private String email1;
	private String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	
}
