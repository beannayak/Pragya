
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<c:url var="homeBase" value="/" />
	</head>
	<body>
		<form:form method="post" modelAttribute="reportModel" enctype="multipart/form-data" action="${homeBase}report">
			Name:
            <form:input path="name" type="text" /> 
            <form:errors path="name" /><br />
            
            instruction:
            <form:input path="instruction" type="text" /> 
            <form:errors path="instruction" /><br />
            
            Picture:
            <form:input path="picture" type="file" /> 
            <form:errors path="picture" /><br />
            
            Latitude:
            <form:input path="latitude" type="text" /> 
            <form:errors path="latitude" /><br />
            
            Longitude:
            <form:input path="longitude" type="text" /> 
            <form:errors path="longitude" /><br />
            
            Altitude:
            <form:input path="altitude" type="text" /> 
            <form:errors path="altitude" /><br />
            
            <input type="submit" value="Submit" />
		</form:form>
	</body>
</html>