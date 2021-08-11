<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
    <%@ page import="com.ltts.Day9.model.*,com.ltts.Day9.Dao.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ProdDao pd=new ProdDao();
List<Prod> li=pd.getAllProd();

%>




<a href="index.html">Index</a>
<table>
<tr>
<th>Production id</th>
<th>Production Name</th>
<th>Production Address</th>
<th>Production OwnerName</th>
<th>Production Release Date</th>
<th>Edit</th>
</tr>
<%for(Prod p:li){%>
	<tr>
	<td><%=p.getProductionid() %></td>
	<td><%=p.getProductionname() %></td>
	<td><%=p.getAdress() %></td>
	<td><%=p.getOwnername() %></td>
	<td><%=p.getRd() %></td>
	<td><a href="edit.jsp?id=<%=p.getProductionid() %>">Edit</a></td>
	
	
	
	</tr>
<%}%>
</table>



</body>
</html>