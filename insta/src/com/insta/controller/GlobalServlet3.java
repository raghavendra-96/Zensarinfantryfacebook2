package com.insta.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insta.entity.InstaEmployee;
import com.insta.service.InstaService;
import com.insta.service.InstaServiceInterface;

/**
 * Servlet implementation class GlobalServlet3
 */
public class GlobalServlet3 extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		
		
		
		
		String option=request.getParameter("ac");
		if(option.equals("register")){
			//here name... are names of html boxes
			String name=request.getParameter("name");
			String pass=request.getParameter("pass");
			String email=request.getParameter("email");
			String address=request.getParameter("address");
			String street=request.getParameter("street");
			
	
			InstaEmployee ie=new InstaEmployee();
			
			
			ie.setName(name);
			ie.setPass(pass);
			ie.setEmail(email);
			ie.setAddress(address);
			ie.setStreet(street);
		
		InstaServiceInterface is=InstaService.createServiceObject();
		
		int i=is.createProfile(ie);
		
		
		if(i>0)
		{
		out.println("profile created");	
		}
		else{
			out.println("could not create profile");
			}
		}
	if(option.equals("login")){
		
	}
	if(option.equals("timeline")){
	
	}
		out.println("</body></html>");

		}

}
