package planet.servlets;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns={"/Registration","/Registration/*"})
public class RegistrationFilter extends BaseFilter {
	@Override
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpSession session = request.getSession();
		if (session.getAttribute("LOG_STATUS")!= null && session.getAttribute("LOG_STATUS").equals(true)) {
			if (request.getParameter("command")!=null && request.getParameter("command").equals("Log_In")) {
				session.setAttribute("BodyJsp", null);
				response.sendRedirect("/planet");
				return;
			}
			session.setAttribute("LOG_STATUS", false);
		}
		chain.doFilter(request, response);
	}

}
