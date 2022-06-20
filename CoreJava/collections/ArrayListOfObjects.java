package collections;

import java.util.ArrayList;

class StudentInfo{
	private int rollno;
	private String name;
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
	public StudentInfo(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
}
public class ArrayListOfObjects {

	public static void main(String[] args) {
		ArrayList<StudentInfo> obj=new ArrayList<>();
		obj.add(new StudentInfo(1,"Samyak"));
		obj.add(new StudentInfo(2,"Babita"));
		System.out.println(obj);
		for(StudentInfo stud :obj){
			System.out.println(stud.getRollno()+"\t"+stud.getName());
		}
		

	}

}
