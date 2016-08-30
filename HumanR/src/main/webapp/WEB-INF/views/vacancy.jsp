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
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script src="http://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.js"></script>
<script>
$(document).ready(function(){

	alert(1);
		  $('.modifiedDate').datepicker({
		        format: "yyyy/mm/dd",
		        startDate: "2012-01-01",
		        endDate: "2015-01-01",
		        todayBtn: "linked",
		        autoclose: true,
		        todayHighlight: true
		    });
		  
	
});

  
</script>
</head>
<body>
	<form:form modelAttribute="addVacancy" action="addVacancy">
		<fieldset>
			<legend>Add Vacancy</legend>
			<div class="form-group">
			<div class="col-lg-10">
				<label for ="Number of Employees">Number of Employees</label>
				
					<form:input id="noOfEmployees" path="numberOfEmployee" type="text"
						class="form:input-large" />
				</div>
			</div>
			<div class="form-group">
				
				<div class="col-lg-10">
				<label for ="Post">Post</label>
					<form:select path="post.postId">
					<form:options items="${posts}" itemValue="postId" itemLabel="postName"></form:options>
					</form:select>
				</div>
			</div>
			<div class="form-group">
			<div class="col-lg-10">
				<label for ="Requirement"><spring:message code="requirement"/></label>
				
				<form:input path="requirement"></form:input>	
				</div>
			</div>
			<div class="form-group">
				
				<div class="col-lg-10">
				<label for ="Number To be Filled"><spring:message code="numberToBeFilled"/></label>
				<form:input path="numberOfFilledNumber"></form:input>	
				</div>
			</div>
			<div class="form-group">
				<div class="col-lg-offset-2 col-lg-10">
					<input type="submit"  class="btn btn-primary"
						value="Submit" />
				</div>
			</div>
		</fieldset>
	</form:form>
</body>
</html>