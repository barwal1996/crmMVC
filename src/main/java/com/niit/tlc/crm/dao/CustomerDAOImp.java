package com.niit.tlc.crm.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.niit.tlc.crm.Model.Customer;

@Repository
public class CustomerDAOImp implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveCustomer(Customer theCustomer) {
		
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theCustomer);

	}
	@Override
	public List<Customer> getCustomers(){
		Session session=sessionFactory.getCurrentSession();//jpa queries
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Customer> cq=cb.createQuery(Customer.class);//roots reference entities
		Root<Customer> root=cq.from(Customer.class);
		cq.select(root);
		Query query=session.createQuery(cq);
		return query.getResultList();
	} 
	
	@Override
	public Customer getCustomer(int theId) {
		Session currentSession=sessionFactory.getCurrentSession();//jpa queries
		Customer theCustomer = currentSession.get(Customer.class,theId);
		return theCustomer;
	}
	
	@Override
	public void deleteCustomer(int id) {
		Session session=sessionFactory.getCurrentSession();
		Customer c1 = session.byId(Customer.class).load(id);  
		session.delete(c1);
	}

}