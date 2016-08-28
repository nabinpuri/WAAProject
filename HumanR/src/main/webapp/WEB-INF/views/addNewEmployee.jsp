<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<div class="pagetop">
		<div class="jumbotron">
  			<div class="pull-right" style="padding-right:50px">
				<a href="?language=en" >English</a>|<a href="?language=nl_NL" >Dutch</a>					
			</div>
			
		</div>
	</div>
	<div>
	<spring:url var="postUrl" value="/employee/addewEmployee" />
	<form:form modleAttribute="newEmployee" mehtod='POST' action="{postUrl}">
	 <fieldset>
        <legend>Add New Employee</legend>
        <p>
        <label for="firstName"><spring:message code="Employee.firstName" /> </label>
              <form:input id="name" path="firstName" tabindex="1"/>
        </p>
         <p>
        <label for="lastName"><spring:message code="Employee.lastName" /> </label>
              <form:input id="name" path="firstName" tabindex="1"/>
        </p>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="4">
            <input id="submit" type="submit" tabindex="5" 
                value="Add Employee">
        </p>
    </fieldset>
	</form:form>
	</div>

</body>

</html>