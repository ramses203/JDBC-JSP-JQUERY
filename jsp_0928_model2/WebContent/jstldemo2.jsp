<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- JSTL ���̺귯���� �߰��Ѵ�. (lib)
	taglib�� �߰��Ѵ�.
	JSTL�� ����Ѵ�.
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
<p style="color: orange">ȯ���մϴ�. Guest��</p>
</c:when>
<c:when test="${param.type eq 'member' }">
<p style="color: blue">ȯ���մϴ�. MEMBER��</p>
</c:when>
<c:otherwise>
	${param.type }���� ��������?
</c:otherwise>
</c:choose>
</body>
</html>