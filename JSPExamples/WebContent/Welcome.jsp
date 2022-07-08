<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

		//Session Object
		String uname=request.getParameter("uname");
		//session.setAttribute("username",uname);
		pageContext.setAttribute("username",uname,PageContext.SESSION_SCOPE);
		
		
		
		/* to get any property for our jsp page using web.xml
		String email=config.getInitParameter("email");
		out.println("email="+email);
		String password=application.getInitParameter("password");
		out.println("<br>password"+password);*/
		//to get any value directly
		//application.setAttribute("password","abc@123");
		//out.println(application.getAttribute("password"));

		
		
		
		
		
%>
<a href="DisplaySession.jsp"> click</a>
</body>
</html>