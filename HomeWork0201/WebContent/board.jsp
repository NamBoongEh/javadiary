<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = "";
	id = (String)session.getAttribute("id");
	if(id==null){
		RequestDispatcher reqDis = request.getRequestDispatcher("loginForm.jsp"); 
		reqDis.forward(request, response);
	}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board</title>
</head>
<body>
어서오세요\ㅠㅠ/<br>
</body>
</html>