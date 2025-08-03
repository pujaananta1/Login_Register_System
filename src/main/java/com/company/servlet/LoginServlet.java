package com.company.servlet;

import java.io.IOException;

import com.company.dao.UserDao;
import com.company.dao.UserDaoImp1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {


    private static  UserDao userDao=new UserDaoImp1();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("login.jsp");}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
    	
	       String username = request.getParameter("username");
	        String password = request.getParameter("password");

	        if (userDao.isValidUser(username, password)) {
	            HttpSession session = request.getSession();
	            session.setAttribute("username", username);
	            System.out.println("Redirecting to welcome.jsp");
	            response.sendRedirect("welcome.jsp");
	        } else {
	            response.sendRedirect("login.jsp?error=1");
	        
	        }
}

      
}	
	
	
	


