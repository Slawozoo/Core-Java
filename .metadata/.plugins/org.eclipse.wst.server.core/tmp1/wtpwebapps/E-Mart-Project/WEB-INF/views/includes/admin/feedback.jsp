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
<h4>User's Message</h4>
<table class="table table-hover">
	<thead style="background-color: #441E71; color: white;">
		<tr>
			<th>SN</th>
			<th>Full Name</th>
			<th>Email</th>
			<th>Date</th>
			<th>Subject</th>
			<th>Manipulate</th>
		</tr>
	</thead>
	<tbody>
		<c:set var="id" value="1" />
		<c:forEach var="feedback" items="${userFeedback}">
			<tr>
				<td><c:out value="${id}" /></td>
				<td>${feedback.fullName}</td>
				<td>${feedback.email}</td>
				<td>${feedback.regDate}</td>
				<td>${feedback.subject}</td>
				<td>
					<div class="row">
						<div class="col-sm-6">
							<button type="button" class="btn btn-success" data-toggle="modal"
								data-target="#myModal${id}">
								<small>View</small>
							</button>
						</div>
						<div class="col-sm-6">
							<form method="post" action="deleteUserFeedback" onsubmit="return confirm('Confirm Deletion ?')">
								<input type="hidden" name="id" value="${feedback.id}" />
								<button type="submit" class="btn btn-danger">
									<small>Delete</small>
								</button>
							</form>
						</div>
					</div>
				</td>
			</tr>
			<c:set var="id" value="${id+1}" />
		</c:forEach>
	</tbody>
</table>

<c:set var="modalId" value="1" />
<c:forEach var="feedback" items="${userFeedback}">
	<div class="modal fade" id="myModal${modalId}">
		<div class="modal-dialog" >
			<div class="modal-content">

				<!-- Modal Header -->
				<div class="modal-header">
					<h4 class="modal-title" style="color: green">Subject : ${feedback.subject}</h4>
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>

				<!-- Modal body -->
				<div class="modal-body">
					<table>
						<tr>
							<th>From :</th>
							<td>${feedback.fullName}</td>
						</tr>
						<tr>
							<th>Email :</th>
							<td style="color:blue">${feedback.email}</td>
						</tr>
						<tr>
							<th>Date :</th>
							<td>${feedback.regDate}</td>
						</tr>
						<tr>
							<td colspan="2">
								<p>${feedback.feedback}</p>
							</td>
						</tr>
					</table>
				</div>

				<!-- Modal footer -->
				<div class="modal-footer">
					<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
				</div>

			</div>
		</div>
	</div>
	<c:set var="modalId" value="${modalId+1}" />
</c:forEach>