package com.virtusa.hibernate.main;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.virtusa.hibernate.model.Employee;
import com.virtusa.hibernate.util.HibernateUtil;

public class HQLExamples {

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) {	
		//Prep work
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();		
		//Get All Employees
		Transaction tx = session.beginTransaction();
		
		/*Employee emp=new Employee();
		emp.setName("Pankaj Kumar");
		emp.setSalary(10000);*/
		/*Query query = session.createQuery("insert into EmployeeDetails(name,salary) select emp.name,emp.salary from emp");
		//query.setParameter("name", "Pankaj Kumar");
		//query.setDouble("salary", 10000);
		int result = query.executeUpdate();
		System.out.println("Employee Update Status="+result);*/
		
		
		
		Query query = session.createQuery("from Employee");
		List<Employee> empList = query.list();
		for(Employee emp : empList){
			System.out.println("List of Employees::"+emp.getId()+","+emp.getAddress().getCity());
		}
		
		//Get Employee with id
		query = session.createQuery("from Employee where id= :id");
		query.setParameter("id", 3);
		Employee emp = (Employee) query.uniqueResult();
		System.out.println("Employee Name="+emp.getName()+", City="+emp.getAddress().getCity());
		
		//Update Employee
		query = session.createQuery("update Employee set name= :name where id= :id");
		query.setParameter("name", "Pankaj Kumar");
		query.setLong("id", 1);
		int result = query.executeUpdate();
		System.out.println("Employee Update Status="+result);

		//Delete Employee, we need to take care of foreign key constraints too
		query = session.createQuery("delete from Address where id= :id");
		query.setLong("id", 4);
		
		result = query.executeUpdate();
		System.out.println("Address Delete Status="+result);
		
		
		
		//Aggregate function examples
		query = session.createQuery("select sum(salary) from Employee");
		double sumSalary = (Double) query.uniqueResult();
		System.out.println("Sum of all Salaries= "+sumSalary);
		
		//join examples
		query = session.createQuery("select e.name, a.city from Employee e "
				+ "INNER JOIN e.address a");
		List<Object[]> list = query.list();
		for(Object[] arr : list){
			System.out.println(Arrays.toString(arr));
		}
		
		//rolling back to save the test data
		tx.rollback();
		
		//closing hibernate resources
		sessionFactory.close();
	}

}
