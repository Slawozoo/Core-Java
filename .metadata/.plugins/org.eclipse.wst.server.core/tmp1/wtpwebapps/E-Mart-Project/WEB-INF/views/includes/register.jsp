
<!--================Login Box Area =================-->
<section class="login_box_area section-margin">
	<div class="container">
		<div class="row">
			<div class="col-lg-6">
				<div class="login_box_img">
					<div class="hover">
						<h4>Already have an account?</h4>	
						<a class="button button-account" href="userLogin">Login Now</a>
					</div>
				</div>
			</div>
			<div class="col-lg-6">
				<div class="login_form_inner register_form_inner">
					<h3>Create an account</h3>
					<form:form class="row login_form" action="processRegister" modelAttribute="user">
					
						<div class="col-md-12 form-group">
							<form:input class="form-control" path="fullName"
								name="fullName" placeholder="Fullname"
								onfocus="this.placeholder = ''"
								onblur="this.placeholder = 'Fullname'"/>
								<form:errors path="fullName" cssClass="error"/>
						</div>
						<div class="col-md-12 form-group">
							<form:input class="form-control" path="userName"
								name="userName" placeholder="Username"
								onfocus="this.placeholder = ''"
								onblur="this.placeholder = 'Username'"/>
								<form:errors path="userName" cssClass="error"/>
						</div>
						<div class="col-md-12 form-group">
							<form:input type="text" class="form-control" path="address"
								name="address" placeholder="Address"
								onfocus="this.placeholder = ''"
								onblur="this.placeholder = 'Address'"/>
								<form:errors path="address" cssClass="error"/>
						</div>
						<div class="col-md-12 form-group">
							<form:input type="text" class="form-control" path="email" name="email"
								placeholder="Email Address" onfocus="this.placeholder = ''"
								onblur="this.placeholder = 'Email Address'"/>
								<form:errors path="email" cssClass="error"/>
						</div>
						<div class="col-md-12 form-group">
							<form:input type="text" class="form-control" path="contactNum" name="contactNum"
								placeholder="Contact Number" onfocus="this.placeholder = ''"
								onblur="this.placeholder = 'Contact Number'"/>
								<form:errors path="contactNum" cssClass="error"/>
						</div>
						<div class="col-md-12 form-group">
							<form:input type="password" class="form-control" path="pwd"
								name="password" placeholder="Password"
								onfocus="this.placeholder = ''"
								onblur="this.placeholder = 'Password'"/>
								<form:errors path="pwd" cssClass="error"/>
						</div>

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


