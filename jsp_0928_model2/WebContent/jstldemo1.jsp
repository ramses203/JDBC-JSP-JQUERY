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
<%--host?type=guest,member --%>
<%--<c:if test="조건"> --%>
<c:if test="${param.type eq 'guest' }">
	<p style="color: orange">환영합니다. Guest님</p>
</c:if><%--파라미터타입이 guest면 if문을 실행해라 --%>

<c:if test="${param.type eq 'member' }">
	<p style="color: blue">환영합니다. member님</p>
</c:if><%--파라미터타입이 member면 if문을 실행해라 --%>

</body>
</html>