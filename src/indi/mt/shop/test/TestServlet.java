package indi.mt.shop.test;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			List<TestProduct> list = null;
			try {
				list=new TestDao().geTestProduct();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("list："+list);
			Gson gson = new Gson();
			String json = gson.toJson(list);
			System.out.println("json："+json);
			
			response.setCharacterEncoding("utf-8");
			response.setContentType("application/json;charset=utf-8");
			response.getWriter().write(json);
			/*
			 * 此法可以修改定义响应内容，比如返回json数据
			 * response.setCharacterEncoding("utf-8");
			 *	response.setContentType("application/json;charset=utf-8");
			 *	response.getWriter().write("json串");
			 */
//			request.setAttribute("list", list);
//			request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		doGet(request, response);
	}

}
