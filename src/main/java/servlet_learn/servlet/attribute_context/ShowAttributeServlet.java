package servlet_learn.servlet.attribute_context;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/show-attribute"})
public class ShowAttributeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        Cookie[] cookies = req.getCookies(); // Pega os cookies armazenados no cache do cliente
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        String estudo = (String) context.getAttribute("estudos");
        out.println(cookies[0].getValue() + " esta estudando " + estudo);
    }
}
