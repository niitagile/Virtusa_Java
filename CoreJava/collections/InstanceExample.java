package collections;

import java.util.ArrayList;

class Person{
	private int age;
	private String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class InstanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> list=new ArrayList<>();
		list.add(new Person(23,"Neha"));
		list.add(new Person(24,"Leena"));
		System.out.println(list);
		for(Person obj:list) {
			System.out.println(obj.getAge()+" "+obj.getName());
		}
	}

}
