<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		<c:forEach items="${books}" var="book">
		<tr >

			<td>${book.id}</td>
			<td>${book.name}</td>
			<td>${book.price}</td>

		</tr>
		</c:forEach>

	</table>


</body>
</html>