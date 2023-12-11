package com.org.conversion;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.Address;
import com.org.Customer;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception {
		
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
		
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("customer.json"), c);
		System.out.println("File created");
	}
}
