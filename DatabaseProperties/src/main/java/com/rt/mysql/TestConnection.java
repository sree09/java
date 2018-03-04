package com.rt.mysql;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Connection;

public class TestConnection {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 FileInputStream file=new FileInputStream("DatabaseProperties/src/main/resources/db.properties"); 
	     Properties prop=new Properties (); 
	     prop.load (file); 
	     String driverClass = prop.getProperty("mysql.driver");
	     String url = prop.getProperty("mysql.url");
	     String user = prop.getProperty("mysql.username");
	     String pass = prop.getProperty("mysql.password");
	     Class.forName(driverClass);
	     java.sql.Connection con = null;
	 	 con = DriverManager.getConnection(url, user, pass);
	 	if (con != null) {
			System.out.println("connection created successfully using properties file");
		}

		else {
			System.out.println(" unable to create connection");
		}
	 	 
	     
	}

}
