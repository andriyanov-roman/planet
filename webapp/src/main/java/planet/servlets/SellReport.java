package planet.servlets;

import planet.dao.FinReportDaoImpl;
import planet.entity.FinReport;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by oleksii on 26.08.15.
 */
@WebServlet(name = "SellReport", urlPatterns = "/sellReport")
public class SellReport extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        pw.println("Please return to the previous page and try again");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date begDate = format.parse(request.getParameter("beg_date"));
            Date endDate = format.parse(request.getParameter("end_date"));
            FinReportDaoImpl dao = new FinReportDaoImpl();


            java.sql.Date sqlBegDate = new java.sql.Date(begDate.getTime());
            java.sql.Date sqlEndDate = new java.sql.Date(endDate.getTime());
            List<FinReport> fr = dao.select(sqlBegDate, sqlEndDate);

            request.setAttribute("FinReportList", fr);

            PrintWriter pw = response.getWriter();
            getServletConfig().getServletContext().getRequestDispatcher("/jsp/finance.jsp").forward(request,response);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
