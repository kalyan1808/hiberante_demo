package com.dxc.jdbcservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JdbcServlet
 */
@WebServlet("/JdbcServlet")
public class JdbcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JdbcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String dri="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/queries";
		String un="root";
		String pw="root";
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try
		{
			Class.forName(dri);
			con=DriverManager.getConnection(url, un, pw);
			stmt=con.createStatement();
			String sql="SELECT * FROM user";
			rs=stmt.executeQuery(sql);
			out.println("<table>");
			out.println("<tr>");
			out.println("<th>Username</th>");
			out.println("<th>Password</th>");
			out.println("</tr>");
			while(rs.next())
			{
				out.println("<tr>");
				out.println("<td>"+rs.getString(1)+"</td>");
				out.println("<td>"+rs.getString(2)+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			rs.close();
			stmt.close();
			con.close();
		}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		out.close();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
