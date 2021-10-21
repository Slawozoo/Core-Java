<!-- ================ contact section start ================= -->
<section class="section-margin--small">
	<div class="container">
		<div class="d-none d-sm-block mb-5 pb-4">
			<iframe
				src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3533.4416969419667!2d85.43085021430042!3d27.672740133620447!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x39eb1aade90428d5%3A0xbe16159983ac9aa8!2sPalikhel-Chorcha%20Rd%2C%20Bhaktapur%2044800!5e0!3m2!1sen!2snp!4v1577024162146!5m2!1sen!2snp"
				width="100%" height="450" frameborder="0" style="border: 0;"
				allowfullscreen=""></iframe>
		</div>
		<div class="row">
			<div class="col-md-4 col-lg-3 mb-4 mb-md-0">
				<div class="media contact-info">
					<span class="contact-info__icon"><i class="ti-home"></i></span>
					<div class="media-body">
						<h3>Bhaktapur Nepal</h3>
						<p>Golmadhi</p>
					</div>
				</div>
				<div class="media contact-info">
					<span class="contact-info__icon"><i class="ti-headphone"></i></span>
					<div class="media-body">
						<h3>9849675658</h3>
						<p>Sun to Fri 9am to 6pm</p>
					</div>
				</div>
				<div class="media contact-info">
					<span class="contact-info__icon"><i class="ti-email"></i></span>
					<div class="media-body">
						<h3>
							<a href="e42emart@gmail.com">e42emart@gmail.com</a>
						</h3>
						<p>Send us your query anytime!</p>
					</div>
				</div>
			</div>
			<div class="col-md-8 col-lg-9">
				<form:form action="userFeedback" class="form-contact contact_form"
					method="post" id="contactForm" novalidate="novalidate" modelAttribute="userMessage">
					<div class="row">
						<div class="col-lg-5">
							<div class="form-group">
								<form:errors path="fullName" cssClass="error" />
								<form:input path="fullName" class="form-control" name="name" id="name" type="text"
									placeholder="Enter your name" />
							</div>
							<div class="form-group">
								<form:errors path="email" cssClass="error" />
								<form:input path="email" class="form-control" name="email" id="email" type="email"
									placeholder="Enter email address" />
							</div>
							<div class="form-group">
								<form:errors path="subject" cssClass="error" />
								<form:input path="subject" class="form-control" name="subject" id="subject"
									type="text" placeholder="Enter Subject" />
							</div>
						</div>
						<div class="col-lg-7">
							<div class="form-group">
								<form:errors path="feedback" cssClass="error"/>
								<form:textarea path="feedback" class="form-control different-control w-100"
									name="message" id="message" cols="30" rows="5"
									placeholder="Enter Message"></form:textarea>
							</div>
						</div>
					</div>
					<div class="form-group text-center text-md-right mt-3">
						<button type="submit"
							class="button button--active button-contactForm">Send
							Message</button>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</section>
<!-- ================ contact section end ================= -->