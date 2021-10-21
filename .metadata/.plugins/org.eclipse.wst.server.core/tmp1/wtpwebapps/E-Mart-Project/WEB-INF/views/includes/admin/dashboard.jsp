<c:choose>
	<c:when test="${updateMessage.status eq true}">
		<script>
			swal("Error Occured","${updateMessage.message}","error");
		</script>
	</c:when>
	<c:when test="${updateMessage.status eq false and updateMessage.message ne 'defaultMessage'}">
		<script>
			swal("Update Succeed","${updateMessage.message}","success");
		</script>
	</c:when>
</c:choose>
<div class="row">
	<div class="col-sm-6">
		<table class="table table-hover table-striped">
			<tr>
				<th colspan="2"><h4>Administrator Info</h4></th>
			</tr>
			<tr>
				<th>User Name</th>
				<td>${adminInfo.userName}</td>
			</tr>
			<tr>
				<th>Email</th>
				<td>${adminInfo.email}</td>
			</tr>
			<tr>
				<th>Contact No</th>
				<td>${adminInfo.contactNo}</td>
			</tr>
		</table>
	</div>
	<div class="col-sm-6" style="border-left: 2px solid black">
		<form:form method="post" action="adminUpdateCredentials" modelAttribute="adminUpdate"  onsubmit="return confirm('Wana Update Admin Info ?')">
			<table class="table table-hover">
				<tr>
					<th colspan="2"><h4>Change Credentials</h4></th>
				</tr>
				<tr>
					<th><label>New User Name </label><form:errors path="userName" cssClass="error"/></th>
					<td><form:input path="userName" type="text" class="form-control"
						placeholder="New User Name" /></td>
				</tr>
				<tr>
					<th><label>Email </label><form:errors path="email" cssClass="error"/></th>
					<td><form:input path="email" type="text" class="form-control"
						placeholder="New Email" /></td>
				</tr>
				<tr>
					<th><label>Contact No </label><form:errors path="contactNo" cssClass="error"/></th>
					<td><form:input path="contactNo" type="text" class="form-control"
						placeholder="Valid Contact No"/></td>
				</tr>
				<tr>
					<th><label>Old Password</label></th>
					<td><input type="password" class="form-control"
						placeholder="*******" name="oldPass" required="required" /></td>
				</tr>
				<tr>
					<th><label>New Password </label><form:errors path="pwd" cssClass="error"/></th>
					<td><form:input path="pwd" type="password" class="form-control"
						placeholder="*******" id="newPass"/></td>
				</tr>
				<tr>
					<th><label>Retype Password</label></th>
					<td><input type="password" class="form-control"
						placeholder="*******" id="rePass" oninput="checkPassword()" required="required" /></td>
				</tr>
				<tr>
					<td colspan="2">
						<button type="submit" class="btn btn-primary">UPDATE</button>&emsp;<small class="error" id="viewError"></small>
					</td>
				</tr>
			</table>
		</form:form>
	</div>
</div>
<script>
	function checkPassword(){
		var pass1 = document.getElementById('newPass').value;
		var pass2 = document.getElementById('rePass').value;
		if(pass1!=pass2){
			document.getElementById('viewError').innerHTML = "Retyped Password Not Matched.!!!!";
			document.getElementById('viewError').style.color="red";
		}
		else{
			document.getElementById('viewError').innerHTML = "Retyped Password Matched.!!!!";
			document.getElementById('viewError').style.color="green";
		}
	}
</script>