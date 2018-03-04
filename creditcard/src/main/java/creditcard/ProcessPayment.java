package creditcard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProcessPayment {
	public static boolean processPay(int number,float amount){
		boolean st =false;
		try{

			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/cars","root","root");
			if (con.isClosed()) {
				System.out.println("System is closed");
			}
			PreparedStatement ps =con.prepareStatement
					("select * from user where number=?");
			ps.setInt(1, number);
			ResultSet rs =ps.executeQuery();
			if(rs.next()) {
				st = true;
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return st;                 
	}   
}
