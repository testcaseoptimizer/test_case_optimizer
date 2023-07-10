<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>Employee Table Demo</h2>
<hr>
<br/>

<table border="1">
		
	<tr>
		<th>FirstName</th>
		<th>LastName</th>
		<th>age</th>	
        <th>position</th>	
	</tr>	
	
	<c:forEach var="tempEmployee" items="${Employees_list}">
		
		<tr>
			<td>${tempEmployee.firstName}</td> 
			<td>${tempEmployee.lastName}</td> 
			<td>${tempEmployee.age}</td> 
            <td>${tempEmployee.pos}</td>
		</tr>
		
	</c:forEach>

</table>
<a href="http://localhost:8081/Jacoco1/">Go Home</a>
</body>
</html>