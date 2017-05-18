package indi.mt.shop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import indi.mt.shop.domain.Product;
import indi.mt.shop.service.ProductListService;

/**
 * Servlet implementation class ProductSearchServlet
 */
public class ProductSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String keyword = request.getParameter("keyword");
		List<Product> list = new ProductListService().searchProductsOnsale(keyword);
		
		Gson gson = new Gson();
		String json = gson.toJson(list);
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
