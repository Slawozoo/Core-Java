<c:choose>
	<c:when test="${message.status eq true}">
		<script type="text/javascript">
			swal("Error Occured", "${message.message}", "error");
		</script>
	</c:when>
	<c:when
		test="${message.status eq false and message.message ne 'defaultMessage'}">
		<script type="text/javascript">
			swal("Deletion Succeed", "${message.message}", "success");
		</script>
	</c:when>
</c:choose>
<h4>Reported Products</h4>
<table class="table table-hover">
	<thead style="background-color: #441E71; color: white;">
		<tr>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Category</th>
			<th>Reported By</th>
			<th>Reported Date</th>
			<th>Manipulate</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="product" items="${reportedProducts}">
			<tr>
				<td>${product[0]}</td>
				<td>${product[1]}</td>
				<td>${product[2]}</td>
				<td>${product[3]}</td>
				<td>${product[4]}</td>
				<td>
					<div class="row">
						<div class="col-sm-6">
							<form method="post" action="viewReportedProduct">
								<input type="hidden" value="${product[5]}" name="reportId"/>
								<button type="submit" class="btn btn-success">
									<small>View</small>
								</button>
							</form>
						</div>
						<div class="col-sm-6">
							<form method="post" action="delReportedProduct"
								onsubmit="return confirm('Confirm Deletion ?')">
								<input type="hidden" name="reportId" value="${product[5]}" />
								<input type="hidden" name="productId" value="${product[0]}" />
								<button type="submit" class="btn btn-danger">
									<small>Delete Report & Product</small>
								</button>
							</form>
						</div>
					</div>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>