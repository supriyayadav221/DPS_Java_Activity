package com.ltts.Day9.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.Day9.Dao.MemberDao;
import com.ltts.Day9.model.Member;

/**
 * Servlet implementation class insertMemberController
 */
@WebServlet("/insertMemberController")
public class insertMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertMemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String name=request.getParameter("mname");
	String email=request.getParameter("email");
	String mobile=request.getParameter("mobile");
	String location=request.getParameter("country");
	if(name==null || email ==null )
	{
		
	}
	Member m=new Member(name,email,mobile,location);
	MemberDao md=new MemberDao();
	boolean b=false;
	
	
	
	try {
		md.insertMember(m);
	} catch (Exception e) {
		b=true;
	}finally {
		
		RequestDispatcher requestDispatcher=null;
		
		if(b==true)
		{
			
			System.out.println("Error due to Exception");	
			requestDispatcher=request.getRequestDispatcher("error.html");
			requestDispatcher.forward(request, response);
			
		}
		else
		{
			
				
				System.out.println("Successfully Inserted");
				requestDispatcher=request.getRequestDispatcher("newSuccess.html");
				requestDispatcher.forward(request, response);	
	
			}
			
		}
	}
	
	
	
		
	}


