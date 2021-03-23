package com.example.demo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class User {
	@Id
	public String email;
	public String name;
	
	
	public String password;
	public String mobileno;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public User(String email, int id, String name, String password, String mobileno) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.mobileno = mobileno;
	}
	public User() {
		
	}
	
	
	

}
