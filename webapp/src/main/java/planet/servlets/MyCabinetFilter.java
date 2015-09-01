package planet.servlets;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns={"/MyCabinet"})
public class MyCabinetFilter extends BaseFilter {
	@Override
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpSession session = request.getSession();
		if (session.getAttribute("LOG_STATUS")!= null && session.getAttribute("LOG_STATUS").equals(true)) {
			chain.doFilter(request, response);
			return;
		}
		session.setAttribute("BodyJsp", "default_body.jsp");
		response.sendRedirect("/planet");
	}

}
