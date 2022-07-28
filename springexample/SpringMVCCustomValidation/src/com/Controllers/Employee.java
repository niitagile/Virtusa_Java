package com.Controllers;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.customvalidation.Password;

public class Employee {
	private String name;
	//Custom annotation
	@Password
	private String password;
	//Predefined annotation
	@Min(value=18, message="must be equal or greater than 18")
	@Max(value=45, message="must be equal or less than 45")
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
}








