<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">
</head>
<body>
<div>
Employee List
<form  action="../employee/addNewEmployee" method="GET">
<input type="submit" value="Add new Employee"/>
</form>
</div>
  <table id="example">
    <thead>
      <tr>  <th>S.NO</th>
      <th>Name</th>
      <th>JoinedDate</th>
      <th>PhoneNum</th>
      <th>View Details</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${employeeList}" var="employee">
		 <tr>
		 <td>1</td>
		  <td>${employee.firstName} </td>
		 <td>${employee.joinedDate}</td>
		 <td>${employee.phone.prefix}-${employee.phone.areaCode}-${employee.phone.number}</td>
		 <td><input type="button" value="view" name="view"></td>
		 </tr>
	</c:forEach>
     
    
    </tbody>
  </table>
  <script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
  <script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>
  <script>
  $(function(){
    $("#example").dataTable();
  })
  </script>
</body>
</html>