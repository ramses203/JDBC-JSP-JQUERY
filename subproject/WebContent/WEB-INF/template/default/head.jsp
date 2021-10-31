<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="kr">

<head>
  <link href="resources/img/logo.png" rel="icon"> <!-- 타이틀 로고 -->
  
</head>

<body id="page-top">
  <div id="wrapper">
    <!-- Sidebar -->
    <ul class="navbar-nav sidebar sidebar-light accordion" id="accordionSidebar">
    
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="javascript:changeView(4)"> <!-- 로고   -->
        <div class="sidebar-brand-icon">
          <img src="resources/img/logo.jpg"> <!-- 작성자 이연준 / 로고 부분 -->
        </div>
        <div class="sidebar-brand-text mx-3">성열차트</div> <!-- 작성자 황진우 /  회사명 -->
      </a>
      
      <hr class="sidebar-divider my-0">
      
      <li class="nav-item active">                                                                
        <a class="nav-link" href="javascript:changeView(0)">	
          <i class="fas fa-fw fa-tachometer-alt"></i>												<!-- 아이콘 -->
          <span>Dashboard</span></a>																<!-- 타이틀 -->
      </li>
      
      <hr class="sidebar-divider">
      
      <div class="sidebar-heading">                                                                <!-- 타이틀 -->
        	마이페이지
      </div>
      <li class="nav-item">
       <a class="nav-link" href="javascript:changeView(1)">
          <i class="far fa-fw fa-window-maximize"></i>												<!-- 아이콘 -->
          <span>Matching</span>																	<!-- 타이틀 -->
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="javascript:changeView(2)">
          <i class="fab fa-fw fa-wpforms"></i>																							<!-- 아이콘 -->
          <span>Search</span>																											<!-- 타이틀 -->
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="javascript:changeView(5)">
          <i class="fab fa-fw fa-wpressr"></i>																							<!-- 아이콘 -->
          <span>Friend</span>																											<!-- 타이틀 -->
        </a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="javascript:changeView(7)">
          <i class="fab fa-fw fa-algolia"></i>																							<!-- 아이콘 -->
          <span>Access</span>																											<!-- 타이틀 -->
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="javascript:changeView(8)">
          <i class="fab fa-fw fa-wpressr"></i>																							<!-- 아이콘 -->
          <span>Gameinsert</span>																											<!-- 타이틀 -->
        </a>
      </li>
  	 
      <hr class="sidebar-divider">
      
    </ul>
    																											<!-- Sidebar END -->
    
    <div id="content-wrapper" class="d-flex flex-column">
      <div id="content">
      
        																										<!-- TopBar 알림 클릭시 나오는 팝업창 -->
        <nav class="navbar navbar-expand navbar-light bg-navbar topbar static-top">
          <button id="sidebarToggleTop" class="btn btn-link rounded-circle mr-3">
            <i class="fa fa-bars"></i>																			<!-- 삼학년 아이콘 -->
          </button>
          <ul class="navbar-nav ml-auto">
            
            <li class="nav-item dropdown no-arrow mx-1">
            <c:if test="${sessionID != null }">
              <a class="nav-link dropdown-toggle" href="javascript:changeView(5)" 
	                aria-haspopup="true" aria-expanded="false">
	                <i class="fas fa-bell fa-fw"></i>															 <!-- 알림 아이콘 -->
                <span class="badge badge-danger badge-counter">${friendmsg}</span>										 <!-- 알림 수 -->
              </a>
              </c:if>
            </li>
            <c:if test="${sessionID != null }">
           	 <div class="topbar-divider d-none d-sm-block"></div>
            </c:if>
            <li class="nav-item dropdown no-arrow">
              <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown"
                aria-haspopup="true" aria-expanded="false">
                <c:if test="${sessionID != null }">
                <img class="img-profile rounded-circle" src="resources/img/tier/${mytier }.jpg" style="max-width: 60px">				<!-- 로그인 아이콘 -->
                <span class="ml-2 d-none d-lg-inline text-white small">${sessionID }</span>	
                </c:if>							<!-- 아이디 -->
              </a>
              <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown" style="height: auto;">		<!-- 아이디 클릭시 나옴 -->
                <a class="dropdown-item" href="javascript:changeView(6)">			<!-- 회원정보 수정 -->
                  <i class="fas fa-address-book fa-sm fa-fw mr-2 text-gray-400"></i>
                	  회원정보 수정
                </a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="javascript:changeView(3)">			<!-- 로그아웃 -->
                  <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                  Logout
                </a>
              </div>
            </li>
          </ul>
        </nav>
        <!-- Topbar -->
        
        <script>
function changeView(value){
	
	if(value == "0") // HOME 버튼 클릭시 첫화면으로 이동
	{
		location.href="mypageform";
	}
	else if(value == "1") // 로그인 버튼 클릭시 로그인 화면으로 이동
	{	
		location.href="recommend";
	}
	else if(value == "2") // 회원가입 버튼 클릭시 회원가입 화면으로 이동
	{	
		location.href="multisearchform";
	}
	else if(value == "3") // 로그아웃 버튼 클릭시 로그아웃 처리
	{
		location.href="logoutProcess";
	}
	else if(value == "4") 
	{
		location.href="landing";
	}
	else if(value == "5")
	{
		location.href="myfriendform";
	}
	else if(value == "6")
	{
		location.href="userinfoform";
	}
	else if(value == "7")
	{	
		location.href="loggingform";
	}
	else if(value == "8")
	{
		location.href="gameInsertForm";	
	}
}
</script>

       
      