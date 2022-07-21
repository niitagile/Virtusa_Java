package com.greatlearning.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.greatlearning.entity.Teacher;

public class QueryTeacher {
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Teacher.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			// query Teachers
			List<Teacher> theTeachers = session.createQuery("from Teacher").list();

			// display Teachers
			displayTeachers(theTeachers);

			// query teachers l_Name = 'Binny'
			System.out.println("Teachers with lastName Binny");
			theTeachers = session.createQuery("from Teacher t where t.l_Name='Binny'").list();
			
			// dispaly Teachers
			displayTeachers(theTeachers);
			
			System.out.println("Teachers with gl.com in their email ");
			//query teachers where email like %gl.com
			theTeachers = session.createQuery("from Teacher t where t.email like '%gl.com'").list();
			displayTeachers(theTeachers);


			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

	//display Teacher method uses enhanced for loop
	private static void displayTeachers(List<Teacher> theTeachers) {
		for (Teacher tempTeacher : theTeachers) {
			System.out.println(tempTeacher);
		}
	}
}
