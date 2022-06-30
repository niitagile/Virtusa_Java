package Design_pattern.structural;

import java.util.ArrayList;

interface Person{
	String getName();
}
class Student implements Person{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class Employee implements Person{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

public class AdapterDesignPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> list=new ArrayList<>();
		list.add(new Student());
		list.add(new Employee());
		
	}

}
