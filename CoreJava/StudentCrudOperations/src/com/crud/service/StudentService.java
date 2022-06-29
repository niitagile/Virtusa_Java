package com.crud.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.crud.model.Student;

public class StudentService implements StudentCrud{
	

	@Override
	public int insertRecord(Student student) {
		int result=0;
		try{
			Connection con=StudentConnection.getConnection();
			java.sql.Date sdob=new java.sql.Date(student.getDob().getTime());
			//To insert records 
			PreparedStatement ps=con.prepareStatement("insert into studentDetails(rollno, studname,dob) values(?,?,?)");
			ps.setInt(1,student.getRollno());
			ps.setString(2,student.getStudname());
			ps.setDate(3, sdob);
			result=ps.executeUpdate();
			con.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		return result;
	}

	@Override
	public int updateRecord(Student student) {
		int result=0;
		try{
			Connection con=StudentConnection.getConnection();
			java.sql.Date sdob=new java.sql.Date(student.getDob().getTime());
			
			//To insert records 
			PreparedStatement ps=con.prepareStatement("update studentDetails set studname=?,dob=? where rollno=?");
			
			ps.setString(1,student.getStudname());
			ps.setDate(2, sdob);
			ps.setInt(3,student.getRollno());
			result=ps.executeUpdate();
			con.close();
			
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return result;
	}

	@Override
	public int deleteRecord(int rollno) {
		int result=0;
		try{
			Connection con=StudentConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from studentdetails where rollno=?");
			
			ps.setInt(1,rollno);
			
			result=ps.executeUpdate();
			con.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return result;
	}

	@Override
	public List<Student> getAllRecords() {
		
		ArrayList<Student> list=new ArrayList<>();
		try{
		Connection con=StudentConnection.getConnection();
		//To get all Records
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from studentdetails");
		//Add all Records in ArrayList		
						
		while(rs.next()) {
			
			list.add(new Student(rs.getInt(1),rs.getString(2),rs.getDate(3)));
			//Student student=new Student(rs.getInt(1),rs.getString(2),rs.getDate(3));
			//list.add(student);
					
		}
		stmt.close();
		con.close();
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Student getStudentByRollno(int rollno) {
		
		Student student=null;
		try{
			Connection con=StudentConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("Select * from studentdetails where rollno=?");
			ps.setInt(1, rollno);
			ResultSet rs=ps.executeQuery(); 
			if(rs.next())
				student=new Student(rs.getInt(1),rs.getString(2),rs.getDate(3));
			
			con.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return student;
	}



}
