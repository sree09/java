package com.rt.web.car;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registered
 */
public class Registered extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registered() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("full_name");
		String pass = request.getParameter("password");
		String userid = request.getParameter("user_name");
		//if(name.equals(" ")||pass.equals(" ")||userid.equals(" ")||name.equalsIgnoreCase(null) )
			//response.sendRedirect("Register.jsp");
		PrintWriter out = response.getWriter();
		DbConnection db = new DbConnection();
		Connection con = db.getCon();
		try {
		Statement stmt =  con.createStatement();
		int i = stmt.executeUpdate("insert into users (full_name,user_name,password)values('"+name+"','"+userid+"','"+pass+"')");
		if(i>0) {
			out.println("Registered sucessfully please login to continue");
			response.sendRedirect("Login.jsp");
		}
		else {
			out.println("Registration failed please try again");
		}
		
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}

}
