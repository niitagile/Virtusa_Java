package com.virtusa.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.virtusa.beans.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			UserDetails user=new UserDetails();
			user.setId(3);
			user.setUsername("Third User");
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
					Session session=sessionFactory.openSession();
					session.beginTransaction();
					session.save(user);
					
					session.getTransaction().commit();

			
	}

}
