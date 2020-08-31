package com.dxc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestProcessor3
 */
@WebServlet("/RequestProcessor3")
public class RequestProcessor3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestProcessor3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
			out.println("<title>Login</title>");
		out.println("</head>");
		out.println("<body>");
			out.println("<form method=\"post\">");
				out.println("Username: <input type=\"text\" name=\"Username\"><br>");
				out.println("Password: <input type=\"password\" name=\"password\"><br>");
				out.println("<input type=\"submit\" value=\"login\">");
				out.println("<input type=\"reset\" value=\"cancel\">");
			out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String un=request.getParameter("Username");
		String ps=request.getParameter("password");
		if(un.equals("kalyan") && ps.equals("laxman"))
		{
			RequestDispatcher r=request.getRequestDispatcher("Successful.html");
			r.forward(request, response);
		}
		else
		{
			response.sendRedirect("Unsuccessful.html");
			
			doGet(request, response);
		}
	}

}
