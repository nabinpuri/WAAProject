<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>

<body>
	   Department list display 
	Nabin do work here
 <c:forEach items="${departmentList}" var="department">
				<div>Id=${department.departmentId}   Name=${department.departmentName}</div>
			</c:forEach>
 </body>
</html>
</html>