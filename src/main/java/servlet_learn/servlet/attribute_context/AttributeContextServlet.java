package servlet_learn.servlet.attribute_context;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/attribute"})
public class AttributeContextServlet extends javax.servlet.http.HttpServlet{

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        ServletContext context = getServletContext();
        context.setAttribute("estudos", "servlet");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/show-attribute");
        dispatcher.forward(req, res);
    }
}
