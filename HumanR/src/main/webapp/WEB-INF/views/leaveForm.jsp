<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="leave" action="send">
		<fieldset>
			<legend>Apply Leave</legend>

			<form:errors path="*" cssClass="alert alert-danger" element="div" />
			<div class="form-group">
				<label class="control-label col-lg-2 col-lg-2" for="employeeNumber">
					Employee Number</label>
				<div class="col-lg-10">
					<form:input id="employeeNumber" path="employeeNumber" type="text"
						class="form:input-large" />
					<form:errors path="employeeNumber" cssClass="text-danger" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-lg-2" for="firstName">First
					Name</label>
				<div class="col-lg-10">
					<form:input id="firstName" path="firstName" type="text"
						class="form:input-large" />
					<form:errors path="firstName" cssClass="text-danger" />
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-lg-2" for="lastName">Last
					Name</label>
				<div class="col-lg-10">
					<div class="form:input-prepend">
						<form:input id="lastName" path="firstName" type="text"
							class="form:input-large" />
						<form:errors path="lastName" cssClass="text-danger" />
					</div>
				</div>
			</div>



			<div class="form-group">
				<div class="col-lg-offset-2 col-lg-10">
					<input type="submit" id="btnAdd" class="btn btn-primary"
						value="Add" />
				</div>
			</div>

		</fieldset>

	</form:form>
</body>
</html>