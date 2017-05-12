<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
        <title>求购专区 - 华中科技大学 - 校园二手街</title>

        <meta name="keywords" content="求购,校园二手街">
        <meta name="description" content="校园二手街发布求购">

        <link rel="icon" href="favicon.ico">
        <link rel="icon" href="favicon.ico" type="image/x-icon">

        <script src="js/hm.js"></script>
         <script src="js/detail.js"></script>
        <script src="js/add.js"></script>
        <script src="js/jquery-3.1.1.min.js"></script>
        <script src="js/jquery.mousewheel-3.0.2.pack.js"></script>
        <script src="js/jquery.fancybox-1.3.1.js"></script>
        <script src="js/common.js"></script>
        <link media="all" href="css/want_list.css" type="text/css" rel="stylesheet"></head>
		<link media="all" href="css/index.css" type="text/css" rel="stylesheet"></head> 
		
        <script>(function() {
                if (!
                /*@cc_on!@*/
                0) return;
                var e = "abbr,article,aside,audio,canvas,datalist,details,dialog,eventsource,figure,footer,header,hgroup,mark,menu,meter,nav,output,progress,section,time,video".split(','),
                i = e.length;
                while (i--) {
                    document.createElement(e[i])
                }
            })()</script>
        
    
    <body>
        <%@ include file="common/shop_header.jsp" %>
		<%@ include file="common/shop_left.jsp" %> 
        
        <div class="container">
            <div class="main center clearfix">
                <div class="want-title"></div>
                <div class="wrap-want-list">
                    <div class="want-no hide">
                        <div class="want-no-logo"></div>
                        <div class="wrap-no-btn">
                            <a href="http://hust.2shoujie.com/want/release">发布求购</a></div>
                    </div>
                    <ul class="want-list" id="want-list">
                        <li class="want-item">
                            <div class="want-li clearfix">
                                <div class="left">
                                    <a href="http://hust.2shoujie.com/profile/107577">
                                        <img src="imgs/avatar1.png" alt="头像"></a>
                                </div>
                                <div class="right">
                                    <h4 class="want-name">[求购]
                                        <span>dddd</span></h4>
                                    <p class="want-detail">ddddd</p>
                                    <p class="want-attr">
                                        <span>期望价格</span>
                                        <span class="want-price">¥55</span>
                                        <span>交易地点：</span>
                                        <span class="want-add">sss</span>
                                        <span>2017-05-02 11:12:47</span></p>
                                    <p class="want-contact">
                                        <a href="http://hust.2shoujie.com/profile/107577" class="want-person">shirley1111</a>
                                        <span class="want-cont">
                                            <span class="want-tel">
                                                <span class="mr10">手机：15707972222</span>
                                                <span>QQ：134224455</span>
                                            </span>
                                        </span>
                                    </p>
                                    
                                </div>
                            </div>
                        </li>
                        
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