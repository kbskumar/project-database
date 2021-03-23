package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {
	@Autowired
	UserInterface u;
	public void addUser(User user) {
		
		u.save(user);
	}
	@Autowired
	CouponsInterface c;
	public void addCoupons(Coupon coupon) {
		c.save(coupon); 
	}
	
	
}
