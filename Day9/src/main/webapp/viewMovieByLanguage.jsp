<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@ page import="com.ltts.Day9.model.*,com.ltts.Day9.Dao.*,java.util.*"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	MovieDao md = new MovieDao();
List<Movie> li=md.getAllMovies();



%>

<form name="adressFunction" method="get" action="#">
Enter movie language : <input type="text" name="a">
 <input type="submit" name="submit" value="language"/>
</form>




<a href="index.jsp">Dashboard</a><br><br>
<table>
<tr>
<th>Id</th>
<th>Name</th>
<th>Hero</th>
<th>Heroine</th>
<th>Release Date</th>
<th>Language</th>
<th>Length</th>
<th>Movie Type</th>
<th>Production Id</th>
</tr>
<%  String ss=request.getParameter("a");%>
<%for(Movie m:li){
if(m.getLanguage().equals(ss)){
%>
	<tr>
<td><%= m.getMovieId() %></td>
<td><%= m.getMovieName() %></td>
<td><%= m.getHeroName() %></td>
<td><%= m.getHeroine() %></td>
<td><%= m.getReleaseDate() %></td>
<td><%= m.getLanguage() %></td>
<td><%= m.getLength() %></td>
<td><%= m.getMovieType() %></td>
<td><%= m.getProductionId() %></td>
	
	
	
	
	</tr>
<%}}%>
</table>
</body>
</html>