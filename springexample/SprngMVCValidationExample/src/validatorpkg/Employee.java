package validatorpkg;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {

	private String name;
	@NotNull(message="required")
	@Size(min=1,message="min value must be at least 1")
	private String pass;
	
	@NotNull(message="required")
	@Min(value=18, message="must be equal or greater than 18")
	@Max(value=45, message="must be equal or less than 45")
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
