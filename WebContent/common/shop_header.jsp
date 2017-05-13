<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


</head>
<body>
	<header class="ease2">
	    <a href="http://localhost:8050/CampusShop/">
	        <img class="logo ease2" src="imgs/index_logo.png" alt="武科大步行街">
	    </a>
	    <div class="header-main center ease2">
	        <a href="http://localhost:8050/CampusShop/" class="slogan">
	            <h1 class="s-main"></h1>
	            <div class="s-submain"></div>
	            <img src="imgs/2shoujie_web_title.png" alt="wuster专属校园二手物品交易平台">
	        </a>
	        <div class="search-box-wr ease2">
	            <form class="search-box center" action="productListServlet" method="get">
	                <button type="submit" class="search-submit"><a color: rgb(255,255,255) href="${pageContext.request.contextPath}/product_list.jsp">搜索</a></button>
	                <div class="input-wr">
	                    <img class="search-icon" src="imgs/search-icon.png">
	                    <div class="search-input">
	                    <input name="keyword" id="keyword" x-webkit-speech="" placeholder="搜索你想要的商品" value="" type="text">
	                    </div>
	                </div>
	            </form>

	            <div class="search-hots center ease2">
	                <span>热门：</span>
	                <a class="hots" href="${pageContext.request.contextPath}/product_list.jsp?cat=101" target="_top">手机</a>
	                <a class="hots" href="${pageContext.request.contextPath}/product_list.jsp?cat=201" target="_top">笔记本</a>
	                <a class="hots" href="${pageContext.request.contextPath}/product_list.jsp?cat=701" target="_top">乐器</a>
	                <a class="hots" href="${pageContext.request.contextPath}/product_list.jsp?cat=8" target="_top">图书</a>
	            </div>
	        </div>

	        <div class="log-reg ease2">
	            <div class="button" data-type="l">登录</div>
	            <div class="button" data-type="r">注册</div>
	        </div>
	    </div>
	</header>
</body>
</html>