package com.luv2code.servletdemo.mvctwo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	/**
	 * Servlet implementation class MvcDemoServletTwo
	 */
	@WebServlet("/BrokerServletDemo")
	public class BrokerServletDemo extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public BrokerServletDemo() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			// step 1: get the student data from helper class (model)
			List<Broker> buyer = BrokerDataUtil.getBroker();
			
			
			// step 2: add students to request object
			request.setAttribute("Buyers_list", buyer);
			
			// step 3: get request dispatcher
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("view_brokers.jsp");		
			
			// step 4: now forward to JSP
			dispatcher.forward(request, response);
		}
		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}	
		
		
		
}