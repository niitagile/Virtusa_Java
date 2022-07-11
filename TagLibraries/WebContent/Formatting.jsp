<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="salary" value="5890.56" />
<fmt:parseNumber var="sal" type="number" value="${salary}" /><!-- Integer.parseInt(salary) -->
<c:out value="${sal+20}"/><br>

<c:set var="currDate" value="12-04-2018" />
<fmt:parseDate value="${currDate}" var="parseDate" pattern="dd-MM-YYYY" />
<c:out value="${parseDate}" /><br>


<c:set var="date" value="<%=new java.util.Date() %>" />
<br>Current Date<c:out value="${date}"/><br>

<br>short style date::
<fmt:formatDate type="date" dateStyle="short" value="${date}" /><br>

<br> short style time::
<fmt:formatDate type="time" timeStyle="short" value="${date}" />

</body>
</html>