<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="jsp1.UserDao"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<jsp:useBean id="obj" class="jsp1.User"></jsp:useBean>  
<jsp:setProperty property="*" name="obj"/>  

  <%String nu=request.getParameter("num");
int n=Integer.parseInt(nu);
obj.setId(n);
%>
<%  
int i=UserDao.save(obj);  
if(i>0){  
response.sendRedirect("adduser-success.jsp");  
}else{  
response.sendRedirect("adduser-error.jsp");  
}  
%>  



</body>
</html>