<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Car Page</title>
<style>
   body {
    background: #c7b39b; 
   }
  </style>
</head>
<body>
	
	<form action="MainServlet" method="post">
	<strong>Brand:</strong> 
    <input  size="30" name="brand" placeholder="Enter new author here">
  	<strong>Model:</strong> 
    <input  size="30" name="model" placeholder="enter new title here">     
    <button type="submit" name="command" value="EXECUTE_CREATE">Create</button>
    </form>
	
</body>
</html>