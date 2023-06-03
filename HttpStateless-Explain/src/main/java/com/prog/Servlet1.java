package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("fn1");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter(); 
		out.print("<h1>Name is : " + name + "</h1><br>");
		out.print("<a href='Servlet2'>Servlet to check Http Stateless</a>");
	}

}
