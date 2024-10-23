package com.jsp.Servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/fetchcookies")
public class FetchCookies extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	{
	Cookie[] cookies =req.getCookies();
	for(Cookie c : cookies) {
		System.out.println(c.getName()+" : "+c.getValue());
	}

}
}
