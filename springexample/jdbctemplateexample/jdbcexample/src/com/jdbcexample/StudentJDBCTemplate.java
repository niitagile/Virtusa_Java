package com.jdbcexample;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbcexample.Student;
import com.jdbcexample.StudentDao;

public class StudentJDBCTemplate implements StudentDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	public void setDataSource(DataSource ds) {
		// TODO Auto-generated method stub
		this.dataSource=dataSource;
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
		
	}

	public void create(String name, Integer age) {
		// TODO Auto-generated method stub
		String sql="insert into Student(name,age)values(?,?)";
		jdbcTemplateObject.update(sql,name,age);
		
	}

	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		String sql="select * from Student where id=?";
		Student student=jdbcTemplateObject.queryForObject(sql,new Object[]{id},new StudentMapper());
		return student;
		
	}

	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		String sql="select * from Student";
		List<Student>students=jdbcTemplateObject.query(sql,new StudentMapper());
		return students;
		
	}

	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub
		String sql="update Student set age=? where id=?";
		jdbcTemplateObject.update(sql,age,id);
		
		
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		String sql="delete from Student where id=?";
		jdbcTemplateObject.update(sql,id);
		
	}
	

}
