package servlet_learn.servlet.send_redirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * O metodo sendRedirect() da interface HttpServletResponse nos permite redirecionar o usuario
 * para um destino direferente do nosso dominio, funciona do lado cliente pois usa a barra de
 * navegacao para fzr uma outra requisicao.
 */

@WebServlet(urlPatterns = "/MySearcher")
public class MySearcherServlet extends javax.servlet.http.HttpServlet{

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getParameter("name");
        resp.sendRedirect("https://www.google.co.in/search?q="+url);
    }

}
