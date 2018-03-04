package com.rt.web.car;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Car extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		DbConnection db = new DbConnection();
		Connection con = db.getCon();
		System.out.println(con);
		try {
		Statement stmt =  con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from car");
		while(rs.next()) {
			for(int i=1;i<7;i++) {
				out.println(rs.getString(i));
			}
			out.println("<br/>");
			//response.sendRedirect("Login.jsp");
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}


	}


