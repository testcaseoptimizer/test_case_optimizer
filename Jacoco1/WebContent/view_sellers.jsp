<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>Seller Table</h2>
<hr>
<br/>

<table border="1">
		
	<tr>
		<th>Name</th>
		<th>No. of Branches</th>
		<th>Product</th>		
	</tr>	
	
	<c:forEach var="tempSeller" items="${seller_list}">
		
		<tr>
			<td>${tempSeller.name}</td> 
			<td>${tempSeller.no_of_branches}</td>
			<td>${tempSeller.product}</td> 
		</tr>
		
	</c:forEach>

</table>
<a href="http://localhost:8081/Jacoco1/">Go Home</a>
</body>
</html>






