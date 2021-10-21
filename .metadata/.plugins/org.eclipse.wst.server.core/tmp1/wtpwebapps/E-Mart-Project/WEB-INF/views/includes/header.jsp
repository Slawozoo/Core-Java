<header class="header_area">
	<div class="main_menu">
		<nav class="navbar navbar-expand-lg navbar-light">
			<div class="container">
				<a class="navbar-brand logo_h" href="index"><b><h3>E-Mart</h3></b></a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<div class="collapse navbar-collapse offset"
					id="navbarSupportedContent">
					<ul class="nav navbar-nav menu_nav ml-auto mr-auto">
						<li class="nav-item active"><a class="nav-link" href="index">Home</a></li>
						<li class="nav-item submenu dropdown"><a href="#"
							class="nav-link dropdown-toggle" data-toggle="dropdown"
							role="button" aria-haspopup="true" aria-expanded="false">Product
								Category</a>
							<ul class="dropdown-menu">
								<li class="nav-item"><a class="nav-link" href="electronics">Electronics</a></li>
								<li class="nav-item"><a class="nav-link" href="computers">Computers</a></li>
								<li class="nav-item"><a class="nav-link" href="mobiles">Mobiles</a></li>
								<li class="nav-item"><a class="nav-link" href="cosmetics">Cosmetics</a></li>
								<li class="nav-item"><a class="nav-link" href="clothes">Clothes</a></li>
								<li class="nav-item"><a class="nav-link" href="others">Others</a></li>
							</ul></li>
						<li class="nav-item"><a class="nav-link" href="contact">Contact
								Us</a></li>
						<li class="nav-item"><a class="nav-link" href="sellProduct">Sell
								Product</a></li>
						<c:if test="${empty userName}">
							<li class="nav-item submenu dropdown"><a href="#"
							class="nav-link dropdown-toggle" data-toggle="dropdown"
							role="button" aria-haspopup="true" aria-expanded="false">Account</a>
							<ul class="dropdown-menu">
								<li class="nav-item"><a class="nav-link" href="userLogin">Login</a></li>
								<li class="nav-item"><a class="nav-link"
									href="register">Register</a></li>
							</ul></li>
						</c:if>
						<%
							String name;
							if (request.getSession().getAttribute("userName") == null) {
								name = "";
							} else {
								name = request.getSession().getAttribute("userName").toString();
							}
						%>
						<li class="nav-item submenu dropdown"><a href="#"
							class="nav-link dropdown-toggle" data-toggle="dropdown"
							role="button" aria-haspopup="true" aria-expanded="false"> 
							<h4 style="color:green">
							<%=name%>
							</h4>
						</a>
							<ul class="dropdown-menu">
								<li class="nav-item"><a class="nav-link" href="logoutUser">Logout</a></li>
							</ul></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>
</header>
