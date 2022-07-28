package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.UserModel;

public class UserDao {
	
	
	public  int register(UserModel user){
		
	int res=0;	
	Connection con=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasis",
				"root",
				"Comnet@123");
		PreparedStatement ps;
			
			String ps1 = "Insert into MAILCASTINGUSER(email,password,name,gender,contact,country) VALUES (?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(ps1);
			ps.setString(1,user.getEmail());
			ps.setString(2,user.getPassword());
			ps.setString(3,user.getName());
			ps.setString(4,user.getGender());
			ps.setString(5,user.getContact());
			ps.setString(6,user.getCountry());
			
			res=ps.executeUpdate();

			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return res;
		
	}

	public  boolean checkLogin(String email,String password){
		boolean status=false;
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasis",
					"root",
					"Comnet@123");
			PreparedStatement ps=con.prepareStatement("Select * from MAILCASTINGUSER where email = ? and password =?");
			
			ps.setString(1,email);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}


}
