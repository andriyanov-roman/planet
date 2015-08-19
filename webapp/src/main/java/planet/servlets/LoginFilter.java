package planet.servlets;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



//@WebFilter(urlPatterns = {"/myInfo","/mycabinet"})
@WebFilter("/login/*")
public class LoginFilter extends BaseFilter {
	@Override
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
		if(request.getRequestURI().equals("/planet/login")){
			request.getRequestDispatcher("/LoginServlet").forward(request, response);
			return;
		}
		HttpSession session = request.getSession(false);
		if(session!=null){
			if((boolean)session.getAttribute("LOG_STATUS")){
				chain.doFilter(request, response);
				return;
			}
		}
		response.sendRedirect("/planet");
	}
}
