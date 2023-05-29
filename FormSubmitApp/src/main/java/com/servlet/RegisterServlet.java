package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("user_name");
		String email = req.getParameter("user_email");
		String password = req.getParameter("user_password");
		String course = req.getParameter("user_course");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Name is : " + name +"</h1>");
		out.print("<h1>email is : " + email +"</h1>");
		out.print("<h1>password is : " + password +"</h1>");
		out.print("<h1>course is : " + course +"</h1>");
		
	}
	
}
