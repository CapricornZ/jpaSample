package com.jpa.service;

import java.util.List;

import com.jpa.dao.CustomerDAO;
import com.jpa.model.Customer;

public class CustomerService {
	
	private CustomerDAO dao;
	public void setCustomerDAO(CustomerDAO dao){
		this.dao = dao;
	}

	public void saveCustomer(Customer customer){
		this.dao.add(customer);
	}
	
	public List<Customer> findAll(){
		return this.dao.list();
	}
}
