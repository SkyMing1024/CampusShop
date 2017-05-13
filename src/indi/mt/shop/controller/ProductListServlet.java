package indi.mt.shop.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import indi.mt.shop.domain.Product;
import indi.mt.shop.service.ProductService;

/**
 * Servlet implementation class ProductListServlet
 */
public class ProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> list = new ArrayList<>();
		
		String urlValCat = request.getParameter("cat");
		String urlValRank = request.getParameter("rank");
		System.out.println(urlValCat);
		System.out.println(urlValRank);
		
		if ((urlValCat!=""&&!urlValCat.equals("")&&!"null".equals(urlValCat)||(urlValRank == ""&&urlValRank.equals("")&&"null".equals(urlValRank)))) {
			int cid=Integer.parseInt(urlValCat);
			if(cid == 0){
				list = new ProductService().getProductsAllOnsale();
			}else {
				list = 	new ProductService().getProductListByCat(cid);
			}
		}
		if ((urlValCat==""&&urlValCat.equals("")&&"null".equals(urlValCat)||(urlValRank != ""&&!urlValRank.equals("")&&!"null".equals(urlValRank)))) {
			
			list = new ProductService().getProductsListOrder(urlValRank);
		}
		
		
		Gson gson = new Gson();
		String json = gson.toJson(list);
		System.out.println(list);
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write(json);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
