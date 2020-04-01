package com.niit.tlc.crm.dao;

import com.niit.tlc.crm.Model.Address;
import com.niit.tlc.crm.Model.Elite;
import com.niit.tlc.crm.Model.EliteUser;

public interface EliteDAO {
	public void saveECustomer(Address add);
	public EliteUser checkUser(EliteUser theEUser);
}
