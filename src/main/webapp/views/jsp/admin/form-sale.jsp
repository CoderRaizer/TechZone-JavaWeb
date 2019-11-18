<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Sale</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style type="text/css">
#btn-submit {
	border-radius: 2px;
	background: #42beda;
}
</style>
</head>
<body>


	<div class="page-wrapper chiller-theme toggled">

		<!-- Header -->
		<%@include file="../shared/sidebar-admin.jsp"%>

		<main class="page-content">
		<div class="container-fluid">

			<form:form method="post"
				action="saveSale?${_csrf.parameterName}=${_csrf.token}"
				modelAttribute="saleModel" class="form-horizontal"
				enctype="multipart/form-data">
				<form:input path="id" type="hidden" />

				<div class="form-group">
					<label class="control-label col-sm-4">Event sale</label>
					<div class="col-sm-4">
						<form:input path="event" type="text" class="form-control"
							id="event" name="event" placeholder="Enter event of sale" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-4">Percent sale</label>
					<div class="col-sm-4">
						<form:input path="percent" type="text" class="form-control"
							id="percent" name="percent"
							placeholder="Enter percent (%) of sale" />
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-4 col-sm-6">
						<button id="btn-submit" type="submit" class="btn btn">Save</button>
						<button type="button" onclick="location.href='./list'"
							class="btn btn-dark">Cancel</button>
					</div>
				</div>
			</form:form>
		</div>
		</main>
	</div>


	<!-- Footer -->
	<%@include file="../shared/footer.jsp"%>

</body>
</html>