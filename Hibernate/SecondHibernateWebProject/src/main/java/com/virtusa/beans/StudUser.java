package com.virtusa.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudUser  {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)  
	private int sid;
@Column(length=20)
private String name,pword,email;


public StudUser() {
	super();
}
public int getUId() {
	return sid;
}
public void setUId(int id) {
	this.sid = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPword() {
	return pword;
}
public void setPword(String pword) {
	this.pword = pword;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}
