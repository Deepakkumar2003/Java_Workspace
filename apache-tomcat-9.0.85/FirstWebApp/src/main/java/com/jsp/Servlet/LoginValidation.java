package com.jsp.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Loginvalidate")
public class LoginValidation extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String email= req.getParameter("eamil");
		String password=req.getParameter("password");
		
		if(email.equals("jspider@gmail.com")&& password.equals("1234")) {
			
					Cookie c1=new Cookie("eamil", email);
					c1.setMaxAge(1000);
					Cookie c2=new Cookie("password", password);
					c2.setMaxAge(1000);
					
					resp.addCookie(c1);
					resp.addCookie(c2);
					
			
			RequestDispatcher rd=req.getRequestDispatcher("welcome.html");
			rd.forward(req, resp);
		}
		else
		{
			PrintWriter pout= resp.getWriter();
			pout.println("<h1> invalid credentials </h1>");
			RequestDispatcher rd=req.getRequestDispatcher("Login.html");
			rd.include(req, resp);
		}
	}

}
