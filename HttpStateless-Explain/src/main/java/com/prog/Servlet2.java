package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("fn1");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter(); 
		out.print("<h1>Name is : " + name + "</h1><br>");
	}

	/*
	 * we access value in Servlet1 but not in the Servlet2 This shows that Http does
	 * not store value...............So we us the session tracking concepts
	 */
}
