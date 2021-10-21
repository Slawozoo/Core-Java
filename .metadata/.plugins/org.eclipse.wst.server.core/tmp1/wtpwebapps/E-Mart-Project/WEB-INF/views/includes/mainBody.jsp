<%@ page import="java.util.Base64"%>
<main class="site-main">

	<!--================ Hero banner start =================-->
	<section class="hero-banner">
		<div class="container">
			<div class="row no-gutters align-items-center pt-60px">
				<div class="col-5 d-none d-sm-block">
					<div class="hero-banner__img">
						<img class="img-fluid"
							src="${pageContext.request.contextPath}/resources/img/home/hero-banner.png"
							alt="">
					</div>
				</div>
				<div class="col-sm-7 col-lg-6 offset-lg-1 pl-4 pl-md-5 pl-lg-0">
					<div class="hero-banner__content">
						<h4>View your favourate product.</h4>
						<h1>Product Details</h1>
						<p>Check our product category where you can find the product
							you want to shop along with product description and
							specifications.</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================ Hero banner start =================-->

	<!--================ Hero Carousel start =================-->
	<section class="section-margin mt-0">
		<div class="owl-carousel owl-theme hero-carousel">
			<c:forEach items="${mobiles}" var="mobile">
			<div class="hero-carousel__slide">
				<img
					src="data:image/jpg;image/png;image/jpeg;image/gif;base64,${mobile.photo1}"
					alt="Image Error" class="img-fluid" style="height:300px;width:auto;"> <a href="singleProduct?product=${mobile.id}"
					class="hero-carousel__slideOverlay">
					<h3>${mobile.productName}</h3>
					<p>${mobile.category} item</p>
				</a>
			</div>
			</c:forEach>
		</div>
	</section>
	<!--================ Hero Carousel end =================-->

	<!-- ================ trending product section start ================= -->
	<section class="section-margin calc-5px" style="padding-top:0px;padding-bottom: 0px">
		<div class="container" style="padding-top:0px;padding-bottom: 0px">
			<div class="section-intro pb-60px" style="padding-top:0px;padding-bottom: 0px">
				<p>Popular Item in the market</p>
				<h2>
					Most Viewed <span class="section-intro__style">Product</span>
				</h2>
			</div>
			<div class="row">
			<c:forEach var="product" items="${mostViewed}">
				<div class="col-md-6 col-lg-4 col-xl-3">
					<div class="card text-center card-product">
						<div class="card-product__img">
							<img class="card-img" style="height:170px; width:230px"
								src="data:image/jpg;image/png;image/jpeg;image/gif;base64,${product.photo1}" alt="Image Error">
							<ul class="card-product__imgOverlay">
								<li><button>
										<a href="singleProduct?product=${product.id}"><i class="ti-search"></i></a>
									</button></li>
							</ul>
						</div>
						<div class="card-body">
							<p>Computers</p>
							<h4 class="card-product__title">
								<a href="singleProduct?product=${product.id}">${product.productName}</a>
							</h4>
							<p class="card-product__price">Rs. ${product.price}</p>
						</div>
					</div>
				</div>
				</c:forEach>
			</div>
		</div>
	</section>
	<!-- ================ trending product section end ================= -->

	<!-- ================ Blog section start ================= -->
	<section class="blog">
		<div class="container">
			<div class="section-intro pb-60px">
				<h2>
					Terms And <span class="section-intro__style">Conditions</span>
				</h2>
			</div>

			<div class="row">
				<div class="col-md-6 col-lg-4 mb-4 mb-lg-0">
					<div class="card card-blog">
						<div class="card-body">
							<h4 class="card-blog__title" style="color:blue">
								About Buyer And Seller
							</h4>
							<p>
								<ul style="list-style-type:square">
									<li>Seller must have account in Emart to sell his/her product.</li>
									<li>Buyer will view the product he wants and contact seller through given seller credentials.</li>
									<li>Buyer must have account to comment and report the product.</li>
									<li>No additional fees should be applied to products.</li>
								</ul>
							</p>
						</div>
					</div>
				</div>

				<div class="col-md-6 col-lg-4 mb-4 mb-lg-0">
					<div class="card card-blog">
						<div class="card-body">
							<h4 class="card-blog__title" style="color:blue">
								About Selling Product
							</h4>
							<p>
								<ul style="list-style-type:square">
									<li>Seller will upload item in the respective category.</li>
									<li>Fake products will be removed from site soon.</li>
									<li>Account of the Seller who uploads fake product will be permanently closed.</li>
								</ul>
							</p>
						</div>
					</div>
				</div>

				<div class="col-md-6 col-lg-4 mb-4 mb-lg-0">
					<div class="card card-blog">
						<div class="card-body">
							<h4 class="card-blog__title" style="color:blue">
								User's Activity
							</h4>
							<p>
								<ul style="list-style-type:square">
									<li>No of product sold by user will be recorded.</li>
									<li>The one who will sell the max products will receive the gifts from E-Mart.</li>
									<li>Every year top three max product seller will be selected.</li>
								</ul>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- ================ Blog section end ================= -->
</main>
