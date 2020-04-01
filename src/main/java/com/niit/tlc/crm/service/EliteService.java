package com.niit.tlc.crm.service;

import com.niit.tlc.crm.Model.Address;
import com.niit.tlc.crm.Model.EliteUser;

public interface EliteService {
	
	public void saveECustomer(Address add); 
	public EliteUser checkUser(EliteUser theEUser);

}