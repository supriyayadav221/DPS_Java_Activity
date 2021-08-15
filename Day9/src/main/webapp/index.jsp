<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="com.ltts.Day9.model.*,com.ltts.Day9.Dao.*,java.util.*"  %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body bgcolor="pink">

<%	 
	if (session.getAttribute("email") == null) {
		response.sendRedirect("hello.html");
		return;
	}
	%>

<a href="logout.jsp">Logout</a>
<br><br>
<a href="welcome.jsp">Profile</a>



<h1>CRUD OPERATIONS</h1>


<h2>Productions</h2><br><br>
<a href="login.html">INSERT INTO PRODUCTION </a><br><br>
<a href="viewProduction.jsp">VIEW AND EDIT PRODUCTIONS </a><br><br>
<a href="delete.html">DELETE THE PRODUCTION </a><br><br>
<a href="adress.jsp">SEARCH PRODUCTION BY ADRESS </a><br><br>


<h2>Movies</h2><br><br>
<a href="addMovie.html">INSERT INTO MOVIES</a><br><br>
<a href="viewMovie.jsp">VIEW MOVIES </a><br><br>
<a href="viewMovieByLanguage.jsp">SEARCH MOVIES BY LANGUAGE </a><br><br>



    
</body>
</html>