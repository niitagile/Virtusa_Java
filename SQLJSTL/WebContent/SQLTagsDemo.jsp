<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>

	<sql:setDataSource var="conn" 
	driver="oracle.jdbc.driver.OracleDriver"
	url="jdbc:oracle:thin:@localhost:1521:orcl" 
	user="hr" password="hr"/>
	
	<sql:query dataSource="${conn}" var="res">
		select * from utable
	</sql:query>
	
	<table border="1">
		<tr>
			<th>User Name</th>
			<th>Password </th>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>
		<c:forEach items="${res.rows}" var="row">
			<tr><!--  Column names of table -->
				<td><c:out value="${row.userid}"/></td>
				<td><c:out value="${row.upass}"/></td>
				<td><c:out value="${row.fname}"/></td>
				<td><c:out value="${row.lname}"/></td>
			</tr>
		</c:forEach>
		
	</table>

</body>
</html>