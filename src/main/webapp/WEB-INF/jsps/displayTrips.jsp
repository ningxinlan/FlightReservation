<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trips</title>
</head>
<body>
<h2>Trips:</h2>
<table>
<tr>
<th>Airlines</th>
<th>Departure City</th>
<th>Arrival City</th>
</tr>

<c:forEach items="${trips}" var="trip">
<tr>
<td>${trip.operatingAirlines}</td>
<td>${trip.departureCity}</td>
<td>${trip.arrivalCity}</td>
</tr>

</c:forEach>
</table>
</body>
</html>