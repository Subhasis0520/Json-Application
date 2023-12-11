package com.org.conversion;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.Customer;

public class JsonToJavaConverter {

	public static void main(String[] args) throws Exception {
		ObjectMapper obj = new ObjectMapper();
		File f = new File("customer.json");
		Customer customer = obj.readValue(f,Customer.class);
		System.out.println(customer);
	}
}
