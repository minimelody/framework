<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>전체 학생 정보 출력</title>
</head>
<body>
<c:forEach items="${list}" var="list">
학생 번호 : ${list.studentNo }<br>
학생 이름 : ${list.studentName }<br>
학생 Tel : ${list.studentTel }<br>
학생 Email : ${list.studentEmail }<br>
학생 Addr : ${list.studentAddr }
<hr>
</c:forEach>
</body>
</html>