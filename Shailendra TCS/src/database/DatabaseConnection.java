package database;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import java.sql.Connection;
//import com.mysql.jdbc.Connection;

public class DatabaseConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		getConnection();
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{

		String driverName = "com.mysql.jdbc.Driver";
		Class.forName(driverName); // load the class that is coming from .jar file
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dispur_casestudy", "root", "");

		if (con == null) {
			System.out.println("Db not connected......");
		} else {
			System.out.println("Db Connected.....");
//			PreparedStatement stmt=con.prepareStatement("select * from login");  
//			ResultSet rs=stmt.executeQuery();  
//			while(rs.next()){  
//			System.out.println(rs.getString(1)+" "+rs.getString(2));  
//			}  
		}
		return con;
	}
}

