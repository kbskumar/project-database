package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
	public class Controller {
	@Autowired
		private Services service;
	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST,value="/signup")
	public void addUser(@RequestBody User u)
	{
	service.addUser(u);	
	}
	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST,value="/coupons")
	public void addCoupons(@RequestBody Coupon c) {
		service.addCoupons(c);
	}
	
	}
	

