package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.login.dao.SignupDao;


public class Signup extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname= request.getParameter("uname");
		System.out.print(uname);
		String pass= request.getParameter("pass");
		SignupDao dao= new SignupDao();
		
		
		
		response.sendRedirect("login.jsp");
		
	}

}
