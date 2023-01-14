<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
table{
width: 50%;
}
table, th, td {
  border: 1px solid black;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Books Details</h1>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Price</th>

		</tr>
		<tr >

			<td>${books.id}</td>
			<td>${books.name}</td>
			<td>${books.price}</td>

		</tr>

	</table>

</body>
</html>