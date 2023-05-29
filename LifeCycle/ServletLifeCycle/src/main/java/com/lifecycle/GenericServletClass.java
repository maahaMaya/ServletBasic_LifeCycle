package com.lifecycle;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletClass extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("Generic Sevlet method call.....");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("Date : " + new Date().toString());
	}
	
}
