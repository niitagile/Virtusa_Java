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
<c:forEach var="i" begin="1" end="4">
<p>Hello<br></p>
</c:forEach> 
<c:forTokens items="WE are learning jsp tags" delims=" " var="arr">

	<c:out value="${arr}" /><br/>
</c:forTokens>

</body>
</html>