package planet.servlets;

import planet.dao.FinReportDaoImpl;
import planet.entity.FinReport;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by oleksii on 26.08.15.
 */
@WebServlet(name = "SellReport", urlPatterns = "/sellReport")
public class SellReport extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        pw.println("Hi world");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        PrintWriter pw = response.getWriter();
        pw.println("BEG_DATE: " + request.getParameter("beg_date"));
        pw.println("END_DATE: "+request.getParameter("end_date"));

        FinReportDaoImpl dao = new FinReportDaoImpl();
        List<FinReport> fr = dao.select();

        request.setAttribute("fr", fr);

        getServletConfig().getServletContext().getRequestDispatcher("/jsp/finance.jsp").forward(request,response);
    }

}
