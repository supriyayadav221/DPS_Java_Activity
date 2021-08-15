<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.ltts.Day9.model.*,com.ltts.Day9.Dao.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">




<%
ProdDao pd=new ProdDao();
List<Prod> li=pd.getAllProd();


%>
<form name="adressFunction" method="get" action="#">
Enter City name: <input type="text" name="a">
 <input type="submit" name="submit" value="Adress"/>
</form>




<a href="index.jsp">Dashboard</a>
<table>
<tr>
<th>Production id</th>
<th>Production Name</th>
<th>Production Address</th>
<th>Production OwnerName</th>
<th>Production Release Date</th>
</tr>
<%  String ss=request.getParameter("a");%>
<%for(Prod p:li){
if(p.getAdress().equals(ss)){
%>
	<tr>
	<td><%=p.getProductionid() %></td>
	<td><%=p.getProductionname() %></td>
	<td><%=p.getAdress() %></td>
	<td><%=p.getOwnername() %></td>
	<td><%=p.getRd() %></td>
	
	
	
	</tr>
<%}}%>
</table>


</body>
</html>