package com.spring.springDemo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.springDemo.entity.Customer;
@Repository
public class CustomerDAOImpl implements CustomerDAO{

	private SessionFactory sessionFactory;
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		Query<Customer> theQuery=currentSession.createQuery("from Customer", Customer.class);
		List<Customer>customers=theQuery.getResultList();
		return null;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theCutomer);
		
	}

	@Override
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		Customer theCustomer=currentSession.get(Customer.class,theId);
		return theCustomer;
	}

	@Override
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		Query theQuery=currentSession.createQuery("delete from Customer where custid=:customerid");
		theQuery.setParameter("customerid",theId);
		theQuery.executeUpdate();
		
	}

	@Override
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

}
