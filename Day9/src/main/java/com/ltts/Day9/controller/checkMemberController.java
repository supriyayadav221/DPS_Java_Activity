package com.ltts.Day9.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ltts.Day9.Dao.MemberDao;
import com.ltts.Day9.config.MyConfigure;
import com.ltts.Day9.model.Member;
import com.ltts.Day9.model.Prod;

/**
 * Servlet implementation class checkMemberController
 */
@WebServlet("/checkMemberController")
public class checkMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkMemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=	request.getParameter("email");
		String pass=request.getParameter("pass");
		MemberDao md=new MemberDao();
		HttpSession sess =request.getSession();
		
		
		
		boolean b=false;
	try {
		 b=md.checkMemberByEmail(user, pass);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		
		e.printStackTrace();
	}
	finally {
		RequestDispatcher rd=null;
			if(b==false)
			{
				rd=request.getRequestDispatcher("error.html");
				rd.forward(request, response);
			}
			else
			{
				
				sess.setAttribute("email",user);
				rd=request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			}
		}

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		
		
		//doGet(request, response);
	}

}
