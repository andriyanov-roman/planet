package planet.controler;

import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by randriyanov on 09.08.15.
 */
public interface ResponseController {

    String getResponse(HttpServletResponse response, HttpServletRequest request);
}
