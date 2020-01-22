<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>create</title>
<style>
div {
	height: 500px;
	width: 400px;
	margin-left: 300px;
	margin-top: 100px;
	
}

input[type="text"] {
	width: 100%;
	height: 15px;
	margin-bottom: 10px;
	background-color: #3CBC8D;
	
}
</style>
</head>
<body>
	<div>


		<form action="Create">
			<label> FirstName: </label> <br> <input type="text"
				name="firstname" /> <label>LastName:</label> <br> <input
				type="text" name="lastname" /> <label>Company name:</label> <br>
			<input type="text" name="company" /> <label>Address: </label> <br>
			<input type="text" name="address" /> <label>City:</label> <br>
			<input type="text" name="city" /> <label>Country: </label> <br>
			<input type="text" name="country" /> <label>State: </label> <br>
			<input type="text" name="state" /> <label>Zip:</label> <br> <input
				type="text" name="zip" /> <label>Phone:</label> <br> <input
				type="text" name="phone" /> <label>Alternate Phone:</label> <br>
			<input type="text" name="alternate" /> <label>Email: </label> <br>
			<input type="text" name="email" />

			<button>Add</button>
		</form>
	</div>

</body>
</html>