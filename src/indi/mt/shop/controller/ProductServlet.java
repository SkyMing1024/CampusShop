package indi.mt.shop.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import indi.mt.shop.daoimpl.ProductWithUserInfoDaoImpl;
import indi.mt.shop.domain.Product;
import indi.mt.shop.domain.ProductWithUserInfo;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pid = request.getParameter("pid");
		System.out.println(pid);
		ProductWithUserInfo p = new ProductWithUserInfoDaoImpl().getProductWithUserInfo(Integer.parseInt(pid)); 
		
		Gson gson = new Gson();
		String json = gson.toJson(p);
		System.out.println("productServlet:"+p);
		System.out.println("pdesc:"+p.getPdesc());
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write(json);
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
