package com.ltts.demoProduction.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.ltts.demoProduction.Model.Production;
import com.ltts.demoProduction.configure.MyConfigure;



public class ProductionDao {
	
	public boolean insertProduction(Production p) throws SQLException, ParseException
	{
		Connection connection=MyConfigure.getConnection();
		Statement s=connection.createStatement();
		try {
//			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//	LocalDate l = LocalDate.parse( p.getRd(), formatter ) ;
			
			Date d= Date.valueOf(p.getRd());
		s.execute("insert into productions values("+p.getProductionid() + ",' "+ p.getProductionname()+" ' ,' "+p.getAdress()+"','"+p.getOwnername()+"','"+d+" ') ");
		
		
			return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return true;
		}
		finally {
			connection.close();
		}		
		
	}
	
	public List<Production> getAllProductions() throws SQLException
	{
		List<Production> li=new ArrayList<Production>();
		Connection connection = MyConfigure.getConnection();
		PreparedStatement ps=connection.prepareStatement("Select * from productions");
ResultSet rs=	ps.executeQuery();
while(rs.next())
{
	li.add(new Production(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),LocalDate.parse(rs.getString(5))));
	
	}

		return li;
		
	}
	
	public boolean updateProduction(int productionId,String newName) throws SQLException
	{
		Connection connection=MyConfigure.getConnection();
		String update_query="UPDATE productions SET  productionname = ? WHERE productionid =?";
		PreparedStatement ps=connection.prepareStatement(update_query);
//		ps.setString(1, p.getProductionname());
//		ps.setString(2, p.getAdress());
//		ps.setString(3, p.getOwnername());
		
		ps.setString(1, newName);
		ps.setInt(2, productionId);
	
		int rowsUpdated=ps.executeUpdate();
		if(rowsUpdated > 0)
			{System.out.println("Updated Successfully");
			}
		return false;
	}
	
	
	
	public boolean deleteProduction(int productionId) throws SQLException
	{
		Connection connection=MyConfigure.getConnection();
		String delete_sql="DELETE FROM productions WHERE productionid=?";
		PreparedStatement ps=connection.prepareStatement(delete_sql);
		ps.setInt(1, productionId);
		int executeDelete = ps.executeUpdate();
		if(executeDelete == 1)
		{
			System.out.println("Production row is delete for id :"+productionId);
			
		}
		
		return false;
	}
	
	

}
