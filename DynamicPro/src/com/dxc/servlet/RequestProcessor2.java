package com.dxc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestProcessor2
 */
@WebServlet("/RequestProcessor2")
public class RequestProcessor2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestProcessor2() {
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
			out.println("<title>userreg</title>");
		out.println("</head>");
		out.println("<body>");
			out.println("<form action=\"RequestProcessor2\" method=\"post\">");
				out.println("Name: <input type=\"text\" name=\"name\"><br>");
				out.println("Email: <input type=\"text\" name=\"email\"><br>");
				out.println("Mobile: <input type=\"text\" name=\"mobile\"><br>");
				out.println("<input type=\"submit\" value=\"login\"><br>");
			out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String na=request.getParameter("name");
		String em=request.getParameter("email");
		String mo=request.getParameter("mobile");
		PrintWriter out=response.getWriter();
		
		out.println("Name :"+na+"<br>");
		out.println("Email :"+em+"<br>");
		out.println("MobileNumber :"+mo+"<br>");
		
		doGet(request, response);
	}

}
