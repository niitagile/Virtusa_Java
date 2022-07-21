package com.greatlearning.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.greatlearning.entity.Teacher;

public class ReadTeacher {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
				                     .configure("hibernate.cfg.xml")
				                     .addAnnotatedClass(Teacher.class)
				                     .buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//create a student object
		/*	System.out.println("Creating new teacher object...");
			Teacher teacher = new Teacher("Sarath", "Binny", "sarath@gl.com");
		
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("saving the teacher ..."); 
			session.save(teacher);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");*/
			
			//find out the teacher's id
			//System.out.println("saved student" + teacher.getId());		
			
			//get a new session and start transaction
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieve student based on the id
			//System.out.println("Getting student with id"+ teacher.getId());
			
			Teacher tempTeacher = session.get(Teacher.class, 2);
			
			System.out.println(tempTeacher);
			
			session.getTransaction().commit();
			
			System.out.println("Done ");
		}
		finally {
			factory.close();
		}
	}
}
