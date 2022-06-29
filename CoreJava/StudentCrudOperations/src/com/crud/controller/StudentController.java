package com.crud.controller;

import java.util.List;

import com.crud.model.Student;
import com.crud.service.StudentService;

public class StudentController {
	
	StudentService studentservice;
	
	public StudentController() {
		studentservice=new StudentService();
	}


	public int insertRecord(Student student) {
		int result=studentservice.insertRecord(student);
		return result;
	}


	public int updateRecord(Student student) {
		
		int result=studentservice.updateRecord(student);
		return result;
	}

	
	public int deleteRecord(int rollno) {
		
		int result=studentservice.deleteRecord(rollno);
		return result;
	}

	
	public List<Student> getAllRecords() {
		
		List <Student> list=studentservice.getAllRecords();
		return list;
	}

	
	public Student getStudentByRollno(int rollno) {
		
		Student student=studentservice.getStudentByRollno(rollno);
		return student;
	}


}
