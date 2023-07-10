<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>Tickets Table </h2>
<hr>
<br/>

<table border="1">
		
	<tr>
		<th>Name</th>
		<th>Place</th>
		<th>Tickets Type</th>		
	</tr>	
	
	<c:forEach var="tempTicket" items="${tickets_list}">
		
		<tr>
			<td>${tempTicket.name}</td> 
			<td>${tempTicket.place}</td> 
			<td>${tempTicket.ticket_type}</td> 
		</tr>
		
	</c:forEach>

</table>
<a href="http://localhost:8081/Jacoco1/">Go Home</a>
</body>
</html>













