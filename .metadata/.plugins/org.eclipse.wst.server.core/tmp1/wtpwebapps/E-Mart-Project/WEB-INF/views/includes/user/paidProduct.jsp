<section class="product_description_area">
	<div class="container">
		<ul class="nav nav-tabs" id="myTab" role="tablist">
			<li class="nav-item">
				<h3 style="color: red">Your Uploading Limit Exceeds. Payment
					required to upload new Products.</h3>
			</li>
		</ul>
		<form action="https://uat.esewa.com.np/epay/main" method="post" class="form-contact form-review mt-3">
			<input value="${paidProduct.paidPrice}" name="tAmt" type="hidden">
    		<input value="${paidProduct.netPrice}" name="amt" type="hidden">
    		<input value="${paidProduct.tax}" name="txAmt" type="hidden">
    		<input value="0" name="psc" type="hidden">
    		<input value="0" name="pdc" type="hidden">
    		<input value="epay_payment" name="scd" type="hidden">
    		<input value="${paidProduct.uniqueCode}" name="pid" type="hidden">
    		<input value="http://computernote.cf?q=su" type="hidden" name="su">
    		<input value="http://computernote.cf?q=fu" type="hidden" name="fu">
			<div class="tab-content" id="myTabContent">
				<div class="row">
					<div class="col-lg-6">
						<table class="table">
							<tr>
								<th colspan="2">
									<p>${percentageMessage}</p>
								</th>
							</tr>
							<tr>
								<th>Your Product Price</th>
								<td style="color: green">RS : ${paidProduct.productPrice}</td>
							</tr>
							<tr>
								<th>Net Price (Must Paid)</th>
								<td style="color: green">RS : ${paidProduct.netPrice}</td>
							</tr>
							<tr>
								<th>Tax</th>
								<td style="color: green">RS : ${paidProduct.tax}</td>
							</tr>
							<tr>
								<th>Total Amount to Pay</th>
								<td style="color: green">RS : ${paidProduct.paidPrice}</td>
							</tr>
							<tr>
								<td colspan="2"><button type="submit"
										class="button button--active button-review"><img src="${pageContext.request.contextPath}/resources/img/esewa.png" height="40px" width="auto">Pay With
										esewa</button></td"src/beans/PaidProduct.java">
							</tr>
						</table>
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
							</li>						</ul>
					</div>
				</div>
			</div>
		</form>
	</div>
</section>