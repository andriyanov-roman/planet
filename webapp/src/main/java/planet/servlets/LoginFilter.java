package planet.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import planet.Utils;
import planet.services.Text;
import planet.services.UserValidatorService;

@WebFilter("/*")
public class LoginFilter extends BaseFilter {
	static final Logger log = Logger.getLogger(LoginFilter.class);
	UserValidatorService validator = new UserValidatorService();
	
	@Override
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
		Text.setFor(request);
		if(request.getParameter("command")!=null){
			HttpSession session = request.getSession();
			String login = request.getParameter("name");
			String password = Utils.hash(request.getParameter("password"));
			switch (request.getParameter("command")) {
			case "Log_In":
				log.info("User is trying to sign in");
				if(validator.isUserValid(login,password)) {
					session.setAttribute("LOG_STATUS", true);
					session.setAttribute("role", "admin");
					session.setAttribute("uname", request.getParameter("name"));
					session.setAttribute("password", request.getParameter("password"));
				} else{
					session.setAttribute("LOG_STATUS", false);
					session.setAttribute("error","wrong login or pass");
				}
				break;
			case "Log_Out":
				log.info("User logout");
				session.setAttribute("LOG_STATUS", false);
				if(!(session.getAttribute("BodyJsp")!=null && session.getAttribute("BodyJsp").equals("user_basket.jsp"))){
					session.setAttribute("BodyJsp", null);
				}
			}
		}
			chain.doFilter(request, response);
	}
}
