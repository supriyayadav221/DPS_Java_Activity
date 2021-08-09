package com.ltts.Day9.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;

import com.ltts.Day9.config.MyConfigure;
import com.ltts.Day9.model.Prod;


public class ProdDao {
	public boolean insertProduction(Prod p) throws SQLException, ParseException, ClassNotFoundException
	{
		Connection connection=MyConfigure.getConnection();
		Statement s=connection.createStatement();
		try {

		s.execute("insert into prod values("+p.getProductionid() + ",' "+ p.getProductionname()+" ' ,' "+p.getAdress()+"','"+p.getOwnername()+" ') ");
		
		
			return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return true;
		}
		finally {
			connection.close();
		}		
		
	}

}
