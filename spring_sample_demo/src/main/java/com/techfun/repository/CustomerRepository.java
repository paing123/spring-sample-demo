package com.techfun.repository;

import java.util.List;

import com.techfun.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}