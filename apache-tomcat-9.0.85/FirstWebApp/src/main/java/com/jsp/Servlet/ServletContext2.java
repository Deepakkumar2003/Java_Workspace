package com.jsp.Servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/config")
public class ServletContext2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context= getServletContext();
		String url=context.getInitParameter("mysqldburl");
		String username=context.getInitParameter("username");
		
		System.out.println(url);
		System.out.println(username);
	}

	
}
	