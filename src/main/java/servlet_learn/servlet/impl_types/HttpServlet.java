package servlet_learn.servlet.impl_types;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* HttpServlet eh a implementacao de Servlet usada especificamente pra responder requisicoes HTTP
* Possui os metodos doPost(), doGet(), doPut() e varios outros metodos para diferentes tipos de
* metodos HTTP
*/

@WebServlet(loadOnStartup = 1, displayName = "HttpServlet", urlPatterns = {"/http"})
public class HttpServlet extends javax.servlet.http.HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) {
		System.out.println("Servlet HTTP inicializado");
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out =  res.getWriter();
		res.setContentType("text/html");
		out.print("<html><body><h1>HttpServlet doGet() response</h1></body></html>");
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out =  res.getWriter();
		res.setStatus(201);
		out.print("<html><body><h1>HttpServlet doPost() response</h1></body></html>");
	}
	
}
