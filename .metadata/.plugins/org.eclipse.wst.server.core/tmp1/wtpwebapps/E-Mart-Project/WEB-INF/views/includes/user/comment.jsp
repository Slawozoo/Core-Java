<c:forEach items="${comment}" var="comment">
	<div>
		<p>
			<b style="color:green">${comment.userName} : &emsp;</b><br>${comment.comment}</p>
		<p>
			<small style="color: blue">${comment.regDate}</small>
		</p>
	</div>
	<hr>
</c:forEach>

<%
	String userName;
	if (request.getSession().getAttribute("userName") == null) {
%>
<a href="userLogin"><h2>Login to comment</h2></a>
<%
	} else {
%>
<form:form action="addComment" modelAttribute="newComment">

	<div class="col-md-12 form-group">
		<form:input class="form-control" path="comment"
			placeholder="Add a comment" onfocus="this.placeholder = ''"
			onblur="this.placeholder = 'Add a Comment'" />
		<form:input path="userName" type="hidden" value='<%=request.getSession().getAttribute("userName")%>'/>
		<form:input path="productId" type="hidden"/>
			
		<br> <input class="btn btn-info btn-sm" type="submit"
			value="Send" />
	</div>
</form:form>
<%
	}
%>


