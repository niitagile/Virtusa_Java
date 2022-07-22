package com.virtusa.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="empid")
public class Contract_Employee extends Employee {
	private float pay_er_hr;
	private int contract_duration;
	public float getPay_er_hr() {
		return pay_er_hr;
	}
	public void setPay_er_hr(float pay_er_hr) {
		this.pay_er_hr = pay_er_hr;
	}
	public int getContract_duration() {
		return contract_duration;
	}
	public void setContract_duration(int contract_duration) {
		this.contract_duration = contract_duration;
	}
	
	
}
