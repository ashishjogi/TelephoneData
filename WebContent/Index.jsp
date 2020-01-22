<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="upload">
			<input type="text" name="description" /> <input type="file"
				name="file" />
			<button type="submit">Upload</button>
		</form>
	</div>
	
	<div>
		<form action="Create">
			
			<button ><a href="Create.jsp">Submit</a> </button>
		</form>
		
	</div>
	
		<div>
		<form action="Create">
			
			<button ><a href="showData">See Data</a> </button>
		</form>
		
	</div>
</body>
</html>