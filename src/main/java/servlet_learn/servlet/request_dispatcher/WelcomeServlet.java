package servlet_learn.servlet.request_dispatcher;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 1, urlPatterns = {"/welcome"}, displayName = "WelcomeServlet")
public class WelcomeServlet extends javax.servlet.http.HttpServlet {

    /**
    * Recebe o parametro name que foi recebido de um formulario e o mostra na resposta
     * */

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        Cookie[] cookies = req.getCookies();

        out.println("Welcome " + cookies[0].getValue());
    }
}
