package servlet_learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * A classe GenericServlet implementa varios metodos necessarios para o servlet
 * exceto o metodo service.
 * A classe GenericServlet pode responder requisicoes de protocolos diferentes
 */

public class GenericServletImpl extends GenericServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");  
		  
		PrintWriter out=res.getWriter();  
		out.print("<html><body>");  
		out.print("<b>hello generic servlet</b>");  
		out.print("</body></html>");  
		  
	}

}
