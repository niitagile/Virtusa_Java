package com.virtusa.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootInsertion {
	@Autowired
	JdbcTemplate jdbc;
	@RequestMapping("/insert")
	public String insertrecord() {
		String query="insert into product1(id,name) values('p101','sugar')";
		jdbc.execute(query);
		return "data inserted"; 
		
	}
}
