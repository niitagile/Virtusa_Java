<%@page import="com.virtusa.beans.*"%>  

<%
StudUser obj=new StudUser();
obj.setName(request.getParameter("name"));
obj.setPword(request.getParameter("pword"));
obj.setEmail(request.getParameter("email"));

int i=UserDao.register(obj);
if(i>0)
out.print("You are successfully registered");

%>