<section class="login_box_area section-margin">
	<div class="container">
		<div class="row">
			<div class="col-lg-6">
				<div class="login_box_img">
					<div class="hover">
						<h4>Got Your Validation Code ?</h4>
						<p>Enter the valid code to Recover your account.</p>
						<a class="button button-account" href="userLogin">Go Back To
							Login</a>
					</div>
				</div>
			</div>
			<div class="col-lg-6">
				<div class="login_form_inner">
					<h3>Validating Code</h3>
					<form:form class="row login_form" action="codeValidation">
						<div class="col-md-12 form-group">
							<input type="text" class="form-control" name="uniqueCode"
								placeholder="Enter valid code" onfocus="this.placeholder = ''"
								onblur="this.placeholder = 'Enter valid code'" />
						</div>
						<div class="col-md-12 form-group">
							<button type="submit" value="submit"
								class="button button-login w-100">Validate</button>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</section>