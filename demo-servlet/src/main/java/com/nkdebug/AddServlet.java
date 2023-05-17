package com.nkdebug;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

	/*
	 * public void doPost(HttpServletRequest request, HttpServletResponse response)
	 * throws IOException { int n1 = Integer.parseInt(request.getParameter("n1"));
	 * int n2 = Integer.parseInt(request.getParameter("n2"));
	 * 
	 * int sum = n1+n2;
	 * 
	 * PrintWriter p = response.getWriter(); p.println("result is " + sum);
	 * 
	 * // System.out.println("result is " + sum);
	 * 
	 * }
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		
		int sum = n1+n2;
		
		
		
		
	//	Cookie cookie = new Cookie("sum", sum + "");
	//	response.addCookie(cookie);
	//	response.sendRedirect("as");
		
		//HttpSession session = request.getSession();
	//	session.setAttribute("sum", sum);
		
		
		// URL rewriting
	//	response.sendRedirect("as?sum="+sum); // URL rewriting
		
		
	//	request.setAttribute("sum", sum);
		
		// redirect to another servlet
		
	//	RequestDispatcher rd = request.getRequestDispatcher("as");
	//	rd.forward(request, response);
		
		
		ServletConfig s = getServletConfig();
		String sr = s.getInitParameter("name");
		// sr
		
	}
}
