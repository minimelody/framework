<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 정보</title>
</head>
<body>
<form action="/update">
ID : ${member.memberId}<br>
<input type="hidden" value="${member.memberId }" name="memberId">
PW : <input type="password" value="${member.memberPw}" name="memberPw"><br>
PW_re : <input type="password" value="${member.memberPw }"><br>
이름 : ${member.memberName }<br>
지역 : ${member.memberAddr }<br>

<c:if test="${member.gender eq '남'}">
성별 : <input type="radio" disabled checked> 남성 <input type="radio" disabled> 여성<br>
</c:if>
<c:if test="${member.gender eq '여'}">
성별 : <input type="radio" disabled> 남성 <input type="radio" disabled checked> 여성<br>
</c:if>


취미 : ${member.hobby }<br>
가입일 : ${member.regDate}<br>
<input type="submit" value="변경하기">
</form>
</body>
</html>