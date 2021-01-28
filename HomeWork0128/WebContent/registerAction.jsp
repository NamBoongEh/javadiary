<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 안될 땐 여기에 import="패키지이름.java파일 이름을 적어서 강제로 import 시킨다. 

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.codechobo.User"%>


그 다음 User user = new User("11","22","33","44"); 이렇게 직접 값을 넣어준다.
 
<% User user = new User("11","22","33","44"); %> --%>

<jsp:useBean id="user" class="com.codechobo.User" scope="request"/>
<jsp:setProperty property="*" name="user"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registerAcion</title>
</head>
<body>

너의 아이디<br>
<%=user.getId() %><br>
<br>
너의 이름<br>
<%=user.getName() %><br>
<br>
너의 비번<br>
<%=user.getPassword() %><br>
<br>
너의 이메일<br>
<%=user.getEmail() %><br>


하이하이~
</body>
</html>