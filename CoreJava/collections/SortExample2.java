package collections;

import java.util.ArrayList;
import java.util.Collections;

class StudentDetails implements Comparable<StudentDetails>{
	public String name;

	public StudentDetails(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(StudentDetails arg0) {
		// TODO Auto-generated method stub
		return this.name.compareTo(arg0.name);}
	
}
public class SortExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<StudentDetails>alist=new ArrayList<>();
	alist.add(new StudentDetails("Viren"));
	alist.add(new StudentDetails("Bobby"));
	alist.add(new StudentDetails("Manish"));
	alist.add(new StudentDetails("Mukesh"));
	Collections.sort(alist);
	//(alist.get(0)).compareTo(alist.get(1));
	for(StudentDetails s : alist)
		System.out.println(s.name);
	

	}

}
