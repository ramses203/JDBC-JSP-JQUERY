<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
클라이언트IP * =<%request.getRemoteAddr(); %>
요청정보길이 * =<%request.getContentLength(); %>
요청정보 인코딩 =<%request.getCharacterEncoding(); %>
요청정보 컨텐츠타입*=<%request.getContentType(); %>
요청정보 프로토콜=<%request.getProtocol(); %>
요청정보 전송방식 *=<%request.getMethod(); %>
요청 URI=<%request.getRequestURI(); %>
컨텍스트 경로 * =<%request.getContextPath(); %>
서버이름 =<%request.getServerName(); %>
서버포트  =<%request.getServerPort(); %>

</body>
</html>