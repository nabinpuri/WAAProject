<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script>
  $(function(){
	  alert(1);
	  $('#vacancyTable').dataTable();	
  })
  </script>


<html>

<body>
	<h2>Vacancy List</h2>

	<table id="vacancyTable" cellpadding="0" cellspacing="0" border="1">
		<thead>
			<tr>
			<th>Number Of Employee</th>
			<th>Requirement</th>
			<th>Post</th>
			<th>Number To Be Filled</th>
			<th>Approved</th>
			<th>Reject</th>
			<th>Forward</th>
		</tr>
		</thead>
		<tbody>
			<c:forEach var="vacancy" items="${vacancyList}">
				<tr>
	
				<td>${vacancy.numberOfEmployee}</td>
				<td>${vacancy.requirement}</td>
				<td>${vacancy.post.postName}</td>
				<td>${vacancy.numberOfFilledNumber}</td>
			
					<td><input type="button" value="approve"
						onclick="approveCall(${vacancy.id});"></td>
					<td><input type="button" value="reject"
						onclick="rejectCall(${vacancy.id});"></td>
					<td><input type="button" value="forward"
						onclick="forwardCall(${vacancy.id});"></td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
