<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>QK_employee Table</h2>
<hr>
<br/>

<table border="1">
		
	<tr>
		<th>Name</th>
		<th>Employee ID</th>
		<th>Laptop ID</th>		
	</tr>	
	
	<c:forEach var="tempQK_employee" items="${qk_employee_list}">
		
		<tr>
			<td>${tempQK_employee.name}</td> 
			<td>${tempQK_employee.employee_id}</td> 
			<td>${tempQK_employee.laptop_id}</td> 
		</tr>
		
	</c:forEach>

</table>
<a href="http://localhost:8081/Jacoco1/">Go Home</a>
</body>
</html>






