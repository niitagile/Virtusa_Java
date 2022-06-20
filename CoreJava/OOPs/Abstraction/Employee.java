package inheritence;

public class Employee {
	private String name;
	private Address adr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	public Employee(String name, Address adr) {
		super();
		this.name = name;
		this.adr = adr;
	}
	public void display(){
		System.out.println("name="+name);
		System.out.println("Address="+adr.getHno()+","+adr.getCity());
	}

}
