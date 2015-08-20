package planet.controler;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by randriyanov on 09.08.15.
 */
public interface ResponseController {
    Container getResponse(HttpServletResponse response, HttpServletRequest request);
}
