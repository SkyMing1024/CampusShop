package indi.mt.shop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import indi.mt.shop.service.OrderService;
import indi.mt.shop.service.ProductListService;
import indi.mt.shop.service.UserService;

/**
 * Servlet implementation class ProductEditServlet
 */
public class ProductEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductListService productListService = new ProductListService();
		UserService userService = new UserService();
		Gson gson = new Gson();
		
		PrintWriter out = response.getWriter();
		
		
		String pid = request.getParameter("pid");
		String flag = request.getParameter("flag");
		String res = "a";
		System.out.println("pid:"+pid);
		System.out.println("flag:"+flag);
		//下架
		if(Integer.parseInt(flag) == 1){
			productListService.deleteProductByPid(pid);
			res = "aaa";
		}
		//擦亮
		if(Integer.parseInt(flag) == 2){
			productListService.refreshProduct(pid);
			userService.addPointByRefresh(pid);
			res = "aaa";
		}
		//售出
		if(Integer.parseInt(flag) == 3){
			
			productListService.sellProduct(pid);
			userService.addPointBySell(pid);
			long a = new OrderService().creadOrder(pid);
			if(a!=0){
				res = "aaa";
			}
		}
		
		
		String json = gson.toJson(res);
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		out.write(json);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
