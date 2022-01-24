package com.janadri.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/addAlien")
public class MyServlet extends HttpServlet{

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		
	String aname = request.getParameter("aname");
	int aid = Integer.parseInt(request.getParameter("aid"));
		out.println("Hey!! Welcome " + aname);
	}
}
