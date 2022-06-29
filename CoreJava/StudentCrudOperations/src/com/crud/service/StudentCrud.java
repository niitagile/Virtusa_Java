package com.crud.service;
import java.util.List;

import com.crud.model.Student;

public interface StudentCrud {
	
	int insertRecord(Student student);
	int updateRecord(Student student);
	int deleteRecord(int rollno);
	List<Student> getAllRecords();
	Student getStudentByRollno(int rollno);

}
