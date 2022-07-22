package com.virtusa.beans;




public class UserDetails {
	
	private int id;
	
	private String username;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	

}
/*
right click on project-> build path-> add libraries--> user library--> new library
give name to your library
click on Add externals jar--> select location of hiberante jars
(hibernate 5.2 release--> required folder)*/