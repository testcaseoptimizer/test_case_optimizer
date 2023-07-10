<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>Auto drivers Table </h2>
<hr>
<br/>

<table border="1">
		
	<tr>
		<th>Name</th>
		<th>Place</th>
		<th>Number plate of Auto</th>		
	</tr>	
	
	<c:forEach var="tempAuto_driver" items="${auto_drivers_list}">
		
		<tr>
			<td>${tempAuto_driver.name}</td> 
			<td>${tempAuto_driver.place}</td> 
			<td>${tempAuto_driver.auto_no}</td> 
		</tr>
		
	</c:forEach>

</table>
<a href="http://localhost:8081/Jacoco1/">Go Home</a>

</body>
</html>






