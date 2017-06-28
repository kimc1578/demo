<%@page import="kr.co.bit.commons.URLs"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<script type="text/javascript">

$(document).ready(function(){
	
	$("#userid").on({
		"blur":function(){
			var userid = $(this).serialize();
			//alert(userId);
			$.ajax({
				url:"/User/id_chk",
				data : userid,
				dataType : "json",
				success:function(result){
					$("#id_chk").html("");
					$("#id_chk").append(result.id_chk);
				}
			});
		}
	});
 
});


</script>


</head>


<body>

<div class="container">
		<div class="row">
			<div class="page-header">
				<h2>회원가입</h2>
			</div>
			<div class="col-md-3">
				<div class="login-box well">
					<form role="form" method="post" action=${URLs.URI_JOIN_FULL }>
						<legend>회원가입</legend>
						<div class="form-group">
							<label for="userid">아이디</label> <input name="userid"
								value='' id="userid" placeholder="User ID"
								type="text" class="form-control" />
							<div id="id_chk"></div>
						</div>
						<div class="form-group">
							<label for="password">비밀번호</label> <input name="userpw"
								id="password" value='' placeholder="Password" type="password"
								class="form-control" />
						</div>
						<div class="form-group">
							<label for="username">이름</label> <input name="username"
								value='' id="username" placeholder="User Name"
								type="text" class="form-control" />
						</div>
						<div class="form-group">
							<label for="useremail">이메일</label> <input name="email"
								value='' id="useremail" placeholder="User Email"
								type="text" class="form-control" />
						</div>
						
						<div class="form-group">
							<input type="submit"
								class="btn btn-default btn-login-submit"
								value="Join" />
							<input type="reset" class="btn btn-default "
								value="reset"/>
							<a class="btn btn-info" href="${URLs.URI_MAIN }">로그인창</a>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	

</body>
</html>