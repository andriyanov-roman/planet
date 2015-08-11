package planet.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import planet.services.UserValidatorService;
import profile.Profile;

@WebServlet(urlPatterns = "/login", name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserValidatorService validator = new UserValidatorService();
        String login = req.getParameter("name");
        String pass = req.getParameter("password");
//        boolean valid = validator.isUserValid(login, pass);
        if(true){
            Profile profile = new Profile().getUserProfile(login);
            Cookie cookie = new Cookie("uname",login);
            req.getSession().setAttribute("profile",profile);
            resp.addCookie(cookie);
            req.getRequestDispatcher("jsp/ok.jsp").forward(req, resp);
        } else {
            resp.sendRedirect("jsp/notOk.jsp");
        }

    }
}
