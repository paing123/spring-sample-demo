package com.techfun.repository;

import java.util.ArrayList;
import java.util.List;
import com.techfun.model.Customer;

public class HibernateCustomerRepositoryImp implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.techfun.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Pyae Phyo");
		customer.setLastName("Paing");
		
		customers.add(customer);
		return customers;
	}
}
