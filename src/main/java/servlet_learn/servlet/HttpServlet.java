package servlet_learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/http")
public class HttpServlet extends javax.servlet.http.HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out =  res.getWriter();
		out.print("<html><body><h1>HttpServlet doGet() response</h1></body></html>");
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out =  res.getWriter();
		out.print("<html><body><h1>HttpServlet doPost() response</h1></body></html>");
	}
	
}
