package com.lifecycle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletClass implements Servlet{
	
	ServletConfig servletConfig;
	
	// Life cycle method
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method call");
		
		servletConfig = config;
		
		System.out.println(getServletConfig());
		System.out.println(getServletInfo());
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service method call");
		
		  res.setContentType("text/html"); 
		  PrintWriter out = res.getWriter();
		  out.println("Welcome to Servlet <br/>"); 
		  out.println("Today is " + new Date().toString());
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method call");
	}
	
	
	// Non - Life cycle method
	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig method call");
		//return null;
		return servletConfig;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo method call");
		//return null;
		return "My First Servlet Program";
	}

}
