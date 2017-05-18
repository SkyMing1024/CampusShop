package indi.mt.shop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import indi.mt.shop.domain.User;
import indi.mt.shop.service.UserService;

/**
 * Servlet implementation class UserEditServlet
 */
public class UserEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		User user = (User) request.getSession().getAttribute("user");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String qq = request.getParameter("qq");
		String college = request.getParameter("college");
		String grade = request.getParameter("grade");
		String area = request.getParameter("area");
		System.out.println("name:"+name);
		user.setName(name);
		user.setTel(tel);
		user.setQq(qq);
		user.setCollege(college);
		user.setGrade(grade);
		user.setArea(area);
		new UserService().updateUserInfo(user);
		
		String resp="更新成功!";
		Gson gson = new Gson();
		String json = gson.toJson(resp);
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write(json);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
