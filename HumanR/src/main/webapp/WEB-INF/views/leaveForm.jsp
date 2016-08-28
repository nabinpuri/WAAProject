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
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
<script>
	$(function() {
		$("#datepicker").datepicker();
	});
</script>
</head>
<body>
	<form:form modelAttribute="leave" action="applyLeave">
		<fieldset>
			<legend>Apply Leave</legend>
			<div class="form-group">
				From Date:
				<div class="col-lg-10">
					<form:input id="datepicker" path="leaveFromDate" type="text"
						class="form:input-large" />
				</div>
			</div>

			<div class="form-group">
				To Date:
				<div class="col-lg-10">
					<form:input id="datepicker1" path="leaveToDate" type="text"
						class="form:input-large" />
				</div>
			</div>
			<div class="form-group">
				Description:
				<div class="col-lg-10">
					<form:input id="description" path="description" type="text"
						class="form:input-large" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-lg-offset-2 col-lg-10">
					<input type="submit" id="applyleaveId" class="btn btn-primary"
						value="Apply Leave" />
				</div>
			</div>
		</fieldset>
	</form:form>
</body>
</html>