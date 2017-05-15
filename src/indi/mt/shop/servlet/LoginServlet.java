package indi.mt.shop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import indi.mt.shop.domain.User;
import indi.mt.shop.service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = new User();
		UserService userService = new UserService();
		String res = null;
		PrintWriter out = response.getWriter();
		
		
		String userId = request.getParameter("uid");
		String flag = request.getParameter("flag");
		
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		//校检登陆id
		if(Integer.parseInt(flag) == 1){
			user = userService.getUserById(userId);
			if(user==null){
				res = "aa";
			}else{
				 res = "a";
			}
			
			response.setContentType("text/html;charset=utf-8");
			out.write(res);
		}
		//校检密码
		if(Integer.parseInt(flag) == 2){
			String pwd=request.getParameter("pwd");
			user = userService.getUserByIdPwd(userId, pwd);
			if(user != null){
				res = "aa";
				System.out.println("userId:"+user.getId()+"  userPwd:"+user.getPassword());
				System.out.println(res+"id:"+userId+"password:"+pwd);
			}else{
				res = "a";
				System.out.println(res+"id:"+userId+"password:"+pwd);
			}
			
			response.setContentType("text/html;charset=utf-8");
			out.write(res);
		}
		
		
		if(Integer.parseInt(flag) == 3){
			String pwd=request.getParameter("pwd");
			user = userService.getUserByIdPwd(userId, pwd);
			if(user != null){
				
				request.getSession().setAttribute("user", user);
				//request.getRequestDispatcher("index.jsp").forward(request, response);
				response.sendRedirect("index.jsp");
			}else{
				
				
//				request.setCharacterEncoding("utf-8");
//				request.setAttribute("uid", userId);
//				request.getRequestDispatcher("login.jsp").forward(request, response);
				response.sendRedirect("login.jsp");
			}
			
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
