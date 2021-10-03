<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp" %>
<div id="content">
<div>
<h2>마이페이지 화면입니다.</h2>
</div>
<table border="1">
<tr>
   <th colspan="2">MY Page</th>
</tr>
<tr>
   <td>회원님의 아이디</td>
   <td><input type="text" name="id" value="${vo.id }" readonly="readonly"></td>
</tr>
<tr>
   <td>회원님의 성함</td>
   <td><input type="text" name="name" value="${vo.name }" readonly="readonly"></td>
</tr>
<tr>
   <td>회원님의 이메일</td>
   <td><input type="text" name="email" value="${vo.email }" readonly="readonly"></td>
</tr>
<tr>
   <td>회원님의 나이</td>
   <td><input type="text" name="age" value="${vo.age }" readonly="readonly"></td>
</tr>
<tr>
   <td>회원님의 가입일자</td>
   <td><input type="text" name="mdate" value="${vo.mdate }" readonly="readonly"></td>
</tr>
<tr>
   <th colspan="2">
   <input type="button" value="회원정보수정" onclick="location='main.kosmo?cmd=member&viewName=memberUpdate'">
   <input type="button" value="회원정보삭제" onclick="location='main.kosmo?cmd=member&viewName=memberDelete'">
   </th>
</tr>
</table>

</div><%--contenst 종료 --%>
</div><%--wrap 종료 --%>
</body>
</html>