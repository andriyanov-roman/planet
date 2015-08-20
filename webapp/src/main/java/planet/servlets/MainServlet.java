package planet.servlets;

import planet.controler.Container;
import planet.controler.ControllerFactory;
import planet.controler.ResponseController;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by randriyanov on 09.08.15.
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = (String)request.getAttribute("action");
        ControllerFactory factory = new ControllerFactory();
        ResponseController controller = factory.getController(action);
        Container container = controller.getResponse(response,request);
        request = container.getRequest();
        response = container.getResponse();
        request.getRequestDispatcher((String)request.getAttribute("adr"))
                .forward(request, response);
    }
}