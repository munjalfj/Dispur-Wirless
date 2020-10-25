package bean;

import java.sql.Timestamp;

public class Login 
{
	
	String log_username;
	String log_password;
	Timestamp log_timestamp;
	
	public String getLog_username() {
		return log_username;
	}
	public void setLog_username(String log_username) {
		this.log_username = log_username;
	}
	public String getLog_password() {
		return log_password;
	}
	public void setLog_password(String log_password) {
		this.log_password = log_password;
	}
	public Timestamp getLog_timestamp() {
		return log_timestamp;
	}
	public void setLog_timestamp(Timestamp log_timestamp) {
		this.log_timestamp = log_timestamp;
	}
}
