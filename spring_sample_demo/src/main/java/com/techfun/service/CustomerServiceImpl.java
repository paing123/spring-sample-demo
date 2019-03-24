package com.techfun.service;

import java.util.List;

import com.techfun.model.Customer;
import com.techfun.repository.CustomerRepository;
import com.techfun.repository.HibernateCustomerRepositoryImp;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository
	=new HibernateCustomerRepositoryImp();
	
	/* (non-Javadoc)
	 * @see com.techfun.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
