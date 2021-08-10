package com.ltts.Day9.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.ltts.Day9.config.MyConfigure;
import com.ltts.Day9.model.Prod;



public class ProdDao {
	public boolean insertProduction(Prod p) throws SQLException, ParseException, ClassNotFoundException
	{
		Connection connection=MyConfigure.getConnection();
		Statement s=connection.createStatement();
		try {

		s.execute("insert into prod values("+p.getProductionid() + ",' "+ p.getProductionname()+" ' ,' "+p.getAdress()+"','"+p.getOwnername()+ "','"+p.getRd()+" ') ");
		
		
			return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return true;
		}
		finally {
			connection.close();
		}		
		
	}
	
	
	public List<Prod> getAllProd() throws SQLException, ClassNotFoundException
	{
		List<Prod> li=new ArrayList<Prod>();
		Connection connection = MyConfigure.getConnection();
		PreparedStatement ps=connection.prepareStatement("Select * from prod");
ResultSet rs=	ps.executeQuery();
while(rs.next())
{
	li.add(new Prod(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
	
	}

		return li;
		
	}
	
	public boolean deleteProduction(int productionId) throws SQLException, ClassNotFoundException
	{
		Connection connection=MyConfigure.getConnection();
		String delete_sql="DELETE FROM prod WHERE productionid=?";
		PreparedStatement ps=connection.prepareStatement(delete_sql);
		ps.setInt(1, productionId);
		int executeDelete = ps.executeUpdate();
		if(executeDelete == 1)
		{
			System.out.println("Production row is delete for id :"+productionId);
			
		}
		
		return false;
	}
	
	
	public List<Prod> getProdByAdress() throws SQLException, ClassNotFoundException
	{
		List<Prod> li=new ArrayList<Prod>();
		Connection connection = MyConfigure.getConnection();
		PreparedStatement ps=connection.prepareStatement("Select * from prod WHERE adress= ?");
		ps.setString(1, "Banglore");
ResultSet rs=	ps.executeQuery();
while(rs.next())
{
	li.add(new Prod(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
	
	}

		return li;
		
	}
	

}
