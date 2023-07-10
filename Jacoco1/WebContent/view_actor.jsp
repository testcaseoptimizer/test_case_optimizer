<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>Actor Table Demo</h2>
<hr>
<br/>

<table border="1">
		
	<tr>
		<th>FirstName</th>
		<th>LastName</th>
		<th>age</th>		
	</tr>	
	
	<c:forEach var="tempActor" items="${Actor_list}">
		
		<tr>
			<td>${tempActor.firstName}</td> 
			<td>${tempActor.lastName}</td> 
			<td>${tempActor.age}</td> 
		</tr>
		
	</c:forEach>

</table>
<a href="http://localhost:8081/Jacoco1/">Go Home</a>
</body>
</html>