<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<li><a href="<spring:url value="/department/list"/>">Department(NABIN)</a></li>
<li><a href="<spring:url value="/employee/list"/>">Employees(NABIN)</a></li>
<li><a href="<spring:url value="/login"/>">Login(NIDINA)</a></li>

<li><a href="<spring:url value="/leave"/>">Apply Leave(ASHOK)</a></li>
<li><a href="<spring:url value="/holidays"/>">Holidays(ASHOK)</a></li>
<li><a href="<spring:url value="/attendence"/>">Attendance(ASHOK)</a></li>
<li><security:authorize  access="hasRole('ROLE_ADMIN')"><a href="<spring:url value="/vacancy/vacancyList"/>">Vacancy(NIDINA)</a></security:authorize></li>


