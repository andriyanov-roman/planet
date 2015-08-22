package planet.servlets;

import planet.services.Text;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class LocalFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        Text.setFor((HttpServletRequest) request);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

}
