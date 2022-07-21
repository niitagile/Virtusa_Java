package com.greatlearning.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.greatlearning.entity.Teacher;

public class UpdateTeacher {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Teacher.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			int teacherId = 1;

			// start a transaction
			session.beginTransaction();

			System.out.println("getting teacher with id :" + teacherId);

			//fetching record where teacher id = 1
			Teacher tempTeacher = session.get(Teacher.class, teacherId);

			//updating value using setters
			System.out.println("updating teacher--");
			tempTeacher.setF_Name("Amit");
			
			//commit transaction
			session.getTransaction().commit();

			session = factory.getCurrentSession();
			session.beginTransaction();

			// update email for all teacher whose f_Name is Amit
			System.out.println("update email for all teachers");
			session.createQuery("update Teacher set email = 'random1@gl.com' where f_Name='Amit'").executeUpdate();
			
			//commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

}
