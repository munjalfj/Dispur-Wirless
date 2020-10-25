package service;

import bean.Login;
import dao.LoginDao;

public class LoginServiceImplementation implements LoginService
{

	@Override
	public boolean check(Login l) 
	{
		return LoginDao.check(l);
	}
}
