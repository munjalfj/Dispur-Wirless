package controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.LoginServiceImplementation;
import bean.Login;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet 
{
	private static final long serialVersionUID = 102831973239L;
       
    public LoginController() 
    {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		session.invalidate();
		response.sendRedirect("logincheck.jsp");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String log_username = request.getParameter("username");
		String log_password = request.getParameter("password");
		Date date = new Date();
		Timestamp log_timestamp = new Timestamp(date.getTime());
		
		//int check=Integer.parseInt(request.getParameter("role_id"));
		//System.out.println(check);
		int check=1;
		if(check==1)
		{
			Login l = new Login();
			l.setLog_username(log_username);
			l.setLog_password(log_password);
			l.setLog_timestamp(log_timestamp);
			
			LoginServiceImplementation service = new LoginServiceImplementation();
			boolean status = service.check(l); 
			
			if(status)
			{
				HttpSession session = request.getSession();
				session.setAttribute("login", true);
				session.setAttribute("username", l.getLog_username());
				session.setAttribute("timestamp", l.getLog_timestamp());
				response.sendRedirect("index.jsp");
			}
			else
			{
				HttpSession session = request.getSession();
				session.invalidate();
				request.setAttribute("loginError", "Invalid Credentials !!");
				RequestDispatcher rd=request.getRequestDispatcher("logincheck.jsp");  
		        rd.forward(request, response); 
			}
		}
		
	}

}
