<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
        <title>求购专区 - 武科大步行街,WUSTER专属二手交易平台</title>

        <link rel="icon" href="favicon.ico">
        <link rel="icon" href="favicon.ico" type="image/x-icon">

        <script src="js/hm.js"></script>
         <script src="js/detail.js"></script>
        <script src="js/add.js"></script>
        <script src="js/jquery-3.1.1.min.js"></script>
        <script src="js/jquery.mousewheel-3.0.2.pack.js"></script>
        <script src="js/jquery.fancybox-1.3.1.js"></script>
        <script src="js/common.js"></script>
        <script type="text/javascript" src="webapp_js/want_list.js"></script>
        
        <link media="all" href="css/want_list.css" type="text/css" rel="stylesheet"></head>
		<link media="all" href="css/index.css" type="text/css" rel="stylesheet"></head> 
		
    
    <body>
        <%@ include file="common/shop_header.jsp" %>
		<%@ include file="common/shop_left.jsp" %> 
        
        <div class="container">
            <div class="main center clearfix">
                <div class="want-title"></div>
                <div class="wrap-want-list">
                    <ul class="want-list" id="want-list">
                        
                        
                        <li class="want-item">
                            <div class="want-li clearfix">
                                <div class="left">
                                    <a href="http://hust.2shoujie.com/profile/96872">
                                        <img src="imgs/avatar2.png" alt="头像"></a>
                                </div>
                                <div class="right">
                                    <h4 class="want-name">[求购]
                                        <span>iPhone6</span></h4>
                                    <p class="want-detail">收一台iPhone6 或者是 6plus</p>
                                    <p class="want-attr">
                                        <span>期望价格</span>
                                        <span class="want-price">¥1500</span>
                                        <span>交易地点：</span>
                                        <span class="want-add">韵苑</span>
                                        <span>2017-02-28 23:58:15</span></p>
                                    <p class="want-contact">
                                        <a href="http://hust.2shoujie.com/profile/96872" class="want-person">太尊</a>
                                        <span class="want-cont">
                                            <span class="want-tel">
                                                <span class="mr10">手机：15072139998</span>
                                                <span>QQ：363784838</span></span>
                                        </span>
                                    </p>
                                    
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        
        <%@ include file="common/shop_right.jsp" %>
		<%@ include file="common/shop_footer.jsp" %>
       
    </body>

</html>