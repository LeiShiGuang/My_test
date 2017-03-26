<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>
<body>

	<form action="login.html" method="post">
		<p>
			username: <input name="uname" type="text">
		</p>
		<p>
			password: <input name="upasswd" type="password">
		</p>
		<p>
			<input type="submit">
		</p>
	</form>
	
	<font color="red">${error }</font>

</body>
</html>