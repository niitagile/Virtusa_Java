package com.virtusa.beans;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@AttributeOverrides(
		{
			@AttributeOverride(name="empid",column = @Column(name="empid")),
			@AttributeOverride(name="empname",column= @Column(name="empname"))
		})
public class Reg_Employee extends Employee{
	private float salary;
	private float bonus;
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
}
