package com.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.binding.Address;
import com.org.binding.Customer;

@RestController
public class MyController {

	@GetMapping("/")
	public Customer view() {
		Address addr = new Address();
		addr.setCity("Kolkata");
		addr.setState("WB");
		addr.setPincode(700001);
		
		Customer c = new Customer();
		c.setId(101);
		c.setName("Sudip");
		c.setGender("Male");
		c.setPhone(8170098);
		c.setAddress(addr);
		
		return c;
	}
}
