package collections;

import java.util.*;
class EmployeeDetails {
	private int empId;
	private String name;
	private double salary;
	public EmployeeDetails(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
	@Override
	public int hashCode() {
		return this.empId %31;
	}
	@Override
	public boolean equals(Object obj) {
		EmployeeDetails emp=(EmployeeDetails)obj;
		if (this.empId==emp.empId && this.name.equals(emp.name) 
				&& this.salary==emp.salary){
			return true;
		}
		else{
			return false;
		}
	}		

}


public class HashMapIterator {

	
	public static void main(String[] args)
	{
		double sal=Double.parseDouble(args[0]);
		Map<Integer,EmployeeDetails> empMap= 
				new HashMap<Integer,EmployeeDetails>();
		
		EmployeeDetails e= new EmployeeDetails(1,"Deepak",34000);
		empMap.put(1,e);

		e= new EmployeeDetails(2,"Deepika",24000);
		empMap.put(2,e);

		e= new EmployeeDetails(3,"Diya",21000);
		empMap.put(3,e);		

		for(Integer empId: empMap.keySet())
		{
			EmployeeDetails emp= empMap.get(empId);
			System.out.println(emp.getEmpId()+"\t"+emp.getName()+"\t"+ emp.getSalary());
			if (emp.getSalary()>sal)
			{
				empMap.remove(emp.getEmpId());
			}
		}

		/*Iterator iterator= empMap.values().iterator();
		while(iterator.hasNext())
		{
			 e= (Employee) iterator.next();
			if (e.getSalary()>sal)
			{
				System.out.println("Removed "+e.getEmpId()+"\t"+ e.getName()+"\t"+ e.getSalary());
				iterator.remove();
			}
		}*/


	}


}

