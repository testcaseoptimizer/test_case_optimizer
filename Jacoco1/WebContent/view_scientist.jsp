<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>Scientist Table Demo</h2>
<hr>
<br/>

<table border="1">
		
	<tr>
		<th>Name</th>
		<th>Discovery</th>
		<th>Year</th>		
	</tr>	
	
	<c:forEach var="tempScientist" items="${Scientists_list}">
		
		<tr>
			<td>${tempScientist.name}</td> 
			<td>${tempScientist.discovery}</td> 
			<td>${tempScientist.yod}</td> 
		</tr>
		
	</c:forEach>

</table>
<a href="http://localhost:8081/Jacoco1/">Go Home</a>
</body>
</html>