package planet.servlets;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.junit.Test;

import planet.services.Text;

@WebFilter("/*")
public class LoginFilter extends BaseFilter {
	static final Logger log = Logger.getLogger(LoginFilter.class);
	static final String planetUri = "/planet/";
	
	@Override
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
		Text.setFor(request);
		if(request.getRequestURI().toString().equals(planetUri)){
			HttpSession session = request.getSession();
			session.setAttribute("BodyJsp", null);
		}
		if(request.getParameter("command")!=null){
			HttpSession session = request.getSession();
			switch (request.getParameter("command")) {
			case "Log_In":
				log.info("User is trying to sign in");
				session.setAttribute("LOG_STATUS", true);
				session.setAttribute("role", "admin");
				session.setAttribute("tryMore", true);
				session.setAttribute("uname", request.getParameter("name"));
				session.setAttribute("password", request.getParameter("password"));
				break;
			case "Log_Out":
				log.info("User logout");
				session.setAttribute("LOG_STATUS", false);
				if(!(session.getAttribute("BodyJsp")!=null && session.getAttribute("BodyJsp").equals("user_basket.jsp"))){
					session.setAttribute("BodyJsp", null);
				}
				break;
			case "lang":
				switch (request.getParameter("lang")) {
				case "ru":
					session.setAttribute("Text", new Text(new Locale("ru")));
					break;
				case "en":
					session.setAttribute("Text", new Text(Locale.ENGLISH));
					break;
				}
				
			}
		}
			chain.doFilter(request, response);
	}


@Test
public void test(){
}
}