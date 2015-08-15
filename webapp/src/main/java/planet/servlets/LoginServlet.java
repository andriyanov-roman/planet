package planet.servlets;

import org.apache.log4j.Logger;
import planet.services.UserValidatorService;
import profile.Profile;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login", name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    static final Logger log = Logger.getLogger(LoginServlet.class); //C:\\Log4jPlanetLog.log

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        log.info("User is trying to sign in");
        UserValidatorService validator = new UserValidatorService();
        String login = req.getParameter("name");
        String pass = req.getParameter("password");
//        boolean valid = validator.isUserValid(login, pass);
        if(true){
            Profile profile = new Profile().getUserProfile(login);
            Cookie cookie = new Cookie("uname",login);
            req.setAttribute("profile", profile);
            resp.addCookie(cookie);
            req.getRequestDispatcher("jsp/profile.jsp").forward(req, resp);
        } else {
            resp.sendRedirect("jsp/notOk.jsp");
        }

    }
}
