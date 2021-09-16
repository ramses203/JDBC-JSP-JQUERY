<%@page import="dao.MemberDao"%>
<%@page import="vo.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%request.setCharacterEncoding("euc-kr"); %>
<jsp:useBean id="vo" class="vo.MemberDTO"/>
<jsp:setProperty property="*" name="vo"/>
<%
	StringBuilder sb = new StringBuilder();
	sb.append(request.getParameter("tel1")).append("-");
	sb.append(request.getParameter("tel2")).append("-");
	sb.append(request.getParameter("tel3"));
	vo.setTel(sb.toString());
	MemberDao.getDao().inserDemo(vo);
%>

<jsp:getProperty property="id" name="vo"/><br>
<jsp:getProperty property="name" name="vo"/><br>
<jsp:getProperty property="age" name="vo"/><br>
<jsp:getProperty property="tel" name="vo"/><br>