package planet.servlets;

import planet.controler.ResponseController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by randriyanov on 09.08.15.
 */
public class MainServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        ControllersHandler handler = new ControllersHandler();
        ResponseController controller = handler.getController(action);
        RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher(controller.getResponse(resp,req));
        super.doPost(req, resp);
    }
}
