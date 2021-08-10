package com.ltts.Day9.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.Day9.Dao.ProdDao;

/**
 * Servlet implementation class deleteProduction
 */
@WebServlet("/deleteProduction")
public class deleteProduction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteProduction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int productionid=Integer.parseInt(request.getParameter("productionid"));
		
		ProdDao pd=new ProdDao();
	
		try {
			pd.deleteProduction(productionid);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			RequestDispatcher requestDispatcher=null;
			System.out.println("Production with id "+productionid+" deleted successfully");
			requestDispatcher=request.getRequestDispatcher("viewProduction.jsp");
			requestDispatcher.forward(request, response);
		}
	//	doGet(request, response);
	}

}
