package indi.mt.shop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import indi.mt.shop.domain.User;
import indi.mt.shop.service.UserService;

public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserService userService = new UserService();
		PrintWriter out = response.getWriter();
		User user = new User();
		String res = null;
		String flag = request.getParameter("flag");
		//注册表单验证
		if(Integer.parseInt(flag) == 1){
			String uid = request.getParameter("uid");
			user = userService.getUserById(uid);
			if (user != null) {
				res = "aaa";
			}else {
				res = "a";
			}
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			out.write(res);
		}
		
		//用户注册
		if(Integer.parseInt(flag) == 2){
			String photo = "avatar"+String.valueOf((int) (Math.random()*8+1))+".png";
			String id = request.getParameter("userid");
			String pwd = request.getParameter("password");
			String qq = request.getParameter("qq");
			user.setPhoto(photo);
			user.setId(id);
			user.setPassword(pwd);
			user.setQq(qq);
			userService.regUser(user);
			request.getSession().setAttribute("user", user);
			response.sendRedirect("user_center.jsp?id="+id+"");
		}
		
		
		//response.sendRedirect("index.jsp");
		//request.setAttribute("name", "了几分动感");
		//request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
