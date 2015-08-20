package planet.controler;

import planet.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 * Created by randriyanov on 09.08.15.
 */
public class LoginController implements ResponseController {
    @Override
    public String getResponse(HttpServletResponse response, HttpServletRequest request) {
        User user = new User();
        String login = (String) request.getAttribute("login");
        String password = (String) request.getAttribute("password");
        user.setLogin(login);
        user.setPassword(password);
        request.setAttribute("user", user);
        return "jsp/profile.jsp";

    }
}
