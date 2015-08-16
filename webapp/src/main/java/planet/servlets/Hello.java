package planet.servlets;

import planet.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by randriyanov on 11.08.15.
 */
public class Hello extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Set response content type
        resp.setContentType("text/html");
        User user = new User();
        user.setPassword("gdhdhd");
        // Actual logic goes here.
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + req.getParameter("name") + "</h1>");
        out.println("<h1>" + req.getParameter("password") + "</h1>");
    }
}
