<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../head.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="content">
<table>
         <tr>
            <th colspan="5">�Խù� ���</th>
         </tr>
         <tr>
            <td>��ȣ</td>
            <td>����</td>
            <td>�ۼ���</td>
            <td>��ȸ��</td>
            <td>�����</td>
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
            <input type="button" value="�� �۾���" 
            onclick="location='main.kosmo?cmd=boardwriter'">
            </th>
         </tr>
      </table>
      
      
</div><%--contenst ���� --%>
</div><%--wrap ���� --%>
</body>
</html>