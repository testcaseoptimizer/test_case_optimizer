<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>Jee Passout Table </h2>
<hr>
<br/>

<table border="1">
		
	<tr>
		<th>Name</th>
		<th>Year passed</th>
		<th>Rank</th>		
	</tr>	
	
	<c:forEach var="tempJee_passout" items="${jee_passouts_list}">
		
		<tr>
			<td>${tempJee_passout.name}</td> 
			<td>${tempJee_passout.year}</td> 
			<td>${tempJee_passout.rank}</td> 
		</tr>
		
	</c:forEach>

</table>
<a href="http://localhost:8081/Jacoco1/">Go Home</a>
</body>
</html>






