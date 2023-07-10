<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>Bank Accounts Table </h2>
<hr>
<br/>

<table border="1">
		
	<tr>
		<th>Name</th>
		<th>Bank Name</th>
		<th>Type Of Account</th>		
	</tr>	
	
	<c:forEach var="tempBank_account" items="${bank_accounts_list}">
		
		<tr>
			<td>${tempBank_account.name}</td> 
			<td>${tempBank_account.bank_name}</td> 
			<td>${tempBank_account.account_type}</td> 
		</tr>
		
	</c:forEach>

</table>
<a href="http://localhost:8081/Jacoco1/">Go Home</a>
</body>
</html>






