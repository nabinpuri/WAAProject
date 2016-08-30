<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
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

<body>
	<c:forEach items="vacanylist" var="vacancy">
	</c:forEach>
 
 </body>
</html>
