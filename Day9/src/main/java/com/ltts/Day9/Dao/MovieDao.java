package com.ltts.Day9.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.ltts.Day9.config.MyConfigure;
import com.ltts.Day9.model.Movie;



public class MovieDao {
	public boolean insertMovie(Movie p) throws Exception {
		Connection c = MyConfigure.getConnection();
		Statement s = c.createStatement();
		try{
			int count = s.executeUpdate("insert into movieT values("+p.getMovieId()+", '"+p.getMovieName()+"', '"+p.getHeroName()+"', '"+p.getHeroine()+"', '"+p.getReleaseDate()+"', '"+p.getLanguage()+"', "+p.getLength()+", '"+p.getMovieType()+"', "+p.getProductionId()+")");
			System.out.println("Inserted for:"+count);
			return true;
		}catch(Exception e) {
			System.out.println(e);
			return false;
		}
		finally {
			c.close();
		}
	}
	
	
	public List<Movie> getAllMovies() throws Exception{
		List<Movie> li = new ArrayList<Movie>();
		Connection c = MyConfigure.getConnection();
		PreparedStatement ps = c.prepareStatement("Select * from movieT");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			li.add(new Movie(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),LocalDate.parse(rs.getString(5)),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getInt(9)));
		}
		c.close();
		return li;
	}
	
	
	public boolean deleteMovie(int id) throws Exception{
		Connection c = MyConfigure.getConnection();
		PreparedStatement ps = c.prepareStatement("Delete from movieT where movieid="+id);
		try{
			int count = ps.executeUpdate();
			System.out.println("Deleted at:"+count);
			return true;
		}catch(Exception e) {
			System.out.println(e);			
			return false;
		}
		finally {
			c.close();
		}
		
	}
	
	public boolean updateMovie(Movie p) throws Exception{
		Connection c = MyConfigure.getConnection();
		PreparedStatement ps = c.prepareStatement("Update movie set moviename='"+p.getMovieName()+"', heroname='"+p.getHeroName()+"', heroinename='"+p.getHeroine()+"', releasedate='"+p.getReleaseDate()+"', language='"+p.getLanguage()+"', length="+p.getLength()+", movietype='"+p.getMovieType()+"', productionid="+p.getProductionId()+" where movieid ="+p.getMovieId());
		try{
			int count = ps.executeUpdate();
			System.out.println("Updated :"+count);
			return true;
		}catch(Exception e) {
			System.out.println(e);			
			return false;
		}
		finally {
			c.close();
		}
		
	}

}
