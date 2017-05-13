package indi.mt.shop.test;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import indi.mt.shop.daoimpl.ProductDaoImpl;
import indi.mt.shop.domain.Product;

/**
 * Servlet implementation class NewProServlet
 */
public class NewProServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> list = null;
		try {
			list=new ProductDaoImpl().getProductsNew();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("new list："+list);
		Gson gson = new Gson();
		String json = gson.toJson(list);
		System.out.println("new json："+json);
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write(json);
		/*
		 * 此法可以修改定义响应内容，比如返回json数据
		 * response.setCharacterEncoding("utf-8");
		 *	response.setContentType("application/json;charset=utf-8");
		 *	response.getWriter().write("json串");
		 */
//		request.setAttribute("list", list);
//		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
