package com.rt.web.login;

import java.sql.*;

public class Validate
 {
     public static boolean checkUser(String user,String pass) 
     {
      boolean st =false;
      try{

    	  Class.forName("com.mysql.jdbc.Driver");
    	  Connection con=DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/userdb","root","root");
    	  if (con.isClosed()) {
    		  System.out.println("System is closed");
    	  }
         PreparedStatement ps =con.prepareStatement
                             ("select * from user where username=? and passwords=?");
         ps.setString(1, user);
         ps.setString(2, pass);
         ResultSet rs =ps.executeQuery();
         if(rs.next()) {
        	 st = true;
         }
        // st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }   
}
