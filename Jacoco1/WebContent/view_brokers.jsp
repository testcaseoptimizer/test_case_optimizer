<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>Broker Table Demo</h2>
<hr>
<br/>

<table border="1">
		
	<tr>
		<th>FirstName</th>
		<th>LastName</th>
		<th>age</th>	
        <th>BHK</th>	
	</tr>	
	
	<c:forEach var="tempBroker" items="${Buyers_list}">
		
		<tr>
			<td>${tempBroker.firstName}</td> 
			<td>${tempBroker.lastName}</td> 
			<td>${tempBroker.age}</td>
            <td>${tempBroker.bhk}</td> 
		</tr>
		
	</c:forEach>

</table>
<a href="http://localhost:8081/Jacoco1/">Go Home</a>
</body>
</html>