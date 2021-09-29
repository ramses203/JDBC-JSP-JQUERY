<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="content">
<table>
         <tr>
            <th colspan="5">게시물 목록</th>
         </tr>
         <tr>
            <td>번호</td>
            <td>제목</td>
            <td>작성자</td>
            <td>조회수</td>
            <td>등록일</td>
         </tr>
        
        <c:forEach var="e" items="${blist }">
           <tr>
            <td>${e.no }</td>
            <td><a href="main.kosmo?cmd=boardinfo&no=${e.no }"> ${e.title }</a></td>
            <td>${e.writer }</td>
            <td>${e.hit }</td>
            <td>${e.regdate }</td>
         </tr>
         </c:forEach>
         
            <tr>
            <th colspan="5">
            <input type="button" value="새 글쓰기" 
            onclick="location='main.kosmo?cmd=boardwriter'">
            </th>
         </tr>
      </table>
      
      
</div><%--contenst 종료 --%>
</div><%--wrap 종료 --%>
</body>
</html>