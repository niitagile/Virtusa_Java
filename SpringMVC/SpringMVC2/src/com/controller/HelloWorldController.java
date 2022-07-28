package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")// <form action"/hello" method="get">
	ModelAndView helloWorld(){
		String message="Hello World!!!!";
		return new ModelAndView("hello","msg",message);// name of page which you to display, key, value
	}
	
	

}
