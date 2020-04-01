package com.niit.tlc.crm.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.tlc.crm.Model.Address;
import com.niit.tlc.crm.Model.EliteUser;
import com.niit.tlc.crm.dao.EliteDAO;

@Service
public class EliteServiceImpl implements EliteService {
	
	@Autowired(required = true)
	private EliteDAO eliteDAO;
	
	
	@Override
	@Transactional
	public void saveECustomer(Address add) {
	eliteDAO.saveECustomer(add);
	}
	
	@Override
	@Transactional
	public EliteUser checkUser(EliteUser theEUser)
	{
		return eliteDAO.checkUser(theEUser);
	}

}
