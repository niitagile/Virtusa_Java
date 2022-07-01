package IO_Classes_New;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
// to keep state of your object for further use- Serializable. Serializable is marker interface
class Employee implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name,department,designation;
	private Date dateOfBirth;
	
	
	public Employee() {
		super();
	}

	public Employee(String name, String department, String designation, Date dateOfBirth) {
		super();
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", designation=" + designation
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}

	
	
}
public class SerializeExample2 {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			try{
				Employee sobj=new Employee("Sumit", "CS","AP",new SimpleDateFormat("dd-MM-yy").parse("12-03-2019"));
				//write object in file
				FileOutputStream fout=new FileOutputStream("register.txt");
				ObjectOutputStream obj=new ObjectOutputStream(fout);
				obj.writeObject(sobj);
				
				//read object from file
				FileInputStream fin=new FileInputStream("register.txt");
				ObjectInputStream iobj=new ObjectInputStream(fin);
				Employee sobj1=(Employee)iobj.readObject();
				System.out.println(sobj1);
				fout.close();
				//fin.close();
			}
			catch(Exception ex){System.out.println(ex);
			}

	}

}
