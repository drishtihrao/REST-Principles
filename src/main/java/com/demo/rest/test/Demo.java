package com.demo.rest.test;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.rest.pojo.Customer;
import com.demo.rest.service.ServiceImpl;

@RestController
public class Demo {

	@Autowired
	ServiceImpl service; // = new ServiceImpl();

	@RequestMapping(value = "/customer/add", method = RequestMethod.POST, consumes = "application/json")
	public void addCustomer(@RequestBody Customer customer) {
		System.out.println(customer);
		service.addCustomer(customer);
	}

	@RequestMapping(value = "/customers", method = RequestMethod.GET, produces = MediaType.ALL_VALUE)
	public Collection<Customer> viewAllCustomers() {
		return service.viewAllCustomers();
	}

	@RequestMapping(value = "/customer/update", method = RequestMethod.PUT, consumes = "application/json")
	public void updateCustomer(int id, @RequestBody Customer customer) {
		System.out.println(customer);
		service.updateCustomer(customer);
	}

	@RequestMapping(value = "/customer/delete", method = RequestMethod.DELETE)
	public void deleteCustomer(int customerId) {

		service.deleteCustomer(customerId);
	}

}
