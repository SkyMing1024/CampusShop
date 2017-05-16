package indi.mt.shop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import indi.mt.shop.service.ProductListService;

/**
 * Servlet implementation class ProductEditServlet
 */
public class ProductEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductListService productListService = new ProductListService();
		
		Gson gson = new Gson();
		
		PrintWriter out = response.getWriter();
		
		
		String pid = request.getParameter("pid");
		String flag = request.getParameter("flag");
		String code = "0";
		System.out.println("pid:"+pid);
		System.out.println("flag:"+flag);
		//下架
		if(Integer.parseInt(flag) == 1){
			productListService.deleteProductByPid(pid);
			code = "1";
		}
		
		
		
		String json = gson.toJson(code);
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		out.write(json);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
