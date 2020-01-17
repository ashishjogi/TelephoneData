<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Phone Details</title>
</head>
<body>
	<div>

		<form action="Create">
			<label> FirstName: </label>
			<iput type="text" name="firstname" />
			<label>LastName:</label>
			<iput type="text" name="lastname" />
			<label>Company name:</label>
			<iput type="text" name="company" />
			<label>Address: </label>
			<iput type="text" name="address" />
			<label>City:</label>
			<iput type="text" name="city" />
			<label>Country: </label>
			<iput type="text" name="country" />
			<label>State: </label>
			<iput type="text" name="state" />
			<label>Zip:</label>
			<iput type="text" name="zip" />
			<label>Phone:</label>
			<iput type="text" name="phone" />
			<label>Alternate Phone:</label>
			<iput type="text" name="alternate" />
			<label>Email: </label>
			<iput type="text" name="email" />

			<button>Add</button>
		</form>
	</div>

</body>
</html>