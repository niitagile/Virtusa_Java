package inheritence;

public class hasAExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address=new Address(12, "Delhi");
		Employee obj=new Employee("Anil",address);
		obj.display();

	}

}
