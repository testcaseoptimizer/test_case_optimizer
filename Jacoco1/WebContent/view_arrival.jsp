<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>Arrival Table Demo</h2>
<hr>
<br/>

<table border="1">
		
	<tr>
		<th>Airline</th>
		<th>Destination</th>
		<th>time</th>		
	</tr>	
	
	<c:forEach var="tempArrival" items="${Arrival_list}">
		
		<tr>
			<td>${tempArrival.airline}</td> 
			<td>${tempArrival.destination}</td> 
			<td>${tempArrival.time}</td> 
		</tr>
		
	</c:forEach>

</table>
<a href="http://localhost:8081/Jacoco1/">Go Home</a>
</body>
</html>