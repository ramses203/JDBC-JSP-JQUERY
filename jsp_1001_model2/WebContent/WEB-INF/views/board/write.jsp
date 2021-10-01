<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp" %>
<div id="content">
<div>
<h2>게시물 작성하기 화면입니다.</h2>
</div>
<form method="post" action="main.kosmo">
<input type="hidden" name="cmd"  value="board">
<input type="hidden" name="viewName"  value="boardInsert">

<table border="1">
<tr>
   <th colspan="2">게시물 작성하기</th>
</tr>
<tr>
   <td>제목</td>
   <td><input type="text" name="title"></td>
</tr>
<tr>
   <td>작성자</td>
   <td><input type="text" name="writer"></td>
</tr>
<tr>
   <td>내용</td>
   <td><textarea name="content"></textarea></td>
</tr>
<tr>
   <td>비밀번호</td>
   <td><input type="password" name="pwd"></td>
</tr>
<tr>
   <th colspan="2"><input type="submit" value="등록">
   <input type="reset" value="취소">
   </th>
</tr>
</table>
</form>


</div><%--contenst 종료 --%>
</div><%--wrap 종료 --%>
</body>
</html>