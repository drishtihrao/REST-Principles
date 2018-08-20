package com.demo.rest.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	private int customerId;
	private String customerName;
	private long contactNumber;
	private String emailId;
	private String dateOfBirth;
//	private Address billingAddress;
//	private Address permanentAddress;
//	private String nationality;
//	private String gender;

	private static int custId;

	static {
		custId = 200;
	}

	
	public Customer() {
		
	}

	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	
	public int getCustomerId() {
		return customerId;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + ", emailId=" + emailId + ", dateOfBirth=" + dateOfBirth + "]";
	}



	
	
	

}
