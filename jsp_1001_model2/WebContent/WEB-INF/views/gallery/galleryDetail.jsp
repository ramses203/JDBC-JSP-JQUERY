<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp" %>
<div id="content">
<div>
<h2>Gallery 작성하기 화면입니다.</h2>
</div>

<table border="1">
<tr>
   <th colspan="2">Gallery 상세보기</th>
</tr>
<tr>
   <td>제목</td>
   <td><input type="text" name="subject" value="${vo.subject }" readonly="readonly"></td>
</tr>
<tr>
   <td>작성자</td>
   <td><input type="text" name="wid" value="${vo.wid }" readonly="readonly"></td>
</tr>
<tr>
   <td>내용</td>
   <td><textarea name="cont" readonly="readonly">${vo.cont }</textarea></td>
</tr>
<tr>
   <td>이미지</td>
   <td>
   <img src="Upload/${vo.imgn }" style="width: 180px">
   </td>
</tr>
<tr>
   <th colspan="2"><input type="submit" value="등록">
   <input type="button" value="리스트" onclick="location='main.kosmo?cmd=gallery&viewName=galleryList'">
   <input type="button" value="수정">
   <input type="button" value="삭제">
   </th>
</tr>
</table>

</div><%--contenst 종료 --%>
</div><%--wrap 종료 --%>
</body>
</html>