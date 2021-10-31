<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <script src="resources/js/pxtrack.js"></script>
 <script src="resources/js/angular.min.js"></script>
<div id="main">
   <div class="main_detail">
      <!-- 작성 시작 -->
      <div id="notebooks" ng-app="notebooks" ng-controller="NotebookListCtrl">
          <select ng-model="orderList">
            <option value="id">ID</option>
            <option value="tier">TIER</option>
            <option value="friend">FRIEND</option>
         </select>
         <input type="text" id="query" ng-model="query" />
         <ul id="notebook_ul" class="ful">
            <li class="fli"
               ng-repeat="notebook in notebooks | filter:query | orderBy: orderList">
               ID: {{notebook.id}}<br /> <a href="userdetailform?id={{notebook.id}}&addfriend={{notebook.friend}}">friend: {{notebook.friend}}</a><br />
               <div class="right top"> <img class="img-profile rounded-circle" src={{notebook.tier}} style="max-width: 50px"></div>
            </li>
         </ul>
         <span>Number of friends: {{notebooks.length}} 명</span>
      </div>

      <!-- 작성 종료 -->
   </div>
</div>
<script>
var notebooks = angular.module('notebooks', []);

notebooks.controller('NotebookListCtrl', function($scope) {
  $scope.notebooks = [
   <c:forEach var="f" items="${flist }">
    {'id': '${f.FRIENDID }',
     'tier':'resources/img/tier/${f.TIER }.jpg' ,
     'friend': 
        <c:choose>
           <c:when test="${f.ADDFRIEND == 'friend'}">'friend'</c:when>
           <c:when test="${f.ADDFRIEND == 'friendrequest'}">'friendrequest'</c:when>
           <c:when test="${f.ADDFRIEND == 'friendresponse'}">'friendresponse'</c:when>
        </c:choose>
   },
     </c:forEach>
  
  ];
  $scope.orderList = "id";
});

</script>
