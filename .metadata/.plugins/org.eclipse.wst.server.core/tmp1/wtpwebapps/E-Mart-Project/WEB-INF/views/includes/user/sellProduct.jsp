<script>
	function addRows() {
		var table = document.getElementById('specificationTable');
		var rowCount = table.rows.length;
		var row = table.insertRow(rowCount);
		for (var i = 0; i <= 1; i++) {
			var cell = 'cell' + i;
			cell = row.insertCell(i);
			var copycel = document.getElementById('col' + i).innerHTML;
			cell.innerHTML = copycel;
		}
	}
	function delRows() {
		var table = document.getElementById('specificationTable');
		var rowCount = table.rows.length;
		if (rowCount > '4') {
			var row = table.deleteRow(rowCount - 1);
			rowCount--;
		} else {
			swal("Alert", "There should be atleast two specification", "info");
		}
	}
	function setSpecification() {
		var titleArray = document.getElementsByName('title');
		var title = [];
		var descriptionArray = document.getElementsByName('description');
		var description = [];
		for (var i = 0, n = titleArray.length; i < n; i++) {
			title.push(titleArray[i].value);
			description.push(descriptionArray[i].value);
		}
		document.getElementById('specification').value = title.join("%sub%")
				+ "%main%" + description.join("%sub%");
		return confirm('Confirm Uploading Product ? ');
	}
</script>
<section class="product_description_area" style="color:black">
	<div class="container">
		<ul class="nav nav-tabs" id="myTab" role="tablist">
			<li class="nav-item">
				<h4>Please Provide Correct Information. All Fields Are Required
					Except Warranty</h4>
			</li>
		</ul>
		<form:form action="sellingProduct" method="post"
			modelAttribute="product" enctype="multipart/form-data"
			class="form-contact form-review mt-3"
			onsubmit="return setSpecification();">
			<div class="tab-content" id="myTabContent">
				<div class="row">
					<div class="col-lg-6">
						<div class="form-group">
							<form:errors path="productName" cssClass="error"></form:errors>
							<form:input path="productName" class="form-control" type="text"
								placeholder="Enter Product's Name" />
						</div>
						<div class="form-group">
							<div class="row">
								<div class="col-lg-6">
									<h6>Category :</h6>
								</div>
								<div class="col-lg-6">
									<form:errors path="category" cssClass="error"></form:errors>
									<form:select path="category" class="form-control select">
										<option>Computers</option>
										<option>Mobiles</option>
										<option>Cosmetics</option>
										<option>Electronics</option>
										<option>Clothes</option>
										<option>Others</option>
									</form:select>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="row">
								<div class="col-lg-6">
									<h6>Condition :</h6>
								</div>
								<div class="col-lg-6">
									<form:errors path="productCondition" cssClass="error"></form:errors>
									<form:select path="productCondition"
										class="form-control select">
										<option value="4">Excellent</option>
										<option value="3">Very Good</option>
										<option value="2">Good</option>
										<option value="1">Normal</option>
									</form:select>
								</div>
							</div>
						</div>
						<div class="form-group">
							<form:errors path="usedFor" cssClass="error"></form:errors>
							<form:input path="usedFor" class="form-control" type="text"
								placeholder="Used For About [ eg : 2 yrs]" />
						</div>
						<div class="form-group">
							<h6>Price :</h6>
							<form:errors path="price" cssClass="error"></form:errors>
							<form:input path="price" class="form-control" type="text"
								placeholder="Price" />
						</div>
						<div class="form-group">
							<div class="row">
								<div class="col-lg-6">
									<h6>Price Negotiable :</h6>
									<form:errors path="priceNegotiable" cssClass="error"></form:errors>
								</div>
								<div class="col-lg-6">
									<div class="row">
										<div class="col-lg-6">
											Yes :
											<form:radiobutton path="priceNegotiable" value="1" />
										</div>
										<div class="col-lg-6">
											No :
											<form:radiobutton path="priceNegotiable" value="0" />
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="form-group">
							<form:errors path="deliveryArea" cssClass="error"></form:errors>
							<form:input path="deliveryArea" class="form-control" type="text"
								placeholder="Delivery Area" />
						</div>
						<div class="form-group">
							<form:errors path="warrantyPeriod" cssClass="error"></form:errors>
							<form:input path="warrantyPeriod" class="form-control"
								type="text" placeholder="Warranty Period. If not then enter -" />
						</div>
						<div class="form-group">
							<h6>Delivery Charges :</h6>
							<form:errors path="deliveryCharges" cssClass="error"></form:errors>
							<form:input path="deliveryCharges" class="form-control"
								type="text" placeholder="Delivery Charges" />
						</div>
						<div class="form-group">
							<h6>Product Specification :</h6>
							<table class="table table-bordered" id="specificationTable">
								<tr>
									<th>Title</th>
									<th>Description</th>
								</tr>
								<tr>
									<th><input type="text" placeholder="Example : Height"
										class="form-control" disabled /></th>
									<th><input type="text" placeholder="4 inch"
										class="form-control" disabled /></th>
								</tr>
								<tr>
									<th id="col0"><input type="text" name="title"
										class="form-control" placeholder="Title" /></th>
									<th id="col1"><input type="text" name="description"
										class="form-control" placeholder="Description" /></th>
								</tr>
								<tr>
									<th id="col0"><input type="text" name="title"
										class="form-control" placeholder="Title" /></th>
									<th id="col1"><input type="text" name="description"
										class="form-control" placeholder="Description" /></th>
								</tr>
							</table>
							<form:errors path="productSpecification" cssClass="error"></form:errors>
							<form:input path="productSpecification" type="hidden"
								id="specification" />
						</div>
						<div class="form-group text-center text-md-right mt-3">
							<button class="button button-review" type="button"
								onclick="addRows();">
								<b> + Add Row</b>
							</button>
							<button class="button button-review" type="button"
								onclick="delRows();">
								<b> - Delete Row</b>
							</button>
							<button type="submit" class="button button--active button-review">Submit
								Now</button>
						</div>
					</div>
					<div class="col-lg-6">
						<h3 style="color: green">TERMS OF UPLOADING</h3>
						<ul type="square">
							<li>
								<p>You can upload upto 15 products in FREE COST.</p>
							</li>
							<li>
								<p>For uploading products in range 16 - 50 . It costs Rs 30 and product will
									be kept for 1 month.</p>
							</li>
							<li>
								<p>For uploading products in range 51 - 100 . It costs Rs 50 and product
									will be kept for 2 months.</p>
							</li>
							<li>
								<p>For uploading products in range 100 above . It costs Rs 75 and product
									will be kept for 4 months.</p>
							</li>
						</ul>
						<hr>
						<h6>Upload Product Pictures</h6>
						<small style="color: green">To Make Your Product Picture
							Look Attractive, Please upload the Picture of size height=170px
							and width=230px</small>
						<div class="form-group">
							<input type="file" name="firstPhoto" onchange="firstImage(this);" />
						</div>
						<div class="form-group">
							<input type="file" name="secondPhoto"
								onchange="secondImage(this);" />
						</div>
						<div class="form-group">
							<input type="file" name="thirdPhoto" onchange="thirdImage(this);" />
						</div>
						<div class="review_box">
							<div class="row total_rate">
								<div class="box_total">
									<img src="#" id="up-image1" style="display: none"
										height="200px" width="auto">
								</div>
								<div class="box_total">
									<img src="#" id="up-image2" style="display: none"
										height="200px" width="auto">
								</div>
								<div class="box_total">
									<img src="#" id="up-image3" style="display: none"
										height="200px" width="auto">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</form:form>
	</div>
</section>
<script type="text/javascript">
	function firstImage(input) {
		if (input.files && input.files[0]) {
			var reader = new FileReader();

			reader.onload = function(e) {
				$('#up-image1').attr('src', e.target.result);
				var img = document.getElementById("up-image1");
				img.style.display = 'block';
			}

			reader.readAsDataURL(input.files[0]);
		}
	}
	function secondImage(input) {
		if (input.files && input.files[0]) {
			var reader = new FileReader();

			reader.onload = function(e) {
				$('#up-image2').attr('src', e.target.result);
				var img = document.getElementById("up-image2");
				img.style.display = 'block';
			}

			reader.readAsDataURL(input.files[0]);
		}
	}
	function thirdImage(input) {
		if (input.files && input.files[0]) {
			var reader = new FileReader();

			reader.onload = function(e) {
				$('#up-image3').attr('src', e.target.result);
				var img = document.getElementById("up-image3");
				img.style.display = 'block';
			}

			reader.readAsDataURL(input.files[0]);
		}
	}
</script>