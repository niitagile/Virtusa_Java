package com.virtusa.springbootexamples;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@RequestMapping("/hello")
	public String home() {
	return "Spring boot is working!";
	}
}