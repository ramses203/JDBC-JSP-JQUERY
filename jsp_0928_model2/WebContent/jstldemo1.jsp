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
<%--host?type=guest,member --%>
<%--<c:if test="����"> --%>
<c:if test="${param.type eq 'guest' }">
	<p style="color: orange">ȯ���մϴ�. Guest��</p>
</c:if><%--�Ķ����Ÿ���� guest�� if���� �����ض� --%>

<c:if test="${param.type eq 'member' }">
	<p style="color: blue">ȯ���մϴ�. member��</p>
</c:if><%--�Ķ����Ÿ���� member�� if���� �����ض� --%>

</body>
</html>