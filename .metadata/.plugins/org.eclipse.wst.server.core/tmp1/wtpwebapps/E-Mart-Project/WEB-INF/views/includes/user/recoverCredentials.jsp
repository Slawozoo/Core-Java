<section class="login_box_area section-margin">
	<div class="container">
		<div class="row">
			<div class="col-lg-6">
				<div class="login_box_img">
					<div class="hover">
						<h4>Recover your account.</h4>
						<p>Choose the strong password. Don't let others access your
							account.</p>
						<a class="button button-account" href="userLogin">Go Back To
							Login</a>
					</div>
				</div>
			</div>
			<div class="col-lg-6">
				<div class="login_form_inner">
					<h3>Recovering Password</h3>
					<form:form class="row login_form" action="recoverAccount">
						<div class="col-md-12 form-group">
							<input type="password" class="form-control" name="recoveryPass"
								placeholder="********"
								onfocus="this.placeholder = ''"
								onblur="this.placeholder = '*********'" id="pass1" oninput="checkPass()" />
						</div>
						<div class="col-md-12 form-group">
							<input type="password" class="form-control"
								placeholder="**********"
								onfocus="this.placeholder = ''"
								onblur="this.placeholder = '***********'" id="pass2" oninput="checkPass()" />
						</div>
						<small id="showMessage"><i></i></small>
						<div class="col-md-12 form-group">
							<button type="submit" value="submit"
								class="button button-login w-100">Recover Account</button>
						</div>
					</form:form>
				</div>
			</div>
			<script>
				function checkPass(){
					var pass1 = document.getElementById('pass1').value;
					var pass2 = document.getElementById('pass2').value;
					if(pass1!=pass2){
						document.getElementById('showMessage').style.color = "red";
						document.getElementById('showMessage').innerHTML = "Retyped Password not matching.!!";
					}
					else{
						document.getElementById('showMessage').style.color = "green";
						document.getElementById('showMessage').innerHTML = "Retyped Password Matched.!!";
					}
				}
			</script>
		</div>
	</div>
</section>