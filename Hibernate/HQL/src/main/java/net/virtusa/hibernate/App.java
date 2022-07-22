package net.virtusa.hibernate;

import java.util.List;

import net.virtusa.hibernate.dao.StudentDao;
import net.virtusa.hibernate.entity.Student;

public class App {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		Student student = new Student("Ramesh", "Fadatare", "ramesh@virtusa.com");
		studentDao.saveStudent(student);
		
		studentDao.insertStudent();
		
		// update student
		Student student1 = new Student("Ram", "Fadatare", "ramesh@virtusa.com");
		studentDao.updateStudent(student1);
		
		// get students
		List<Student> students = studentDao.getStudents();
		students.forEach(s -> System.out.println(s.getFirstName()));
		/*for(Student s : students) {
			System.out.println(s.getFirstName());
		}*/
		
		// get single student
		Student student2 = studentDao.getStudent(1);
		System.out.println(student2.getFirstName());
		
		// delete student
		studentDao.deleteStudent(1);
	}
}
