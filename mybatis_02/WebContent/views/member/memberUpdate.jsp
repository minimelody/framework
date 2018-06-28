<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 정보 수정</title>
</head>
<body>
<h1>정보</h1>
<form action="/mybatisTest7" method="post">
ID : <input type="text" name="userId" value="${member.userId }" readonly><br>
패스워드 : <input type="password" name="userPw" value="${member.userPw}"><br>
닉네임 : <input type="text" name="userNick" value="${member.userNick }"><br>
전화번호 : <input type="text" name="userTel" value="${member.userTel }"><br>
<input type="submit" value="전송"/><br>
</form>
</body>
</html>