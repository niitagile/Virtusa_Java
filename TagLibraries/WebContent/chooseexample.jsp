<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
<c:set var="marks" scope="session" value="${230}" />
<c:choose>
<c:when test="${marks>=400}">
	grade="A"
</c:when>
<c:when test="${marks>=300}">
	grade="B"
</c:when>
<c:otherwise>
	grade="fail"
</c:otherwise>
</c:choose>
<%=request.getParameter("userid") %>
</body>
</html>