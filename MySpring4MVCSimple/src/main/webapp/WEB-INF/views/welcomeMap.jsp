<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Spring 4 MVC Hello</title>
	<link rel='stylesheet' href='<c:url value="/resources/css/style.css" />' type='text/css' media='all' /> 
</head>
<body>
	<h2>Hello World, Spring MVC   ModelMap data</h2>

	<p>Data :  ${city}</p><br><p>Data :  ${address}</p>
</body>
</html>