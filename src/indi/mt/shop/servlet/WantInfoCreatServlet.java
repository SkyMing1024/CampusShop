package indi.mt.shop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import indi.mt.shop.domain.User;
import indi.mt.shop.domain.WantInfo;
import indi.mt.shop.service.WantInfoService;

/**
 * Servlet implementation class WantInfoCreatServlet
 */
public class WantInfoCreatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		User session =(User) request.getSession().getAttribute("user");
		String title = "[求购]"+request.getParameter("title");
		String desc = request.getParameter("desc");
		String trade_place = request.getParameter("trade_place");
		String price = request.getParameter("price");
		String userid = session.getId();
		WantInfo wantInfo = new WantInfo(0, userid, title, desc, price, trade_place, null);
		new WantInfoService().addWantInfo(wantInfo);
		
		response.setCharacterEncoding("utf-8");
		response.sendRedirect("index.jsp");
	
	}

}
