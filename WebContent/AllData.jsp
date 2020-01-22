<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Data</title>
</head>
<body>
	<marquee width=500 behavior=alternate>

		<p>
			<img width=20
				src=https://previews.123rf.com/images/yupiramos/yupiramos1608/yupiramos160815069/61298993-bag-shop-shopping-gift-packet-store-paper-purchase-vector-illustration-isolated.jpg>
			Welcome to your Shopping Cart <img width=20
				src=https://previews.123rf.com/images/yupiramos/yupiramos1608/yupiramos160815069/61298993-bag-shop-shopping-gift-packet-store-paper-purchase-vector-illustration-isolated.jpg>
		</p>
	</marquee>
	<table border=1 rules=all >
		<tr style="background-color: tomato">
			<b>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Comapany Name</th>
				<th>Address</th>
				<th>City</th>
				<th>Country</th>
				<th>State</th>
				<th>Zip</th>
				<th>Phone</th>
				<th>Alternate Phone</th>
				<th>Email</th>
				<th>Object</th>

			</b>
		</tr>

		<c:forEach var="tempItems" items="${key}">


			<tr>
				<td>${tempItems.getFirst_name()}</td>
				<td>${tempItems.getLast_name()}</td>
				<td>${tempItems.getCompany_name()}</td>
				<td>${tempItems.getAddress()}</td>
				<td>${tempItems.getCity()}</td>
				<td>${tempItems.getCounty()}</td>
				<td>${tempItems.getState()}</td>
				<td>${tempItems.getZip()}</td>
				<td>${tempItems.getPhone()}</td>
				<td>${tempItems.getAlternate_phone()}</td>
				<td>${tempItems.getEmail() }</td>
				<td>${tempItems}</td>

			</tr>
		</c:forEach>
	</table>


</body>
</html>