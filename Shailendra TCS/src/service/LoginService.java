package service;

import java.sql.SQLException;

import bean.Login;

public interface LoginService 
{
	public boolean check(Login l);
}