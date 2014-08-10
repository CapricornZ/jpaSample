package com.jpa.dao;

import java.util.List;

import com.jpa.model.Customer;

public interface CustomerDAO {
	
	Customer findById(int id);
    Customer add(Customer customer);  
    List<Customer> list();  

}
