package com.demo.rest.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.rest.dao.DaoImpl;
import com.demo.rest.pojo.Customer;

@Component
public class ServiceImpl implements Service {

	@Autowired
	DaoImpl dao; //= new DaoImpl();

	@Override
	public void addCustomer(Customer customer) {
		dao.addCustomer(customer);

	}

	@Override
	public Collection<Customer> viewAllCustomers() {
		return dao.viewAllCustomers();
	}

	@Override
	public void updateCustomer(Customer customer) {
		dao.updateCustomer(customer);
		
	}

}
