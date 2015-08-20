package planet.servlets;

import planet.entities.Employee;
import planet.entities.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ubn-rok on 11.08.15.
 */
public class MainServletController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        String title = "Using GET Method to Read Form Data";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>First Name</b>: "
                + req.getParameter("first_name") + "\n" +
                "  <li><b>Last Name</b>: "
                + req.getParameter("last_name") + "\n" +
                "</ul>\n" +
                "</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("first_name");
        Map<String, String> map = new HashMap<>();
        map.put("Key", "value");
        User user = new User();
        user.setName(name);
        Employee e = new Employee();
        String[] array = {"test", "testtwo","testthree"};
        e.setEname("Gena Sipakov");
        req.setAttribute("user", user);
        req.setAttribute("map", map);
        req.setAttribute("emplyee", e);
        req.setAttribute("array", array);
        RequestDispatcher view = req.getRequestDispatcher("jsp/result.jsp");
        view.forward(req, resp);
    }
}
