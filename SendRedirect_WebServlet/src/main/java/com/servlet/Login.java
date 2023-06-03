package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userEmail = req.getParameter("email");
		String userPassword = req.getParameter("password");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		RequestDispatcher rd;

		if (userEmail.equals("sourav@gmail.com") && userPassword.equals("12345")) {
			// home page redirect
			//rd = req.getRequestDispatcher("/Welcome");
			//rd.forward(req, resp);
			resp.sendRedirect(" Welcome");
			
		} else {
			// redirect to login page
			out.print("<h4>Inavlid Email id and password......</h4>");
			rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
	}

}
