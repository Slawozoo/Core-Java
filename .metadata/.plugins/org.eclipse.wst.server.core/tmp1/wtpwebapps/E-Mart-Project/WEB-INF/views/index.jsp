<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.File"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Emart</title>
<link rel="icon"
	href="${pageContext.request.contextPath}/resources/img/Fevicon.png"
	type="image/png">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/vendors/bootstrap/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/vendors/fontawesome/css/all.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/vendors/themify-icons/themify-icons.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/vendors/nice-select/nice-select.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/vendors/owl-carousel/owl.theme.default.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/vendors/owl-carousel/owl.carousel.min.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

<!--  other css -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css">
<!--  -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/sweetalert.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/sweetalert-min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/sweetalert.js"></script>
<style>
.error {
	color: red;
}

.success {
	color: green;
}
.select{
	width:230px;
}
</style>
</head>
<body style="color:black">
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
	<!--================ Start Header Menu Area =================-->
	<%@ include file="includes/header.jsp"%>
	<!--================ End Header Menu Area =================-->

	<c:choose>
		<c:when test="${page eq 'mainBody'}">
			<%@ include file="includes/mainBody.jsp"%>
		</c:when>
		<c:when test="${page eq 'contact'}">
			<%@ include file="includes/contact.jsp"%>
		</c:when>
		<c:when test="${page eq 'userLogin'}">
			<%@ include file="includes/userLogin.jsp"%>
		</c:when>
		<c:when test="${page eq 'forgetPass'}">
			<%@ include file="includes/user/forgetPass.jsp"%>
		</c:when>
		<c:when test="${page eq 'validationCode'}">
			<%@ include file="includes/user/validationCode.jsp"%>
		</c:when>
		<c:when test="${page eq 'recoverCredentials'}">
			<%@ include file="includes/user/recoverCredentials.jsp"%>
		</c:when>
		<c:when test="${page eq 'electronics'}">
			<%@ include file="includes/category/electronics.jsp"%>
		</c:when>
		<c:when test="${page eq 'computers'}">
			<%@ include file="includes/category/computers.jsp"%>
		</c:when>
		<c:when test="${page eq 'mobiles'}">
			<%@ include file="includes/category/mobiles.jsp"%>
		</c:when>
		<c:when test="${page eq 'clothes'}">
			<%@ include file="includes/category/clothes.jsp"%>
		</c:when>
		<c:when test="${page eq 'cosmetics'}">
			<%@ include file="includes/category/cosmetics.jsp"%>
		</c:when>
		<c:when test="${page eq 'others'}">
			<%@ include file="includes/category/others.jsp"%>
		</c:when>
		<c:when test="${page eq 'singleProduct'}">
			<%@ include file="includes/singleProduct.jsp"%>
		</c:when>
		<c:when test="${page eq 'sellProduct'}">
			<%@ include file="includes/user/sellProduct.jsp"%>
		</c:when>
		<c:when test="${page eq 'sellProductInvalid'}">
			<script>
				swal("Login Required", "You must login First to sell your product.!!", "info");
			</script>
			<%@ include file="includes/userLogin.jsp" %>
		</c:when>
		
		<c:when test="${page eq 'register'}">
			<%@ include file="includes/register.jsp"%>
		</c:when>
		<c:when test="${page eq 'confirmEmail'}">
			<%@ include file="includes/confirmEmail.jsp"%>
		</c:when>
		<c:when test="${page eq 'paidProduct'}">
			<%@ include file="includes/user/paidProduct.jsp"%>
		</c:when>
	</c:choose>
	<!--================ Start footer Area  =================-->
	<%@ include file="includes/footer.jsp"%>
	<!--================ End footer Area  =================-->



	<script
		src="${pageContext.request.contextPath}/resources/vendors/jquery/jquery-3.2.1.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/vendors/bootstrap/bootstrap.bundle.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/vendors/skrollr.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/vendors/owl-carousel/owl.carousel.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/vendors/nice-select/jquery.nice-select.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/vendors/jquery.ajaxchimp.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/vendors/mail-script.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
</body>
</html>