package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Welcome")
public class Welcome extends HttpServlet {

	/*
	 * @Override protected void doPost(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException { String email =
	 * req.getParameter("email");
	 * 
	 * resp.setContentType("text/html"); PrintWriter out = resp.getWriter();
	 * 
	 * out.print("<h1>Welcome to home page....</h1>"); out.print("<h1>Email is : " +
	 * email+ "</h1>"); }
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.print("<h1>Welcome to home page....</h1>");
		out.print("<h1>Email is : " + email+ "</h1>");
	}

}
