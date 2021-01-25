<%@ page import="java.util.*" contentType="text/html; charset=UTF-8"%>
<% request.setCharacterEncoding("utf-8");%>

<% 
//안되는거. 
// 1. 세션 생성 세션 읽기
// 2. 없다! \^0^/
	String name = (String)session.getAttribute("id");
	if(!name.equals("id")){
%>
		<jsp:forward page="loginForm.jsp"/>
<%
	}
	else{
%>


<!DOCTYPE html>
<html>
<head>
    <title>board</title>
</head>

<body>

	당신은 성공했어요!<br>
	이미 로그인했다구요 어서오세요!\^0^/

</body>
</html>

<%}
%>