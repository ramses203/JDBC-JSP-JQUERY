<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp" %>
<div id="content">
<div>
<h2>Gallery 작성하기 화면입니다.</h2>
</div>
<form method="post" action="fileup.kos"  enctype="multipart/form-data">
<input type="hidden" name="cmd"  value="galleryInsert">
<input type="hidden" name="reip"  value="<%=request.getRemoteAddr()%>">


<table border="1">
<tr>
   <th colspan="2">Gallery 작성하기</th>
</tr>
<tr>
   <td>제목</td>
   <td><input type="text" name="subject"></td>
</tr>
<tr>
   <td>작성자</td>
   <td><input type="text" name="wid"></td>
</tr>
<tr>
   <td>내용</td>
   <td><textarea name="cont"></textarea></td>
</tr>
<tr>
   <td>이미지</td>
   <td><input type="file" name="imgn"></td>
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