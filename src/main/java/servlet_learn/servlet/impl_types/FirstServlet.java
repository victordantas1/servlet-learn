package servlet_learn.servlet.impl_types;

import java.io.*;
import javax.servlet.*;

public class FirstServlet implements Servlet {
	ServletConfig config = null;

	public void init(ServletConfig config) { // Metodo de inicializacao do Servlet
		this.config = config;
		System.out.println("servlet is initialized");
	}

	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException { // Metodo que responde as requisicoes

		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>hello simple servlet</b>");
		out.print("</body></html>");

	}

	public void destroy() { // Metodo de destruicao do Servlet
		System.out.println("servlet is destroyed");
	}

	public ServletConfig getServletConfig() { // Metodo que retorna a configuracao do Servlet
		return config;
	}

	public String getServletInfo() { // Metodo que retorna informacoes sobre o servlet
		return "copyright 2007-1010";
	}

}
