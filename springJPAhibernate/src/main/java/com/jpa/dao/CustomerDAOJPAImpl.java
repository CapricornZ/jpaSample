package com.jpa.dao;

import java.util.List;  

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;  

import com.jpa.model.Customer;
  
public class CustomerDAOJPAImpl implements CustomerDAO {
	
	@PersistenceContext()
    private EntityManager entityManager;
	
    public Customer findById(int id) {
    	return this.entityManager.find(Customer.class, id);  
    }  
      
    public Customer add(Customer customer) {  
    	this.entityManager.persist(customer);
    	return customer;  
    }  

    @SuppressWarnings("unchecked")  
    public List<Customer> list() {
    	return this.entityManager.createQuery("select c from Customer c").getResultList();
    }  
}  