<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String msg = (String)request.getAttribute("msg");
if(msg==null)
msg = "";
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginForm</title>
</head>

<body>
<label><%=msg%></label>

<form action="LoginAction" method="post">
	ID : <input name="id" type="text"><br>
	PW : <input name="pwd" type="text"><br>
	<input type="submit" value="로그인"></input>
</form>

</body>

</html>