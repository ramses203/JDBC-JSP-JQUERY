<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- JSTL 라이브러리를 추가한다. (lib)
	taglib를 추가한다.
	JSTL을 사용한다.
 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jstl</title>
</head>
<body>
<c:choose>
<c:when test="${param.type eq 'guest' }">
<p style="color: orange">환영합니다. Guest님</p>
</c:when>
<c:when test="${param.type eq 'member' }">
<p style="color: blue">환영합니다. MEMBER님</p>
</c:when>
<c:otherwise>
	${param.type }님은 누구세요?
</c:otherwise>
</c:choose>
</body>
</html>