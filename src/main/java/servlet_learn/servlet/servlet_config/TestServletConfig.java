package servlet_learn.servlet.servlet_config;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Um objeto de ServletConfig é criado pelo contêiner da web para cada servlet. Este objeto
 * pode ser usado para obter informações de configuração do arquivo web.xml.
 */


@WebServlet(urlPatterns = {"/servlet-config"}, initParams = {@WebInitParam(name = "driver", value = "org.postgresql")})
public class TestServletConfig extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String driver = getServletConfig().getInitParameter("driver");
        PrintWriter out = resp.getWriter();
        out.println("O driver do banco de dados eh: " + driver);
        out.close();
    }
}
