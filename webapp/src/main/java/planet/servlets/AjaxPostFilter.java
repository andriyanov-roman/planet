package planet.servlets;


import java.io.IOException;
import java.util.Arrays;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

@WebFilter("/post")
public class AjaxPostFilter  extends BaseFilter{
	static final Logger log = Logger.getLogger(AjaxPostFilter.class);

	@Override
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if(request.getParameter("command")!=null){
			HttpSession session = request.getSession();
			switch (request.getParameter("command")) {
			case "AjaxPost_Log_In":
				log.info("User is trying to sign in");
				session.setAttribute("LOG_STATUS", true);
				session.setAttribute("role", "admin");
				session.setAttribute("uname", request.getParameter("name"));
				session.setAttribute("password", request.getParameter("password"));
				request.getRequestDispatcher("tiles/login_form.jsp").forward(request, response);
				return;
			case "AjaxPost_Log_Out":
				log.info("User logout");
				String[] unAvailableUrl = {"MyCabinet","administration"};
				Arrays.asList(unAvailableUrl).forEach(url->{if (request.getParameter("uri").toString().contains(url)){response.addHeader("body_cleaner","true");}});
				session.setAttribute("LOG_STATUS", false);
				request.getRequestDispatcher("tiles/login_form.jsp").forward(request, response);
				return;
			case "AjaxPost_Body_cleaner":
				session.setAttribute("BodyJsp", "default_body.jsp");
				request.getRequestDispatcher("tiles/default_body.jsp").forward(request, response);
				return;
			case "AjaxPost_My_Cabinet":
				session.setAttribute("BodyJsp", "perscab_body.jsp");
				request.getRequestDispatcher("tiles/perscab_body.jsp").forward(request, response);
				return;
			case "AjaxPost_Basket":
				session.setAttribute("BodyJsp", "user_basket.jsp");
				request.getRequestDispatcher("tiles/user_basket.jsp").forward(request, response);
				return;
			case "AjaxPost_Basket_add":
				if (session.getAttribute("Basket")==null) {
					Basket basket = new Basket();
					basket.getBasket().add(new BasketItem(Long.parseLong(request.getParameter("item")),Double.parseDouble(request.getParameter("cost"))));
					session.setAttribute("Basket", basket);
				}else{
					Basket basket = (Basket)session.getAttribute("Basket");
					basket.getBasket().add(new BasketItem(Long.parseLong(request.getParameter("item")),Double.parseDouble(request.getParameter("cost"))));
					session.setAttribute("Basket", basket);
				};
				session.setAttribute("BodyJsp", "user_basket.jsp");
				request.getRequestDispatcher("tiles/user_basket.jsp").forward(request, response);
				return;
			case "AjaxPost_Basket_delete":
				Basket basket = (Basket)session.getAttribute("Basket");
				Long deleteItem = Long.parseLong(request.getParameter("good_id"));
				BasketItem basketItem = null;
				for(BasketItem item:basket.getBasket()){
					if(item.getId().equals(deleteItem)){
						basketItem = item;
					}
				}
				basket.getBasket().remove(basketItem);
				session.setAttribute("Basket", basket);
		}
	}
		chain.doFilter(request, response);
	}
}