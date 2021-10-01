<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page trimDirectiveWhitespaces="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
[<c:forEach var="vo" items="${list }" varStatus="i">{"num":"${vo.num}","imgn":"${vo.imgn}"}<c:if test="${i.count != snum }">,</c:if></c:forEach>]
