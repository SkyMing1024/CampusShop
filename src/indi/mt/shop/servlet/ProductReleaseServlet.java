package indi.mt.shop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import indi.mt.shop.domain.Product;
import indi.mt.shop.domain.User;

/**
 * Servlet implementation class ProductReleaseServlet
 */
public class ProductReleaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		User user = (User) request.getSession().getAttribute("user");
		
		String pname = request.getParameter("pname");
		String pdesc = request.getParameter("pdesc");
		String buyPrice = request.getParameter("buyPrice");
		String salePrice =request.getParameter("salePrice");
		String cid2 = request.getParameter("cid2");
		Product product = new Product(null, pname, Double.parseDouble(buyPrice),
				Double.parseDouble(salePrice), pdesc, null, user.getId(), Integer.parseInt(cid2), 0, null, null, null);
		System.out.println(user);
		System.out.println(product);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
