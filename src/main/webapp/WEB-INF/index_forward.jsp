<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
<style>
   body {
    background: #c7b39b; 
   }
  </style>

</head>
<body>
	
	<strong>Hello Alex!
	<br>	Your Car Park:
	</strong>
	<div>  
     <c:forEach items="${car_list}" var="car">
		<p>
		<form action="MainServlet" method="get"> 
		<strong><c:out value="${car}" /></strong>
		<button type="submit" name="command" value="DELETE_CAR">Delete Car</button>
		<input type="hidden" name="car_id" value="${car.getId()}"/>
		<button type="submit" name="command" value="UPDATE_CAR">Edit Car</button>
		</form>	
		<p>			
	</c:forEach>
	
	<br>
	<form action="MainServlet" method="get"> 
	<input type="hidden" name="command" value="CREATE_CAR"/>
	<input type="submit" name="command" value="Create Car"/>
	</form>
	
	</div> 
	
			

</body>
</html>