<%@ page import="java.util.*" contentType="text/html; charset=UTF-8"%>
<% request.setCharacterEncoding("utf-8");%>

<% 
	String msg = (String)request.getAttribute("msg");
	if(msg==null){
		msg = "";
	}
%>


<!DOCTYPE html>
<html>
<head>
    <title>loginForm</title>
</head>

<body>
	<label><%=msg%></label>

	<form action="LoginAction" method="post">
	
	id : <input name="id" type=text placeholder="id를 적으세요"><br>
	pwd : <input name="password" type=text placeholder="password를 적으세요"><br>
	<button type="submit">Login</button>
	
	</form>
	

</body>
</html>