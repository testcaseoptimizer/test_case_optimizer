<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>Movie Table Demo</h2>
<hr>
<br/>

<table border="1">
		
	<tr>
		<th>Movie Name</th>
		<th>BoxOffice</th>
		<th>rating</th>		
	</tr>	
	
	<c:forEach var="tempMovie" items="${Movie_list}">
		
		<tr>
			<td>${tempMovie.movieName}</td> 
			<td>${tempMovie.boxoffice}</td> 
			<td>${tempMovie.rating}</td> 
		</tr>
		
	</c:forEach>

</table>
<a href="http://localhost:8081/Jacoco1/">Go Home</a>
</body>
</html>