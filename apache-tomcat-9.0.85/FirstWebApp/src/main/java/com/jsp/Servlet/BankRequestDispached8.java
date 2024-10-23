package com.jsp.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/bank")
public class BankRequestDispached8 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		if(email.equals("deepakkumar843301@gmail.com") && password.equals("12345")){
		
			RequestDispatcher rd=req.getRequestDispatcher("Form8Bank.html");
			rd.forward(req, res);
		}
		else { 
			PrintWriter pout =res.getWriter();
			pout.println( "<h2>Welcome To Bank</h2>\r\n"
					+ "<hi>invalid credentials </h1>" );
			
			RequestDispatcher rd=req.getRequestDispatcher("Form8Bank.html");
			rd.forward(req, res);
		
	res.setContentType("text/html");
	}
		
	}
}

