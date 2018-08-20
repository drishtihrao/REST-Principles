package com.demo.rest.service;

import java.util.Collection;

import com.demo.rest.pojo.Customer;

public interface Service {
	void addCustomer(Customer customer);
	Collection<Customer> viewAllCustomers();
	void updateCustomer(Customer customer);
}
