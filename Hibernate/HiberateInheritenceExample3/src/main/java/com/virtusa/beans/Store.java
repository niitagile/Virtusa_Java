package com.virtusa.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Store {
	public static void main(String[] args) {
		Employee e1=new Employee();    
	    e1.setEmpname("Kartik");    
	       
	    Reg_Employee reg_emp=new Reg_Employee();
	    reg_emp.setEmpname("Anuj");
	    reg_emp.setSalary(50000);
	    reg_emp.setBonus(2000);
	    
	    Contract_Employee cont_emp=new Contract_Employee();
	    cont_emp.setEmpname("Ashish");
	    cont_emp.setPay_er_hr(2000);
	    cont_emp.setContract_duration(20);
	        
	    
	    SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(e1);
		session.save(reg_emp);
		session.save(cont_emp);
		session.getTransaction().commit();
	}

}
