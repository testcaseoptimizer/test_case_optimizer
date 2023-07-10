<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>Cricketers Table </h2>
<hr>
<br/>

<table border="1">
		
	<tr>
		<th>Name</th>
		<th>Country</th>
		<th>Role</th>		
	</tr>	
	
	<c:forEach var="tempCricketer" items="${cricketers_list}">
		
		<tr>
			<td>${tempCricketer.name}</td> 
			<td>${tempCricketer.country}</td> 
			<td>${tempCricketer.role}</td> 
	</tr>
		
	</c:forEach>

</table>
<a href="http://localhost:8081/Jacoco1/">Go Home</a>
</body>
</html>






