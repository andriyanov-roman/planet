package planet.servlets;

import planet.entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {

//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        ProductDaoImpl productDao = new ProductDaoImpl();
//        //Need method that return Product instance from DB by id
//        int id = Integer.parseInt(request.getParameter("id"));
//        Product product = productDao.select(id);
//        request.setAttribute("product", product);
//        request.getRequestDispatcher("jsp/product.jsp").forward(request, response);
//    }
}
