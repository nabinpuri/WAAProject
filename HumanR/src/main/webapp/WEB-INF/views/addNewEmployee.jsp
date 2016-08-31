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
	<spring:url var="postUrl" value="../employee/addewEmployee" />
	<form:form modelAttribute="newEmployee" mehtod='POST' action="{postUrl}">
	 <fieldset>
        <legend>Add New Employee</legend>
        <p>
        <label for="fname">FirstName: </label>
              <form:input id="firstName" path="firstName" tabindex="1"/>
        </p>
         <p>
        <label for="fname">LastName: </label>
              <form:input id="lastName" path="lastName" tabindex="2"/>
        </p>
         <p>
        <label for="fname">DateOfBirth: </label>
              <form:input id="dateOfBirth" path="dateOfBirth" tabindex="3"/>
        </p>
         <p>
        <label for="fname">Gender: </label>
              <form:input id="gender" path="gender" tabindex="4"/>
        </p>
         <p>
        <label for="fname">Department: </label>
              <form:input id="department" path="department" tabindex="5"/>
        </p>
         <p>
        <label for="fname">Post: </label>
              <form:input id="post" path="post" tabindex="6"/>
        </p>
         <p>
        <label for="fname">SSN: </label>
              <form:input id="ssn" path="ssn" tabindex="7"/>
        </p>
        <p>
        <label for="fname">Adress: </label><br>
             city: <form:input id="city" path="address.city" tabindex="8"/><br>
             state:<form:input id="state" path="address.state" tabindex="9"/><br>
              ZipCode: <form:input id="zipCode" path="address.zipCode" tabindex="10"/><br>
               Street: <form:input id="street" path="address.street" tabindex="11"/><br>
               Email: <form:input id="email" path="address.email" tabindex="12"/>
        </p>
         <p>
        <label for="fname">Phone: </label><br>
              <form:input id="city" path="phone.prefix" tabindex="13"/>
               <form:input id="state" path="phone.areaCode" tabindex="14"/>
                <form:input id="zipCode" path="phone.number" tabindex="15"/>
        </p>
         <p>
        <label for="fname">Joined Date: </label>
              <form:input id="joinedDate" path="joinedDate" tabindex="16"/>
        </p>
         <p>
        <label for="fname">Contract Date: </label>
              <form:input id="contractDate" path="contractDate" tabindex="17"/>
        </p>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="18">
            <input id="submit" type="submit" tabindex="19" 
                value="Add Employee">
        </p>
    </fieldset>
	</form:form>
	</div>

</body>

</html>