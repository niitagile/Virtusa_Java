<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<span style="color:red">${msg}</span>
		<form action="login" method="post">
			
						<table style="table-layout: fixed">

									<tr>
										<td>Email id :</td>
									</tr>
										<tr>
										<td> <input class="inputBox"  type="text"  name="email"><br></td>
										</tr>
			
									<tr><td>Password:</td></tr>
									<tr><td> <input class="inputBox" type="password" name="pass"><br></td></tr>
				
									<tr><td><br><input class="btn-login" type="submit" value="Sign in">&nbsp; &nbsp; &nbsp;  &nbsp;  &nbsp; 
										 <a href="showregister" class="btn-signin">Don't have an account?</a> </td></tr>
						</table>
				</form>
</body>
</html>