<div class="row">
	<div class="col-sm-7">
		<div id="demo" class="carousel slide" data-ride="carousel">

			<!-- Indicators -->
			<ul class="carousel-indicators">
				<li data-target="#demo" data-slide-to="0" class="active"></li>
				<li data-target="#demo" data-slide-to="1"></li>
				<li data-target="#demo" data-slide-to="2"></li>
			</ul>

			<!-- The slideshow -->
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img
						src="data:image/png;image/jpg;image/jpeg;image/gif;base64,${report[11]}"
						alt="Img Error" style="width: 610px" height="auto">
				</div>
				<div class="carousel-item">
					<img
						src="data:image/png;image/jpg;image/jpeg;image/gif;base64,${report[12]}"
						alt="Img Error" style="width: 610px" height="auto">
				</div>
				<div class="carousel-item">
					<img
						src="data:image/png;image/jpg;image/jpeg;image/gif;base64,${report[13]}"
						alt="Img Error" style="width: 610px" height="auto">
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="carousel-control-prev" href="#demo" data-slide="prev">
				<span class="carousel-control-prev-icon"></span>
			</a> <a class="carousel-control-next" href="#demo" data-slide="next">
				<span class="carousel-control-next-icon"></span>
			</a>

		</div>
	</div>
	<div class="col-sm-5">
		<table class="table table-hover table-striped">
			<tr>
				<th colspan="2"
					style="background-color: #bf00ff; color: white; text-align: center">Product's
					Details</th>
			</tr>
			<tr>
				<th>Product Name</th>
				<td>${report[0]}</td>
			</tr>
			<tr>
				<th>Category</th>
				<td>${report[2]}</td>
			</tr>
			<tr>
				<th>Used For</th>
				<td>${report[5]}</td>
			</tr>
			<tr>
				<th>Condition</th>
				<td><c:choose>
						<c:when test="${report[4] eq 1}">
										Normal
									</c:when>
						<c:when test="${report[4] eq 2}">
										Good
									</c:when>
						<c:when test="${report[4] eq 3}">
										Very Good
									</c:when>
						<c:when test="${report[4] eq 4}">
										Excellent
									</c:when>
					</c:choose></td>
			</tr>
			<tr>
				<th>Price Negotiable</th>
				<td>${report[3]}</td>
			</tr>
			<tr>
				<th>Warranty Period</th>
				<td>${report[8]}</td>
			</tr>
			<tr>
				<th>Delivery Area</th>
				<td>${report[7]}</td>
			</tr>
			<tr>
				<th>Delivery Charges</th>
				<td>Rs. ${report[9]}</td>
			</tr>
			<tr>
				<th>Uploaded In</th>
				<td>${report[10]}</td>
			</tr>
		</table>
	</div>
</div>
<hr>
<div class="row">
	<div class="col-sm-6">
		<table class="table table-hover table-striped">
			<tr>
				<th colspan="2"
					style="background-color: #bf00ff; color: white; text-align: center">Product's
					Specifications</th>
			</tr>
			<c:forEach items="${report[6]}" var="spec">
				<tr>
					<td>
						<h5>${spec.key}</h5>
					</td>
					<td>
						<h5>${spec.value}</h5>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div class="col-sm-6">
		<table class="table table-hover table-striped">
			<tr>
				<th colspan="2"
					style="background-color: #bf00ff; color: white; text-align: center">Seller's
					Details</th>
			</tr>
			<tr>
				<th>Full Name</th>
				<td>${seller.fullName}</td>
			</tr>
			<tr>
				<th>Address</th>
				<td>${seller.address}</td>
			</tr>
			<tr>
				<th>Email</th>
				<td>${seller.email}</td>
			</tr>
			<tr>
				<th>Contact Number</th>
				<td>${seller.contactNum}</td>
			</tr>
			<tr>
				<th>Register Date</th>
				<td>${seller.regDate}</td>
			</tr>
		</table>
	</div>
</div>
<hr>
<div class="row">
	<div class="col-sm-6">
		<table class="table table-hover table-striped">
			<tr>
				<th colspan="2"
					style="background-color: #bf00ff; color: white; text-align: center">Reporter's
					Details</th>
			</tr>
			<tr>
				<th>Full Name</th>
				<td>${report[16]}</td>
			</tr>
			<tr>
				<th>Address</th>
				<td>${report[17]}</td>
			</tr>
			<tr>
				<th>Email</th>
				<td>${report[18]}</td>
			</tr>
			<tr>
				<th>Contact Number</th>
				<td>${report[19]}</td>
			</tr>
			<tr>
				<th>Register Date</th>
				<td>${report[20]}</td>
			</tr>
		</table>
	</div>
	<div class="col-sm-6">
		<table class="table table-hover table-striped">
			<tr>
				<th
					style="background-color: #bf00ff; color: white; text-align: center">Reported
					Message</th>
			</tr>
			<tr>
				<td>${report[14]}</td>
			</tr>
		</table>
	</div>
</div>



