package com.jsp.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/printdata")
public class Form_5 extends GenericServlet {
	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		
		String name=req.getParameter("name");
		
		
		PrintWriter pout=res.getWriter();
		
		pout.println("<h1> 	Welcome " + name+"</h1>");
		
			
		
	}
	}

