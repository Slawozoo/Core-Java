<section class="login_box_area section-margin">
	<div class="container">
		<div class="row">
			<div class="col-lg-6">
				<div class="login_box_img">
					<div class="hover">
						<h4>Don't have account in Emart ?</h4>
						<p>If you have not registered yet, then you need to register
							to Login to your account.</p>
						<a class="button button-account" href="register.html">Create
							an Account</a>
					</div>
				</div>
			</div>
			<div class="col-lg-6">
				<div class="login_form_inner">
					<h3>Log in to enter</h3>
					<form:form class="row login_form" action="loginUser" id="contactForm"
						modelAttribute="user">
						<div class="col-md-12 form-group">
							<form:errors path="userName" cssClass="error"></form:errors>
							<form:input path="userName" type="text" class="form-control"
								id="name" placeholder="Username" onfocus="this.placeholder = ''"
								onblur="this.placeholder = 'Username'" required="required" />
						</div>
						<div class="col-md-12 form-group">
							<form:errors path="userName" cssClass="error"></form:errors>
							<form:input path="userPass" type="password" class="form-control"
								id="name" placeholder="Password" onfocus="this.placeholder = ''"
								onblur="this.placeholder = 'Password'" required="required"/>
						</div>
						<!-- <div class="col-md-12 form-group">
							<div class="creat_account">
								<input type="checkbox" id="f-option2" name="selector"> <label
									for="f-option2">Keep me logged in</label>
							</div>
						</div> -->
						<div class="col-md-12 form-group">
							<button type="submit" value="submit"
								class="button button-login w-100">Log In</button>
							<a href="forgetPassword">Forgot Password?</a>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</section>