package com.niit.tlc.crm.dao;

import java.util.List;

import com.niit.tlc.crm.Model.Customer;

public interface CustomerDAO {

	public void saveCustomer(Customer theCustomer);
	
	public List<Customer> getCustomers();
	
	public Customer getCustomer(int theId);
	
	public void deleteCustomer(int id);
	
	
	

}