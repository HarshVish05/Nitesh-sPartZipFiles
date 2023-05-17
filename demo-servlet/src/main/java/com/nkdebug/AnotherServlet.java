package com.nkdebug;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class AnotherServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
	/*	
		PrintWriter p = response.getWriter();
		int sum = (int)request.getAttribute("sum");
		 p.println("Welcome from Second Servlet");
		 p.println("result is " + sum);
		*/
	//	System.out.println("result is " + sum);
		
		
		// int sum = Integer.parseInt(request.getParameter("sum"));
		//HttpSession session = request.getSession();
	//	int sum = (int) session.getAttribute("sum");
		
		int sum = 0;
		Cookie cookies[] = request.getCookies();
		for(Cookie c: cookies) {
			if(c.getName().equals("sum")) {
				sum = Integer.parseInt(c.getValue());
			}
		}
		
		PrintWriter p = response.getWriter();
		p.println("<html><body bgcolor='pink'>");
		p.println("result is " + sum);
		p.println("</body></html>");
		
		
	}
}
