package com.employee.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginVerify")
public class LoginVerify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginVerify() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String name=request.getParameter("txtName");
		String password=request.getParameter("txtPword");
		PrintWriter out=response.getWriter();
		if(name.equalsIgnoreCase("java")&& password.equals("java@123")) {
			
			RequestDispatcher rd=request.getRequestDispatcher("Welcome");
			rd.forward(request, response);
			
		}
		else
		{
			out.println("Invalid username and password");
			RequestDispatcher rd=request.getRequestDispatcher("/Login.html");
			rd.include(request, response);
		}
	}


	
}
