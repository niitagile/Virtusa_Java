<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% out.println("Hello EveryOne!!!"); %><br>
<%out.println(4*5); %><br>
<%out.println(Math.pow(2,3)); %><br>
<%="Hello"%><br>
<%=4*20 %><br>
<%! int a=34; 
	String display(){
	return	"method1";
	}

%><br>
<% out.println(display()); %><br>
<%=display() %><br>
<%=a*5 %>

</body>
</html>