<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
 <% if (request.getSession().getAttribute("email")==null ) { %>
      <p>   Signin or Signup first</p>
      <a href="hello.html">SignIn/SignUp</a>
      <% } else { %>
        <h1>Hi Welcome user :</h1> <%=request.getSession().getAttribute("email") %>
<br>
<br>
<a href="index.html">Home</a><br><br>
<a href="logout.jsp">Logout</a><br><br>
      <% } %>


</body>
</html>