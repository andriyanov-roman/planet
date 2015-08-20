package planet.controler;

import planet.entity.User;
import profile.Profile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by randriyanov on 09.08.15.
 */
public class LoginController implements ResponseController {
    @Override
    public Container getResponse(HttpServletResponse response, HttpServletRequest request) {
        User user = new User();
        String login = (String) request.getAttribute("name");
        String password = (String) request.getAttribute("password");
        user.setLogin(login);
        user.setPassword(password);
        Profile profile = new Profile().getUserProfile(login);
        request.setAttribute("profile", profile);
        request.setAttribute("user", user);
        request.setAttribute("adr", "jsp/profile.jsp");
        return new Container(request,response);
    }
}
