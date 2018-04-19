<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Car Page</title>
<style>
   body {
    background: #c7b39b; 
   }
  </style>
</head>
<body>
	
	<form action="MainServlet" method="post">
	<strong>Brand:</strong> 
    <input  size="30" name="brand" value="${edit_car.getBrand()}" placeholder="Enter new brand here">
  	<strong>Model:</strong> 
    <input  size="30" name="model" value="${edit_car.getModel()}" placeholder="enter new model here"> 
    <input type="hidden" name="car_id" value="${edit_car.getId()}"/>     
    <button type="submit" name="command" value="EXECUTE_UPDATE">Update Car</button>
    </form>
	
</body>
</html>