package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentDetails1 {
	public String name;
	public int age;

	public StudentDetails1(String name,int age) {
		super();
		this.name = name;
		this.age=age;
	}
}
	class AgeComparator1 implements Comparator{
		
		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			StudentDetails1 obj1=(StudentDetails1)o1;
			StudentDetails1 obj2=(StudentDetails1)o2;
			int diff=obj1.age-obj2.age;
			
				
			return obj1.age==obj2.age?obj1.name.compareTo(obj2.name):obj1.age-obj2.age;
		}
	}

class NameComparator1 implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		StudentDetails1 obj1=(StudentDetails1)o1;
		StudentDetails1 obj2=(StudentDetails1)o2;
		
		return obj1.name.compareTo(obj2.name);
	}
}


public class ComparatorExample {
	public static void main(String[] args) {
		
	
	ArrayList<StudentDetails1>alist=new ArrayList<>();
	alist.add(new StudentDetails1("Viren",23));
	alist.add(new StudentDetails1("Bobby",23));
	alist.add(new StudentDetails1("Manish",12));
	alist.add(new StudentDetails1("Mukesh",15));
	Collections.sort(alist,new AgeComparator1());
	for(StudentDetails1 s : alist)
		System.out.println(s.name+" "+s.age);
	
	}
}
