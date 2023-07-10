<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>Football Table Demo</h2>
<hr>
<br/>

<table border="1">
		
	<tr>
		<th>First Name</th>
		<th>Club Name</th>
		<th>Nationality</th>		
	</tr>	
	
	<c:forEach var="tempFootball" items="${Football_list}">
		
		<tr>
			<td>${tempFootball.name}</td> 
			<td>${tempFootball.club}</td> 
			<td>${tempFootball.nationality}</td> 
		</tr>
		
	</c:forEach>

</table>
<a href="http://localhost:8081/Jacoco1/">Go Home</a>
</body>
</html>