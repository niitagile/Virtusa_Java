<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
								<form action="register" method="post">
									<table style="table-layout: fixed;">
										<tr><td>EmailId:</td></tr>
										<tr><td><input class="inputBox" type="text" name="email"/><br/><br/></td></tr>

										<tr><td>Password: </td></tr>
										<tr><td><input class="inputBox" type="password" name="pass"/><br/><br/></td></tr>
										<tr><td>Name: </td></tr>
										<tr><td><input class="inputBox" type="text" name="name"/><br/><br/></td></tr>
										
										<tr><td>Gender: Male<input type="radio" name="gender" value="male">
											Female<input type="radio" name="gender" value="female"/><br/><br/>
											</td>
										</tr>
										<tr><td>Contact Number:</td></tr>
										<tr><td> <input class="inputBox" type="text" name="contact"/><br/><br/></td></tr>
										<tr><td>Country: </td></tr>
										<tr><td><input class="inputBox" type="text" name="country"/><br/><br/></td></tr>
										<tr><td><input type="submit" value="Submit" class="btn-signin"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<a href="log" class="btn-login">Login</a></td></tr>
									</table>
								</form>
						
			
</body>
</html>