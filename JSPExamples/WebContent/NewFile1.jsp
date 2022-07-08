<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="NewFile1.jsp" method="get">
<input type="text" name="txtName" >
<input type="password" name="txtPword" >
<input type="submit" value="click">
</form>
<%
String name=request.getParameter("txtName");
String pword=request.getParameter("txtPword");
if(name!=null && pword !=null)
	if(validate(name,pword)){
		RequestDispatcher rd= request.getRequestDispatcher("Login.jsp");
		rd.forward(request,response);
		
	}
			
	else
	out.println("Invalid user and password");


%>
<%!
	boolean validate(String name, String pword){
		if(pword.equals("abc123"))
		return true;
	else
		return false;
}


%>
<%= new Date() %>
</body>
</html>