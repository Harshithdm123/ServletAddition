package com.har;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/add")
public class Addservlets extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
//		HttpSession session=req.getSession();
//		req.setAttribute("k",k);
//		
//		k=k*k;
		
		//by cookie method
		Cookie cookie=new Cookie("k",k+"");
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
		// cokiee method end;
		
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req, res);
//		res.sendRedirect("sq?k="+ k);
//		
//		PrintWriter out=res.getWriter();
//		out.println("<html><body bgcolor='cyon' >");
//		out.println("Result is:"+ k);
//		out.println("</body></html>");
		
	}
	
	
	
//public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		
//		
//		int i=Integer.parseInt(req.getParameter("num1"));
//		int j=Integer.parseInt(req.getParameter("num2"));
//		
//		int k=i+j;
//		PrintWriter out=res.getWriter();
//		out.println("Result is:"+ k);
//		
//		
//	}
	
	
	
}