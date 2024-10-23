package com.jsp.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//@WebServlet("/h1")
//@WebServlet("/h2")
//@WebServlet("/h3")
@WebServlet("/h4")


public class Form_4 extends GenericServlet{

	public static void main(String[] args) {
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=res.getWriter();
		//pw.append("<h2> Hello Sir</h2>");
		System.out.println("executed");

		
	}

}
