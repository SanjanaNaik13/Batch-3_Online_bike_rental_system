package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.obrs.RegistrationDAO;
import com.model.RegistrationModel;


@WebServlet("/registerController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   int n=1;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;
		String email_id=request.getParameter("email");
		String name=request.getParameter("name");
		
		String password=request.getParameter("password");
		String p1=request.getParameter("npassword");
		String ph_no=request.getParameter("mobile");
		String s_quest=request.getParameter("ssq");
		String s_ans=request.getParameter("ssa");
		String dl_no=request.getParameter("dlicno");
		String location=request.getParameter("location");
		
		if (password.equals(p1))
		{
			RegistrationModel r1=new RegistrationModel(name, email_id,location, password,ph_no, s_quest, s_ans,dl_no);
		
			if(RegistrationDAO.register(r1)==true)
			{
			rd=request.getRequestDispatcher("bike_login.html");
			rd.forward(request, response);
			}
		}else
			{
				request.setAttribute("errormsg", "Password mismatch, Please enter the correct password");
				rd=request.getRequestDispatcher("bike_registration.html");
				rd.forward(request, response);
			}
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
