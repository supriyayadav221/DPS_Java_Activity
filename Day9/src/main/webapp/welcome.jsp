<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
 <% if (session.getAttribute("email")==null ) { 
     
      response.sendRedirect("hello.html");
      return ;
      }  %>
<br>
<br>

<h1>Welcome : <%=(request.getSession().getAttribute("email") )%></h1>
<a href="index.jsp">Home</a><br><br>
<a href="logout.jsp">Logout</a><br><br>
    


</body>
</html>