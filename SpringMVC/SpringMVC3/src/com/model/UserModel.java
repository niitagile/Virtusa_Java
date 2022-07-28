package com.model;

public class UserModel {
	private int id;
	private String email;
	private String password;
	private String name;
	private String contact;
	private String gender;
	private String country;
	public UserModel(int id, String email, String password, String name, String gender, String contact,
			String country) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.contact = contact;
		this.gender = gender;
		this.country = country;
	}
	public UserModel(String email, String password, String name, String gender, String contact, String country) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.contact = contact;
		this.gender = gender;
		this.country = country;
	}
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", contact="
				+ contact + ", gender=" + gender + ", country=" + country + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
