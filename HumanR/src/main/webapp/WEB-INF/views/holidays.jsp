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
<script>
	$(function() {
		$("#holidayDateId").datepicker();
	});
</script>
</head>
<body>
	<form:form modelAttribute="holidays" action="holidays">
		<fieldset>
			<legend>Holiday List</legend>
			<div class="form-group">
				Date:
				<div class="col-lg-10">
					<form:input id="holidayDateId" path="holidayDate" type="text"
						class="form:input-large" />
				</div>
			</div>
			<div class="form-group">
				Reasons:
				<div class="col-lg-10">
					<form:textarea id="reasonId" path="reason" type="text"
						class="form:input-large" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-lg-offset-2 col-lg-10">
					<input type="submit" id="holidayId" class="btn btn-primary"
						value="Add Holiday" />
				</div>
			</div>
		</fieldset>
	</form:form>
</body>
</html>