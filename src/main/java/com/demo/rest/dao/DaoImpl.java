package com.demo.rest.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.demo.rest.pojo.Customer;

@Component
public class DaoImpl implements Dao {
	//private static ArrayList<Customer> customerList;
	private  Map<Integer, Customer> customerMap = new HashMap<>();
	
	@Override
	public void addCustomer(Customer customer) {
		System.out.println(customer + "is the new customer");
		//customerList.add(customer);
		customerMap.put(customer.getCustomerId(), customer);
		
	}

	@Override
	public Collection<Customer> viewAllCustomers() {
		return customerMap.values();
	}

	@Override
	public void updateCustomer(Customer customer) {
	/*	if(customerMap.containsKey(id))*/
		
		for(Customer cust: customerMap.values()) {
			if(cust.getCustomerId() == customer.getCustomerId()) {
				customerMap.put(customer.getCustomerId(), customer);
			}
		}
		
	}
	
	


	
}
