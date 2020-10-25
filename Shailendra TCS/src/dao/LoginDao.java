package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Login;
import database.DatabaseConnection;

public class LoginDao 
{
	public static boolean check(Login l)
	{
		try
		{
			System.out.println(l.getLog_password()+" "+l.getLog_username());
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select log_password from login where log_username = ? ");
			ps.setString(1, l.getLog_username());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) 
			{
				if(rs.getString(1).equals(l.getLog_password()))
				{
					PreparedStatement ps1 = con.prepareStatement("update login set log_timestamp = ? where log_username = ?");
					ps1.setTimestamp(1, l.getLog_timestamp());
					ps1.setString(2, l.getLog_username());
					int status = ps1.executeUpdate();
					if(status == 1)
					{
						return true;
					}
				}
			}
		} 
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
		return false;
	}
}
