<section class="login_box_area section-margin">
	<div class="container">
		<div class="row">
			<div class="col-lg-6">
				<div class="login_box_img">
					<div class="hover">
						<h4>Forget your password ?</h4>
						<p>If yout forget your password then enter your verified userName. And the verification code will be sent to your registered email.</p>
						<a class="button button-account" href="userLogin">Go Back To
							Login</a>
					</div>
				</div>
			</div>
			<div class="col-lg-6">
				<div class="login_form_inner">
					<h3>Recover Account By Email</h3>
					<small class="success">The verification code will sent to your email.</small>
					<form:form class="row login_form" action="emailValidation">
						<div class="col-md-12 form-group">
							<input type="text" class="form-control" name="userName"
								placeholder="Enter your valid User Name"
								onfocus="this.placeholder = ''"
								onblur="this.placeholder = 'Enter your valid User Name'" />
						</div>
						<div class="col-md-12 form-group">
							<button type="submit" value="submit"
								class="button button-login w-100">Use UserName</button>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</section>