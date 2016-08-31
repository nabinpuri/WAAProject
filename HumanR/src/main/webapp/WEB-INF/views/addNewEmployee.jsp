<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="http://getbootstrap.com/dist/css/bootstrap.css"	rel="stylesheet">
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
	<form:form modelAttribute="newEmployee" mehtod='POST' action="../employee/addewEmployee">
	<div class="col-md-12 form-group">
	 <fieldset >
        <legend>Add New Employee</legend>
        <div class="col-md-8 form-group">
	        <div class="col-md-3"><label for="fname">FirstNames: </label></div>
	        <div class="col-md-5 "><form:input id="firstName" path="firstName" tabindex="1"  class="form-control"/></div>    
        </div>
        <div class="col-md-8 form-group">
	        <div class="col-md-3"><label for="fname">LastName: </label></div>
	        <div class="col-md-7"><form:input id="lastName" path="lastName" tabindex="2" class="form-control"/></div>    
        </div>
        <div class="col-md-8 form-group">
	        <div class="col-md-3"><label for="fname">DateOfBirth: </label></div>
	        <div class="col-md-7"><form:input id="dateOfBirth" path="dateOfBirth" tabindex="3" class="form-control"/></div>    
        </div>
        <div class="col-md-8 form-group">
	        <div class="col-md-3"><label for="fname">Gender: </label></div>
	        <div class="col-md-7"> <form:select id="gender" path="gender"  class="form-control">  
                <form:option selected="selected" value="Male">Male</form:option>  
                <form:option value="Female">Female</form:option>
            </form:select> </div>    
        </div>
        <div class="col-md-8 form-group">
	        <div class="col-md-3"><label for="department">Department: </label></div>
	        <div class="col-md-7"><form:select path="department.departmentId" items="${departments}" itemValue="departmentId" itemLabel="departmentName" tabindex="5" class="form-control"/></div>    
        </div>
        <div class="col-md-8 form-group">
	        <div class="col-md-3"> <label for="fname">Post: </label></div>
	        <div class="col-md-7"><form:select path="post.postId" items="${posts}" itemValue="postId" itemLabel="postName" tabindex="6" class="form-control" /></div>    
        </div>
         <div class="col-md-8 form-group">
	        <div class="col-md-3"> <label for="fname">SSN: </label></div>
	        <div class="col-md-7"><form:input id="ssn" path="ssn" tabindex="7" class="form-control"/></div>    
        </div>
        <div class="col-md-5">
	        <div class="col-md-3"><label for="fname">Address: </label><br></div>   
        </div>
        
        <div class="col-md-8 form-group">
	        <div class="col-md-3"> <label for="fname">City: </label></div>
	        <div class="col-md-7"> <form:input id="city" path="address.city" tabindex="8" class="form-control"/></div>    
        </div>
        <div class="col-md-8 form-group">
	        <div class="col-md-3"> <label for="fname">Street: </label></div>
	        <div class="col-md-7"><form:input id="street" path="address.street" tabindex="11" class="form-control"/></div>    
        </div>
        <div class="col-md-8 form-group">
	        <div class="col-md-3"> <label for="fname">State: </label></div>
	        <div class="col-md-7"><form:input id="state" path="address.state" tabindex="9" class="form-control"/></div>    
        </div>
        <div class="col-md-8 form-group">
	        <div class="col-md-3"> <label for="fname">ZipCode: </label></div>
	        <div class="col-md-7"><form:input id="zipCode" path="address.zipCode" tabindex="10" class="form-control"/></div>    
        </div>
        <div class="col-md-8 form-group">
	        <div class="col-md-3"> <label for="fname">Email: </label></div>
	        <div class="col-md-7"><form:input id="email" path="address.email" tabindex="12" class="form-control"/></div>    
        </div>
        
         <div class="col-md-8 form-group">
	        <div class="col-md-3"><label for="fname">Phone:</label><br></div>
	        <div class="col-md-2"><form:input id="city" path="phone.prefix" tabindex="13" class="form-control"/></div>
	        <div class="col-md-2"><form:input id="state" path="phone.areaCode" tabindex="14" class="form-control"/></div> 
	        <div class="col-md-2"> <form:input id="zipCode" path="phone.number" tabindex="15" class="form-control"/></div> 
        </div>
        
        <div class="col-md-8 form-group">
	        <div class="col-md-3"> <label for="fname">Joined Date: </label></div>
	        <div class="col-md-7"><form:input id="joinedDate" path="joinedDate" tabindex="16" class="form-control"/></div>    
        </div>
        <div class="col-md-8 form-group">
	        <div class="col-md-3"> <label for="fname">Contract Date: </label></div>
	        <div class="col-md-7"><form:input id="contractDate" path="contractDate" tabindex="17" class="form-control"/></div>    
        </div>
        <div class="col-md-5 text-right form-group">
	        <div class="col-md-2"> <input id="reset" type="reset" tabindex="18" class=" btn-danger form-control"></div>
	        <div class="col-md-2"> <input id="submit" type="submit" tabindex="19" 
                value="Save" class=" btn-primary form-control"/></div>    
        </div>
    </fieldset>
	</div>
	</form:form>
	</div>
</body>

</html>