package com.ltts.Day9.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.Day9.Dao.ProdDao;
import com.ltts.Day9.model.Prod;

/**
 * Servlet implementation class insertProductions
 */
@WebServlet("/insertProductions")
public class insertProductions extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertProductions() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int productionid=Integer.parseInt(request.getParameter("productionid"));
		String productionname=request.getParameter("productionname");
		String adress=request.getParameter("adress");
		String ownername=request.getParameter("ownername");
		
		System.out.println("id: "+productionid +" name: "+productionname +" Adress : "+adress +" Owner Name: "+ownername);
	
		Prod p=new Prod(productionid,productionname,adress,ownername);
		ProdDao pd=new ProdDao();
		
		boolean b=false;
		
		try {
			pd.insertProduction(p);
		} catch (Exception e) {
			b=true;
		}finally {
			if(b==true)
			{
				System.out.println("Error due to Exception");	
			}
			else
			{
				System.out.println("Successfully Inserted");
			}
		}
		
		//	doGet(request, response);
	}

}
