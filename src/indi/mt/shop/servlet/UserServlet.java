package indi.mt.shop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import indi.mt.shop.domain.Product;
import indi.mt.shop.domain.User;
import indi.mt.shop.service.ProductListService;
import indi.mt.shop.service.UserService;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String flag = request.getParameter("flag");
		String uid = request.getParameter("uid");
		Gson gson = new Gson();
		String json = null;
		
		if(Integer.parseInt(flag)==1){
			User user = new UserService().getUserById(uid);
			json = gson.toJson(user);
		}
		if(Integer.parseInt(flag) == 2){
			List<Product> list = new ProductListService().getProductsByUserId(uid);
			json = gson.toJson(list);
			
		}
		
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
