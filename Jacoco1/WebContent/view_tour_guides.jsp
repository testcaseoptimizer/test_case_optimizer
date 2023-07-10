<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>Tour Guide Table</h2>
<hr>
<br/>

<table border="1">
		
	<tr>
		<th>Name</th>
		<th>ID</th>
		<th>Place</th>		
	</tr>	
	
	<c:forEach var="tempTour_guide" items="${tour_guide_list}">
		
		<tr>
			<td>${tempTour_guide.name}</td> 
			<td>${tempTour_guide.id}</td> 
			<td>${tempTour_guide.place}</td> 
		</tr>
		
	</c:forEach>

</table>
<a href="http://localhost:8081/Jacoco1/">Go Home</a>
</body>
</html>






