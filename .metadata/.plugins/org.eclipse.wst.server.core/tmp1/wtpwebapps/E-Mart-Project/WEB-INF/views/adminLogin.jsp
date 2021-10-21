<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/admin/bootstrap.min.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/admin/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/admin/bootstrapp.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/admin/popper.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/admin/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/admin/jquery-3.3.1.slim.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/admin/ownStyle.css">
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/resources/images/user.png" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/admin/sweetalert.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/admin/sweetalert-min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/admin/sweetalert.js"></script>
<style type="text/css">
body {
	background-image:
		url("${pageContext.request.contextPath}/resources/img/background.png");
	padding: 50px;
}

.error {
	color: red;
	font-size: small;
	font-style: italic;
}

.success {
	color: green;
	font-style: italic;
	font-size: small;
}
</style>
</head>
<body>
	<c:choose>
		<c:when test="${message.status eq true}">
			<script type="text/javascript">
				swal("Error Occured", "${message.message}", "error");
			</script>
		</c:when>
		<c:when
			test="${message.status eq false and message.message ne 'defaultMessage'}">
			<script type="text/javascript">
				swal("Success.!!!", "${message.message}", "success");
			</script>
		</c:when>
		<c:when
			test="${not empty loginError}">
			<script type="text/javascript">
				swal("Error..!", "${loginError}", "error");
			</script>
		</c:when>
	</c:choose>
	<c:remove var = "loginError" scope = "session" />
	<center>
		<div class="card" style="width: 380px; opacity:0.7">
			<img class="card-img-bottom"
				src="${pageContext.request.contextPath}/resources/img/admin.png"
				alt="Card image" style="width: 100%">
			<div class="card-body">
				<h4 class="card-title">Administrator Login</h4>
				<p class="card-text">
					<%-- <form:form action="admin" method="post" modelAttribute="admin">
						<div class="row" style="padding: 8px">
							<form:errors path="userName" cssClass="error" />
							<div class="col-sm-6">
								<label>User Name : </label>
							</div>
							<div class="col-sm-6">
								<form:input path="userName" type="text" class="form-control"
									placeholder="User Name" name="username" />
							</div>
						</div>
						<div class="row" style="padding: 8px">
							<form:errors path="pwd" cssClass="error" />
							<div class="col-sm-6">
								<label>Password : </label>
							</div>
							<div class="col-sm-6">
								<form:input path="pwd" type="password" class="form-control"
									placeholder="*********" name="password" />
							</div>
						</div>
						<a href="#myModal" data-toggle="modal" style="float:left"><small>Forget Password ?</small></a>
						<button class="btn btn-primary" type="submit">Login</button>
						<form:input path="email" type="hidden" value="admin@gmail.com" />
						<form:input path="contactNo" type="hidden" value="0123456789" />
					</form:form> --%>
					
					<form action="login" method="post">
						<div class="row" style="padding: 8px">
							<div class="col-sm-6">
								<label>User Name : </label>
							</div>
							<div class="col-sm-6">
								<input type="text" class="form-control"
									placeholder="User Name" name="username" required="required"/>
							</div>
						</div>
						<div class="row" style="padding: 8px">
							<div class="col-sm-6">
								<label>Password : </label>
							</div>
							<div class="col-sm-6">
								<input type="password" class="form-control"
									placeholder="*********" name="password" required="required" />
							</div>
						</div>
						<a href="#myModal" data-toggle="modal" style="float:left"><small>Forget Password ?</small></a>
						<button class="btn btn-primary" type="submit">Login</button>
					</form>
			</div>
		</div>
	</center>
	<!-- Button to Open the Modal -->
	

	<!-- The Modal -->
	<div class="modal fade" id="myModal">
		<div class="modal-dialog">
			<div class="modal-content">

				<!-- Modal Header -->
				<div class="modal-header">
					<h4 class="modal-title">Recover Account Using Email</h4>
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>

				<!-- Modal body -->
				<div class="modal-body">
					<form method="post" action="recoveryEmail">
						<div class="form-group">
							<label>Email : </label>
							<input type="email" name="email" class="form-control" placeholder="Enter your Registered Email" required="required" />
						</div>
						<button class="btn btn-primary" type="submit">Use Email</button>
					</form>
				</div>

				<!-- Modal footer -->
				<div class="modal-footer">
					<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
				</div>

			</div>
		</div>
	</div>

	</div>

</body>
</html>