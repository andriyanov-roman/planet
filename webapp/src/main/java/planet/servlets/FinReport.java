package planet.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by oleksii on 26.08.15.
 */
@WebServlet("FinReport")
public class FinReport extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        PrintWriter pw = response.getWriter();

        pw.println("BEG_DATE: " + request.getParameter("beg_date"));
        pw.println("END_DATE: "+request.getParameter("end_date"));

    }

}
