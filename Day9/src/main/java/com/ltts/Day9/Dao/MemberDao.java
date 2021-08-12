package com.ltts.Day9.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.Day9.config.MyConfigure;
import com.ltts.Day9.model.Member;

public class MemberDao {
	public boolean insertMember(Member m) throws Exception{
		Connection c = MyConfigure.getConnection();
		Statement s = c.createStatement();
		try{
			int count = s.executeUpdate("insert into member values('"+m.getName()+"', '"+m.getEmail()+"', '"+m.getMobile()+"', '"+m.getLocation()+"')");
			System.out.println("Rows affected:"+count);
			return true;
		}catch(Exception e) {
			System.out.println(e);
			return false;
		}
		finally {
			c.close();
		}
	}
	
	public List<Member> getAllMember() throws SQLException, ClassNotFoundException
	{
		List<Member> li=new ArrayList<Member>();
		Connection connection = MyConfigure.getConnection();
		PreparedStatement ps=connection.prepareStatement("Select * from member");
ResultSet rs=	ps.executeQuery();
while(rs.next())
{
	li.add(new Member(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
	
	}

		return li;
		
	}
	
	public boolean checkMemberByEmail(String email,String pass) throws ClassNotFoundException, SQLException
	{
		boolean b=false;
		List<Member> li=getAllMember();
		for(Member m:li)
		{
			if(email.equals(m.getEmail())&&pass.equals(m.getMobile()))
			{
				b=true;
				
				break;
				
			}
		}
		return b;
	}
	
	
	}


