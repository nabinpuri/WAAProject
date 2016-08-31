<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<body>
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
</html>