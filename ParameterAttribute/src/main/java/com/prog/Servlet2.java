package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int firstNum = Integer.parseInt(req.getParameter("fn1"));
		int secondNum = Integer.parseInt(req.getParameter("fn2"));
		
		int sum = (int)req.getAttribute("sumOfTwo");
		int mul = firstNum * secondNum;
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter(); 
		out.print("<h1>Sum="+sum+", multiplication = " + mul+"</h1>");
	}

}
