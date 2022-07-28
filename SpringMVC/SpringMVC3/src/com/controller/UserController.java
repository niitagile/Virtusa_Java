package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.UserDao;
import com.model.UserModel;

@Controller
public class UserController {
	
	@RequestMapping(value="/log")
	public ModelAndView showLogin() {
	
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/showregister")
	public ModelAndView showregister() {
		return new ModelAndView("register");
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login(@RequestParam("email")String email,@RequestParam("pass")String pass) {
		UserDao dao=new UserDao();
		if(dao.checkLogin(email, pass))
		return new ModelAndView("home","email",email);
		else
			return new ModelAndView("login","msg","check your email and pass");
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView register(@RequestParam("name")String name,@RequestParam("email")String email,@RequestParam("pass")String pass,@RequestParam("gender")String gender,@RequestParam("contact")String contact,@RequestParam("country")String country) {
		UserDao dao=new UserDao();
		UserModel user=new UserModel();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(pass);
		user.setGender(gender);
		user.setCountry(country);
		user.setContact(contact);
		dao.register(user);
		return new ModelAndView("login","msg","Succesfully Registered");
	}
	

}
