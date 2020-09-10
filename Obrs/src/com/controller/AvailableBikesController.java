package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.obrs.*;


import com.model.*;



@WebServlet("/AvailableBikesController")
public class AvailableBikesController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd;
		ArrayList<RegistrationModel> arr=null;
		arr=RegistrationModel.showAllBikes();
		if(arr==null)
		{
		out.println("<html><head><body><h1>Bikes are not available for your location</h1></body></head></html>");
		}
		else {
			out.println("<html><head><body><h1>Available bikes for your location</h1></body></head></html>");
			out.println("<html><head><body><table><tr><td>mode</td><td>Perday rent</td><td>bike colour</td></tr>");
			
		
	}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
