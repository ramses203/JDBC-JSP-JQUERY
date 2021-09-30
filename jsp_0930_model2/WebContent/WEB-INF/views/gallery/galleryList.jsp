<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="content">
<table>
         <tr>
            <th colspan="5">Gallery List</th>
         </tr>
         <tr>
            <td>번호</td>
            <td>이미지</td>
            <td>제목</td>
            <td>작성자</td>
            <td>등록일</td>
         </tr>
        
       <c:forEach var="vo" items="${glist }">
       <tr>
            <td>${vo.num }</td>
            <td>${vo.imgn }</td>
            <td>${vo.subject }</td>
            <td>${vo.wid }</td>
            <td>${vo.gdate }</td>
         </tr>
       </c:forEach>
         
            <tr>
            <th colspan="5">
            <input type="button" value="새 글쓰기" 
            onclick="location='main.kosmo?cmd=gallery&viewName=galleryForm'">
            </th>
         </tr>
      </table>
      
      
</div><%--contenst 종료 --%>
</div><%--wrap 종료 --%>
</body>
</html>