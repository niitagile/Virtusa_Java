package Design_pattern.Creational;

//interface which conatins getClone()
//class
//main class
//End of Prototype interface.  
// Cloneable is pre defined marker interface
class EmployeeRecord1 implements Cloneable {

	private int id;
	private String name, designation;
	private double salary;
	private String address;

	public EmployeeRecord1() {
		System.out.println("   Employee Records of Oracle Corporation ");
		System.out.println("---------------------------------------------");
		System.out.println("Eid" + "\t" + "Ename" + "\t" + "Edesignation"
				+ "\t" + "Esalary" + "\t\t" + "Eaddress");

	}

	public EmployeeRecord1(int id, String name, String designation,
			double salary, String address) {

		this();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void showRecord() {

		System.out.println(id + "\t" + name + "\t" + designation + "\t"
				+ salary + "\t" + address);
	}

}// End of EmployeeRecord class.

public class PrototypeExample1 {

	public static void main(String[] args) throws CloneNotSupportedException {

		// TODO Auto-generated method stub

		EmployeeRecord1 e1 = new EmployeeRecord1(101, "Jyoti", "IT Head",50000, "Delhi");
		System.out.println(e1);	
		e1.showRecord();
		System.out.println("\n");
		EmployeeRecord1 e2 = (EmployeeRecord1) e1.clone();
		System.out.println(e2);
		e2.showRecord();

	}

}
