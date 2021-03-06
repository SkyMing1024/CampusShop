package indi.mt.shop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import indi.mt.shop.daoimpl.ProductWithUserInfoDaoImpl;
import indi.mt.shop.domain.Product;
import indi.mt.shop.domain.ProductWithUserInfo;
import indi.mt.shop.service.ProductListService;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductListService ps = new ProductListService();
		String pid = request.getParameter("pid");
		System.out.println(pid);
		ProductWithUserInfo p = ps.getProductWithUserInfoById(Integer.parseInt(pid));
		ps.addReadTimes(pid);
		
		Gson gson = new Gson();
		String json = gson.toJson(p);
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write(json);
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
