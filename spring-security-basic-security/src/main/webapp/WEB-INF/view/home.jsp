<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>

<head>
	<title>Company home page</title>
</head>

<body>

	<h2>Company home page</h2>
	<hr>
	
	<p>
	Welcome to the Company home page!
	</p>

	<hr>
	
	<!-- display username and role -->
	<p>
	
		User: <security:authentication property="principal.username"/>
		<br><br>
		Role: <security:authentication property="principal.authorities"/>
	
	</p>
	
	<hr>
	
	
	<security:authorize access="hasRole('MANAGER')">
	<!-- add a link to point to /leaders -->
		<p>
			<a href="${pageContext.request.contextPath}/leaders">Leadership Meeting</a>
			Only for Manager peeps
		</p>
		
		<hr>
	</security:authorize>
	
	<security:authorize access="hasRole('ADMIN')">
	<!-- add link to point to /systems -->
		<p>
			<a href="${pageContext.request.contextPath}/systems">IT Systems Meeting</a>
			Only for Admin peeps
		</p>
		
		<hr>
	</security:authorize>
	

	<!-- add logout button -->
	<form:form action="${pageContext.request.contextPath}/logout" 
			   method="POST">
	
		<input type="submit" value="logout"/>
	
	</form:form>

</body>

</html>