package com.rt.web.car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import java.sql.*;
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		PrintWriter out = response.getWriter();
		DbConnection db = new DbConnection();
		Connection con = db.getCon();
		HttpSession session = request.getSession();
		System.out.println(con);
		try {
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from users where user_name = '"+name+"'");
		if(rs.next()){
			out.println("Login Sucessfully");
			response.sendRedirect("success.jsp");
		}
		else
			out.println("Incorrect username or password");
			out.println("If you are new here click here to register");
			
		} catch (SQLException ex) {
			//Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
			ex.printStackTrace();
		}
		
	}

}
