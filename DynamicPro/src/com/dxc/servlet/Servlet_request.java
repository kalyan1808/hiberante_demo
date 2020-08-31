package com.dxc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_request
 */
@WebServlet("/Servlet_request")
public class Servlet_request extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_request() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>home</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>Welcome to Servlet World<h2>");
		out.println("<h3>learning servlet is fun<h3>");
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
				out.println("<font colors\"red\">"+i+"</font><br>");
				
			}
			else
			{
				out.println("<font colors\"green\">"+i+"</font><br>");
			}
		}
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
