package com.niit.tlc.crm.service;


import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.tlc.crm.Model.User;
import com.niit.tlc.crm.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	
	@Override
	@Transactional
	public User checkUser(User theUser) {
		return userDAO.checkUser(theUser); 
	}

}