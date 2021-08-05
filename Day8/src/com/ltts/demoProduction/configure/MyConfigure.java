package com.ltts.demoProduction.configure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConfigure {
	
	
	public static Connection getConnection() throws SQLException
	{
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/dps","root","123456789");
		
		return c;
		
	}

}
