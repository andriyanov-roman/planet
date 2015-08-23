package planet.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public enum MainOperation {
	MyCabinet {
		@Override
		public void Controller(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doRequestDispatcher(request, response, "perscab_body.jsp");
		}
	},Registration {
		@Override
		public void Controller(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doRequestDispatcher(request, response, "regpage_body.jsp");
		}
	},basket {
		@Override
		public void Controller(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			doRequestDispatcher(request, response, "user_basket.jsp");
			
		}
	};
	protected void doRequestDispatcher(HttpServletRequest request, HttpServletResponse response,String jsp) throws ServletException, IOException{
		HttpSession session = request.getSession();
		session.setAttribute("BodyJsp", jsp);
		request.getRequestDispatcher("/main.jsp").forward(request, response);
	}
	public abstract void Controller(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
