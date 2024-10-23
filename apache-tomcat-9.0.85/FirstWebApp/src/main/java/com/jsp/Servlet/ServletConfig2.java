package com.jsp.Servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletConfig2 extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) {
		ServletConfig config= getServletConfig();
		String url= config.getInitParameter("url");
		System.out.println(url);
				
	}

}
