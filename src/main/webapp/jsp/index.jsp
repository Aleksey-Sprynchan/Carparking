<!--<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>

</head>
<body> -->
	
	<jsp:forward page="/MainServlet">
		<jsp:param  name="command" value="INDEX_FORWARD"/>
	</jsp:forward>

<!--  </body>
</html> -->