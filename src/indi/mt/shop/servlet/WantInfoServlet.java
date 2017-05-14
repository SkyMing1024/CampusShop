package indi.mt.shop.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import indi.mt.shop.domain.WantInfoWithUserInfo;
import indi.mt.shop.service.WantInfoService;

/**
 * Servlet implementation class WantInfoServlet
 */
public class WantInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<WantInfoWithUserInfo> list = new ArrayList<>();
		
		list = new WantInfoService().getWantInfoWithUserInfoList();
		
		Gson gson = new Gson();
		String json = gson.toJson(list);
		System.out.println("wantinfo:"+list);
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write(json);
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
