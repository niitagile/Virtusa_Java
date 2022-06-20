package collections;
import java.util.*;

class Employee2
{
	private int age;
	private String name;
	public void setAge(int age)
	{        
		this.age=age;
	}
	public int getAge(){          
		return this.age;
	}
	public void setName(String name)
	{         
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}     
}

class AgeComparator implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 arg0, Employee2 arg1) {
		// TODO Auto-generated method stub
		return arg0.getAge()-arg1.getAge();
	}

	
}

class NameComparator implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 arg0, Employee2 arg1) {
		// TODO Auto-generated method stub
		return arg0.getName().compareTo(arg1.getName());
	}
	
}

public class JavaComparatorExample{
	public static void main(String args[]){

		Employee2 employee[] = new Employee2[3];
		employee[0] = new Employee2();
		employee[0].setAge(40);
		employee[0].setName("Joe");
		
		employee[1] = new Employee2();
		employee[1].setAge(20);
		employee[1].setName("Mark");
		
		employee[2] = new Employee2();
		employee[2].setAge(13);
		employee[2].setName("Alina");

		AgeComparator ac= new AgeComparator();
		Arrays.sort(employee,ac);

		System.out.println("\n\nOrder of employee after sorting by employee age is");
		for(int i=0; i < employee.length; i++){
			System.out.println( "Employee " + (i+1) + " name :: " + employee[i].getName() + ", Age :: " + employee[i].getAge());
		}

	/*	Arrays.sort(employee, new NameComparator());
		System.out.println("\n\nOrder of employee after sorting by employee name is");      
		for(int i=0; i < employee.length; i++){
			System.out.println( "Employee " + (i+1) + " name :: " + employee[i].getName() + ", Age :: " + employee[i].getAge());
		
		}*/
	}
}
