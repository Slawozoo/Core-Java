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
<!--================Single Product Area =================-->
<div class="product_image_area">
	<div class="container">
		<div class="row s_product_inner">
			<div class="col-lg-6">
				<div class="owl-carousel owl-theme s_Product_carousel">
					<div class="single-prd-item">
						<img class="img-fluid"
							src="data:image/png;image/jpg;image/jpeg;image/gif;base64,${product.photo1}"
							alt="Image Error" style="height:610px; width:auto">
					</div>
					<div class="single-prd-item">
						<img class="img-fluid"
							src="data:image/png;image/jpg;image/jpeg;image/gif;base64,${product.photo2}"
							alt="Image Error" style="height:610px; width:auto">
					</div>
					<div class="single-prd-item">
						<img class="img-fluid"
							src="data:image/png;image/jpg;image/jpeg;image/gif;base64,${product.photo3}"
							alt="Image Error" style="height:610px; width:auto">
					</div>
				</div>
			</div>
			<div class="col-lg-5 offset-lg-1">
				<div class="s_product_text">
					<h3>${product.productName}</h3>
					<h2>Rs.${product.price}</h2>
					<table class="table">
						<tr>
							<th>Category</th>
							<td>${product.category}</td>
						</tr>
						<tr>
							<th>Used For</th>
							<td>${product.usedFor}</td>
						</tr>
						<tr>
							<th>Condition</th>
							<td><c:choose>
									<c:when test="${product.productCondition eq 1}">
										Normal
									</c:when>
									<c:when test="${product.productCondition eq 2}">
										Good
									</c:when>
									<c:when test="${product.productCondition eq 3}">
										Very Good
									</c:when>
									<c:when test="${product.productCondition eq 4}">
										Excellent
									</c:when>
								</c:choose></td>
						</tr>
						<tr>
							<th>Price Negotiable</th>
							<td><c:choose>
									<c:when test="${product.priceNegotiable eq true}">
										Yes
									</c:when>
									<c:when test="${product.priceNegotiable eq false}">
										No
									</c:when>
								</c:choose></td>
						</tr>
						<tr>
							<th>Warranty Period</th>
							<td>${product.warrantyPeriod}</td>
						</tr>
						<tr>
							<th>Delivery Area</th>
							<td>${product.deliveryArea}</td>
						</tr>
						<tr>
							<th>Delivery Charges</th>
							<td>Rs. ${product.deliveryCharges}</td>
						</tr>
						<tr>
							<th>Uploaded In</th>
							<td>${product.regDate}</td>
						</tr>
						<tr>
							<th style="color: red">Expired In</th>
							<td>${product.delDate}</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
<!--================End Single Product Area =================-->

<!--================Product Description Area =================-->
<section class="product_description_area">
	<div class="container">
		<ul class="nav nav-tabs" id="myTab" role="tablist">
			<li class="nav-item"><a class="nav-link" id="seller-tab"
				data-toggle="tab" href="#seller" role="tab" aria-controls="seller"
				aria-selected="true">Seller's Info</a></li>
			<li class="nav-item"><a class="nav-link" id="profile-tab"
				data-toggle="tab" href="#profile" role="tab" aria-controls="profile"
				aria-selected="false">Specification</a></li>
			<li class="nav-item" style="text-align:left"><a class="nav-link" data-toggle="modal" href="#myModal">
				Comments</a>
					<div class="modal fade" id="myModal" role="dialog" style="top: 20%">
						<div class="modal-dialog modal-lg">
							<div class="modal-content">
								<div class="modal-header">
									<h4 class="modal-title">Comments</h4>
									<button type="button" class="close" data-dismiss="modal">&times;</button>
								</div>
								<div class="modal-body">
									<%@ include file="user/comment.jsp"%>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
								</div>
							</div>
						</div>
					</div>
			</li>
			<li class="nav-item"><a class="nav-link" id="report-tab"
				data-toggle="tab" href="#report" role="tab" aria-controls="report"
				aria-selected="false">Report Product</a></li>
		</ul>
		<div class="tab-content" id="myTabContent">
			<div class="tab-pane fade" id="seller" role="tabpanel"
				aria-labelledby="seller-tab">
				<div class="table-responsive">
					<table class="table">
						<tbody>
							<tr>
								<td>
									<h5>Name</h5>
								</td>
								<td>
									<h5>${seller.fullName}</h5>
								</td>
							</tr>
							<tr>
								<td>
									<h5>Email</h5>
								</td>
								<td>
									<h5>${seller.email}</h5>
								</td>
							</tr>
							<tr>
								<td>
									<h5>Contact No</h5>
								</td>
								<td>
									<h5>${seller.contactNum}</h5>
								</td>
							</tr>
							<tr>
								<td>
									<h5>Registered Date</h5>
								</td>
								<td>
									<h5>${seller.regDate}</h5>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div class="tab-pane fade" id="profile" role="tabpanel"
				aria-labelledby="profile-tab">
				<div class="table-responsive">
					<table class="table">
						<tbody>
							<c:forEach items="${specification}" var="spec">
								<tr>
									<td>
										<h5>${spec.key}</h5>
									</td>
									<td>
										<h5>${spec.value}</h5>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			<div class="tab-pane fade" id="contact" role="tabpanel"
				aria-labelledby="contact-tab"></div>
			<div class="tab-pane fade" id="report" role="tabpanel"
				aria-labelledby="report-tab">
				<div class="table-responsive">
					<h4>
						Your report will be recorded along with your ID. <span
							style="color: red">[ Your report will be recorded if only
							you are Logged in. ]</span>
					</h4>
					<h3>Problem with the Product ? State it down.</h3>
					<form class="row contact_form" action="productReport" method="post"
						id="contactForm" novalidate="novalidate"
						onsubmit="return confirm('Confirm Sending Report ?')">
						<div class="col-md-12">
							<div class="form-group">
								<input type="hidden" name="productId" value="${product.id}" />
								<textarea id="name" name="report" cols="60" rows="8"></textarea>
							</div>
						</div>
						<div class="col-md-12 text-left">
							<button type="submit" value="submit" class="btn primary-btn">Submit
								Now</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</section>
<!--================End Product Description Area =================-->