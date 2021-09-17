<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
    <form action="member_res.jsp" method="post">
        ID : <input type="text" name="id"><br>
        Password : <input type="password" name="pw"><br>
        Name : <input type="text" name="name"><br>
        Email : <input type="text" name="email1">@
        <select name="email2">
            <option value="naver.co.kr">naver.co.kr</option>
            <option value="Daum.co.kr">daum.co.kr</option>
            <option value="Yahoo.com">Yahoo.com</option>
        </select><br>
        Phone : 
        <select name="phone1">
            <option value="010">010</option>
        </select> - <input type="tel" name="phone2"> - <input type="tel" name="phone3"><br>
        주민번호 : <input type="text" name="socialnum1"> - <select name="socialnum2">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
        </select><br>
        <input type="submit" value="전송">
    </form>
</body>
</html>