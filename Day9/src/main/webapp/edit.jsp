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
int id=Integer.parseInt(request.getParameter("id"));
List<Prod> li=pd.getAllProd();
Prod p=null;
for(Prod p1:li)
{
if(p1.getProductionid()==id)
{
p=p1;	
}
}


%>


<h1>Update the details</h1>
<form action="./updateController" method="post">

Production Id : <input type="number" name="productionid" value="<%=p.getProductionid()%>"><br><br>
Production Name : <input type="text" name="productionname" value="<%=p.getProductionname() %>>"><br><br>
Address : <input type="text" name="adress" value="<%=p.getAdress() %>>"><br><br>
Owner Name : <input type="text" name="ownername" value="<%=p.getOwnername() %>"><br><br>
Release Date : <input type="text" name="rd" value="<%=p.getRd() %>"><br><br>
<input type="submit" value="Update Production"><br><br>
</form>

</body>
</html>