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
@WebServlet("/shoes")
public class Form_6 extends GenericServlet {

		@Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
			String id=req.getParameter("id");
			String brand=req.getParameter("brand");
			String  category=req.getParameter("category");
			String cost=req.getParameter("cost");
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
				PreparedStatement ps=con.prepareStatement("insert into shoes(id,brand,category,cost) values(?,?,?,?)");
				ps.setInt(1,Integer.parseInt(id));
				ps.setString(2,brand);
				ps.setString(3,category);
				ps.setDouble(4,Integer.parseInt(cost));
				ps.execute();
				System.out.println("data inserted successfully");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
			
		
		}

}
