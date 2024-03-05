package servlet_learn.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 1, urlPatterns = "/login", name = "LoginServlet")
public class LoginServlet extends javax.servlet.http.HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        RequestDispatcher rd;
        res.setContentType("text/html");
        String username = req.getParameter("userName");
        String password = req.getParameter("userPass");

        if(username.isEmpty() || password.isEmpty()) {
            PrintWriter out = res.getWriter();
            out.println("Entrada Invalida");
            rd = req.getRequestDispatcher("/index.html");
            rd.include(req, res);
        }
        else {
            rd = req.getRequestDispatcher("/welcome");
            rd.forward(req, res);
        }
    }
}
