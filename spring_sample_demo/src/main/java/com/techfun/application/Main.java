package com.techfun.application;

import java.util.List;

import com.techfun.model.Customer;
import com.techfun.service.CustomerService;
import com.techfun.service.CustomerServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService service = new CustomerServiceImpl();
		List<Customer> customers = service.findAll();
		
		for(Customer customer:customers) { 	//for(Type item:items){statement}
			System.out.println(customer.getFirstName());
			System.out.println(customer.getLastName());
		}
	}

}
