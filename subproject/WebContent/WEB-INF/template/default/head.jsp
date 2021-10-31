<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="kr">

<head>
  <link href="resources/img/logo.png" rel="icon"> <!-- Ÿ��Ʋ �ΰ� -->
  
</head>

<body id="page-top">
  <div id="wrapper">
    <!-- Sidebar -->
    <ul class="navbar-nav sidebar sidebar-light accordion" id="accordionSidebar">
    
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="javascript:changeView(4)"> <!-- �ΰ�   -->
        <div class="sidebar-brand-icon">
          <img src="resources/img/logo.jpg"> <!-- �ۼ��� �̿��� / �ΰ� �κ� -->
        </div>
        <div class="sidebar-brand-text mx-3">������Ʈ</div> <!-- �ۼ��� Ȳ���� /  ȸ��� -->
      </a>
      
      <hr class="sidebar-divider my-0">
      
      <li class="nav-item active">                                                                
        <a class="nav-link" href="javascript:changeView(0)">	
          <i class="fas fa-fw fa-tachometer-alt"></i>												<!-- ������ -->
          <span>Dashboard</span></a>																<!-- Ÿ��Ʋ -->
      </li>
      
      <hr class="sidebar-divider">
      
      <div class="sidebar-heading">                                                                <!-- Ÿ��Ʋ -->
        	����������
      </div>
      <li class="nav-item">
       <a class="nav-link" href="javascript:changeView(1)">
          <i class="far fa-fw fa-window-maximize"></i>												<!-- ������ -->
          <span>Matching</span>																	<!-- Ÿ��Ʋ -->
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="javascript:changeView(2)">
          <i class="fab fa-fw fa-wpforms"></i>																							<!-- ������ -->
          <span>Search</span>																											<!-- Ÿ��Ʋ -->
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="javascript:changeView(5)">
          <i class="fab fa-fw fa-wpressr"></i>																							<!-- ������ -->
          <span>Friend</span>																											<!-- Ÿ��Ʋ -->
        </a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="javascript:changeView(7)">
          <i class="fab fa-fw fa-algolia"></i>																							<!-- ������ -->
          <span>Access</span>																											<!-- Ÿ��Ʋ -->
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="javascript:changeView(8)">
          <i class="fab fa-fw fa-wpressr"></i>																							<!-- ������ -->
          <span>Gameinsert</span>																											<!-- Ÿ��Ʋ -->
        </a>
      </li>
  	 
      <hr class="sidebar-divider">
      
    </ul>
    																											<!-- Sidebar END -->
    
    <div id="content-wrapper" class="d-flex flex-column">
      <div id="content">
      
        																										<!-- TopBar �˸� Ŭ���� ������ �˾�â -->
        <nav class="navbar navbar-expand navbar-light bg-navbar topbar static-top">
          <button id="sidebarToggleTop" class="btn btn-link rounded-circle mr-3">
            <i class="fa fa-bars"></i>																			<!-- ���г� ������ -->
          </button>
          <ul class="navbar-nav ml-auto">
            
            <li class="nav-item dropdown no-arrow mx-1">
            <c:if test="${sessionID != null }">
              <a class="nav-link dropdown-toggle" href="javascript:changeView(5)" 
	                aria-haspopup="true" aria-expanded="false">
	                <i class="fas fa-bell fa-fw"></i>															 <!-- �˸� ������ -->
                <span class="badge badge-danger badge-counter">${friendmsg}</span>										 <!-- �˸� �� -->
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
                <img class="img-profile rounded-circle" src="resources/img/tier/${mytier }.jpg" style="max-width: 60px">				<!-- �α��� ������ -->
                <span class="ml-2 d-none d-lg-inline text-white small">${sessionID }</span>	
                </c:if>							<!-- ���̵� -->
              </a>
              <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown" style="height: auto;">		<!-- ���̵� Ŭ���� ���� -->
                <a class="dropdown-item" href="javascript:changeView(6)">			<!-- ȸ������ ���� -->
                  <i class="fas fa-address-book fa-sm fa-fw mr-2 text-gray-400"></i>
                	  ȸ������ ����
                </a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="javascript:changeView(3)">			<!-- �α׾ƿ� -->
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
	
	if(value == "0") // HOME ��ư Ŭ���� ùȭ������ �̵�
	{
		location.href="mypageform";
	}
	else if(value == "1") // �α��� ��ư Ŭ���� �α��� ȭ������ �̵�
	{	
		location.href="recommend";
	}
	else if(value == "2") // ȸ������ ��ư Ŭ���� ȸ������ ȭ������ �̵�
	{	
		location.href="multisearchform";
	}
	else if(value == "3") // �α׾ƿ� ��ư Ŭ���� �α׾ƿ� ó��
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

       
      