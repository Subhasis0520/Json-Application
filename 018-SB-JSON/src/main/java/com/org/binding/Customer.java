package com.org.binding;

import lombok.Data;

@Data
public class Customer {

	private int id;
	private String name;
	private String gender;
	private Address address;
	private long phone;
	
  }