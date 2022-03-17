<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br><br><center><font size="+2">Employee Enrollment SignUp Form</font></center><br><br>
	<form action="Signup" method= "post">
			<center>Enter Employee ID   :   <input type="text" name="uname" required><br><br>
			
			Enter first name : <input type="text" name="first_name"><br><br>
			Enter last name : <input type="text" name="last_name"><br><br>
			Enter password : <input type="password" name="pass"required><br><br>
			Enter date of birth: <input type="date" name="date_of_birth"><br><br>
			Enter contact number  :  <input type="text" name="contact_number"><br><br>
			Enter job role  :  <input type="text" name="job_role"><br><br>
			Enter monthly salary  :  <input type="text" name="monthly_salary"><br><br>
			Enter yearly bonus  :  <input type="text" name="yearly_bonus"><br><br><br>
			<input type="submit" value="signup"></center><br>
	</form>
	<form action="Login" method= "post">
			<center><input type="submit" value="login"></center>
	</form>
	
</body>
</html>