package com.jsp.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookiesDemo extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		Cookie cookie1=new Cookie("id", "1");
		cookie1.setMaxAge(1000);
		
		Cookie cookie2=new Cookie("email", "deepakkumar@gmail.com");
		cookie2.setMaxAge(2000);
		
		Cookie cookie3=new Cookie("ipassword", "12345");
		cookie3.setMaxAge(3000);
		
		resp.addCookie(cookie1);
		resp.addCookie(cookie2);
		resp.addCookie(cookie3);
		
		PrintWriter pw=resp.getWriter();
		pw.println("<h1>Cookies saved successfuly</h1>");
		
	}

}
