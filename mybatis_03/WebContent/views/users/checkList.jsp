<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>체크된 정보 출력</title>
</head>
<body>
<c:forEach items="${list}" var="user">
	NO : ${user.userNo }<br>
	<c:if test="${user.userId != null }">
		ID : ${user.userId }<br>
	</c:if>
	<c:if test="${user.userPw != null }">
		PW : ${user.userPw }<br>
	</c:if>
	<c:if test="${user.userName != null }">
		NAME : ${user.userName }<br>
	</c:if>
	<c:if test="${user.userAddr != null }">
		ADDR : ${user.userAddr }<br>
	</c:if>
	REG_DATE : ${user.regDate }<br>
	<hr>
</c:forEach>
</body>
</html>