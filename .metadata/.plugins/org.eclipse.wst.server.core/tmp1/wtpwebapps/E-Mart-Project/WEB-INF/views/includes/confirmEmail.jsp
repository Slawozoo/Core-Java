<!--================Login Box Area =================-->
<section class="login_box_area section-margin">
	<div class="container">
		<div class="row">
			<div class="col-lg-6">
				<div class="login_box_img">
					<div class="hover">
						<h4>Please verify your email address</h4>	
						<a class="button button-account" target="_blank" href="https://mail.google.com/">Check your email now</a>
					</div>
				</div>
			</div>
			<div class="col-lg-6">
				<div class="login_form_inner register_form_inner">
					<h3>Enter your validation code to continue</h3>
					
					<form:form class="row login_form" action="confirmYourEmail" modelAttribute="email">
						<div class="col-md-12 form-group">
							<form:input class="form-control" path="verifyCode"
								name="Verify Code" placeholder="Enter code"
								onfocus="this.placeholder = ''"
								onblur="this.placeholder = 'Enter Code'"/>
							
						</div>
						
						<form:hidden path="code"/>
						<form:hidden path="userId"/>
						
						<div class="col-md-12 form-group">
							<input type="submit" value="Register"
								class="button button-register w-100">
						</div>
					</form:form>
					
				</div>
			</div>
		</div>
	</div>
</section>
<!--================End Login Box Area =================-->