package collections;

import java.util.Set;
import java.util.ArrayList;

class StudentN{
	int rollno;
	String name;
	public StudentN(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
class DemoGenerics{

public static void main(String args[]){
	ArrayList<StudentN> obj=new ArrayList<>();
	obj.add(new StudentN(1, "Kavin"));
	obj.add(new StudentN(2, "Nishant"));
	obj.add(new StudentN(3, "Manish"));
	
	for(StudentN s: obj ){
		System.out.println(s.getRollno()+" "+s.getName());
		
	}
	
	
}
}
