<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Home</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/popper.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.slim.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/ownStyle.css">
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/resources/images/user.png" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/sweetalert.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/sweetalert-min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/sweetalert.js"></script>
<style type="text/css">
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
	</c:choose>
	<div class="container-fluid">
		<div class="leftBar">
			<div class="row">
				<div class="col-sm-3">
					<img
						src="${pageContext.request.contextPath}/resources/img/user.png"
						class="logo">
				</div>
				<div class="col-sm-9">
					<small>Welcome</small>
					<h5>Administrator</h5>
				</div>
			</div>
			<hr>
			<div>
				<div class="row">
					<div class="col-sm-2" style="padding-top: 8px">
						<img
							src="${pageContext.request.contextPath}/resources/css/icons/dashboard.svg"
							class="icon">
					</div>
					<div class="col-sm-10">
						<a href="admin"><button type="button"
								class="btn btn-info menu">DashBoard</button></a>
					</div>
				</div>
				<hr>
				<h5>Client Control</h5>
				<div class="row">
					<div class="col-sm-2" style="padding-top: 8px">
						<img
							src="${pageContext.request.contextPath}/resources/css/icons/message.svg"
							class="icon">
					</div>
					<div class="col-sm-10">
						<a href="userFeedback"><button type="button"
								class="btn btn-info menu">
								<small><b>User's Message</b></small>
							</button></a>
					</div>
				</div>
				<br>
				<div class="row">
					<div class="col-sm-2" style="padding-top: 8px">
						<img
							src="${pageContext.request.contextPath}/resources/css/icons/bill.svg"
							class="icon">
					</div>
					<div class="col-sm-10">
						<a href="reportedProducts"><button type="button"
								class="btn btn-info menu">
								<small><b>Reported Products</b></small>
							</button></a>
					</div>
				</div>
				<hr>
				<hr>
				<h6>Administrator Credentials</h6>
				<div class="row">
					<div class="col-sm-2" style="padding-top: 8px">
						<img
							src="${pageContext.request.contextPath}/resources/css/icons/credentials.svg"
							class="icon">
					</div>
					<div class="col-sm-10">
						<a href="admin"><button type="button"
								class="btn btn-info menu">
								<small><b>Change Credentials</b></small>
							</button></a>
					</div>
				</div>
				<hr>
				<div class="row">
					<div class="col-sm-2" style="padding-top: 8px">
						<img
							src="${pageContext.request.contextPath}/resources/css/icons/logout.svg"
							class="icon">
					</div>
					<div class="col-sm-10">
						<form action="logout" onsubmit="return confirm('Are You Sure ?')">
							<button type="submit" class="btn btn-info menu">
								<small><b>Log Out</b></small>
							</button>
						</form>
					</div>
				</div>
			</div>
		</div>
		<div class="content">
			<div class="topBar">
				<div class="row">
					<div class="col-sm-9">
						<%
							SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
						%>
						Be careful before making changes... (*_*). Today is :
						<%=formatter.format(new Date())%>

					</div>
					<div class="col-sm-3"></div>
				</div>
			</div>
			<div class="infoBox">
				<c:choose>
					<c:when test="${page eq 'dashboard'}">
						<%@ include file="includes/admin/dashboard.jsp"%>
					</c:when>
					<c:when test="${page eq 'feedback'}">
						<%@ include file="includes/admin/feedback.jsp"%>
					</c:when>
					<c:when test="${page eq 'reportedProducts'}">
						<%@ include file="includes/admin/reportedProducts.jsp"%>
					</c:when>
					<c:when test="${page eq 'singleReport'}">
						<%@ include file="includes/admin/singleReport.jsp"%>
					</c:when>
				</c:choose>
			</div>
		</div>
	</div>
</body>
</html>