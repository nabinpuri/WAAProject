<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script  src="https://code.jquery.com/jquery-3.1.0.min.js" integrity="sha256-cCueBR6CsyA4/9szpPfrX3s49M9vUU5BgtiJj06wt/s=" crossorigin="anonymous"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script src="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.js"></script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
 <script>
	$(function() {	
		$("#leaveFromDateId").datepicker({			
			format:'yyyy-mm-dd'
		});
	});
	$(function() {
		$("#leaveToDateId").datepicker({
			format:'yyyy-mm-dd'
		});
	});
</script>
</head>
<body>
	<form:form modelAttribute="leave" action="leave">
		<fieldset>
			<legend>Apply Leave</legend>
			<div class="form-group">
				From Date:
				<div class="col-lg-10">
					<form:input id="leaveFromDateId" path="leaveFromDate" type="text"
						class="form:input-large" />
				</div>
			</div>

			<div class="form-group">
				To Date:
				<div class="col-lg-10">
					<form:input id="leaveToDateId" path="leaveToDate" type="text"
						class="form:input-large" />
				</div>
			</div>
			<div class="form-group">
				Description:
				<div class="col-lg-10">
					<form:textarea id="description" path="description" type="text"
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
	<h2>List of holidays</h2>

	<c:if test="${not empty holidaysList}">

		<ul>
			<c:forEach var="listValue" items="${holidaysList}">
				<li>${listValue.holidayDate}${listValue.reason}</li>
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>