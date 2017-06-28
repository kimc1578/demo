<%@page import="kr.co.bit.commons.Pages"%>
<%@page import="java.util.ArrayList"%>
<%-- <%@page import="kr.co.bit.board.vo.BoardListVO"%>--%>
<%@page import="kr.co.bit.commons.URLs"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.bit.user.vo.LoginVO"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>




<%-- <%
	LoginVO loginVO = new LoginVO();
	loginVO = (LoginVO)session.getAttribute("LOGIN");
	
	if(loginVO == null){
%> --%>


<c:choose>
	<c:when test="${sessionScope.LOGIN == null }">
	<section id="login"> 
		<jsp:include page="../View/User/Login.jsp" flush="false" />
	</section>
	</c:when>

</c:choose>

</body>
</html>



