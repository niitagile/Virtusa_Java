
<%@page import="com.virtusa.model.*"%>  

<%
StudUser obj=new StudUser();
out.println(obj);
obj.setName(request.getParameter("name"));
obj.setPword(request.getParameter("pword"));
obj.setEmail(request.getParameter("email"));

int i=UserDao.register(obj);
if(i>0)
out.print("You are successfully registered");

%>