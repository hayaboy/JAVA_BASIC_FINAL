<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="${contextPath}/login.do" method="post">
 아이디 : <input type="text" name="userID" ><br> 
 패스워드 : <input type="password" name="password"> 
<br>
<input type="submit" value="로그인">
</form>

</body>
</html>