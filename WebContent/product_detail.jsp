<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>商品详情——武科大步行街，WUSTER专属二手交易平台</title>
   
    <link media="all" href="css/product_detail.css" type="text/css" rel="stylesheet">
    <link media="all" href="css/index.css" type="text/css" rel="stylesheet">
    
    <script  src="js/jquery-3.1.1.min.js"></script>
    <script src="js/jquery.mousewheel-3.0.2.pack.js"></script>
    <script src="js/jquery.fancybox-1.3.1.js"></script>
    <script src="js/common.js"></script>
    <script src="js/hm.js"></script>
    <script src="js/detail.js"></script>
    <script src="js/add.js"></script>
    
	<script src="webapp_js/product_detail.js"></script>    
    
    <script type="text/javascript" src="js/jia.js" charset="utf-8"></script>
    <script type="text/javascript" src="js/plugin.client.js" charset="utf-8"></script>


    <link rel="icon" href="favicon.ico">
    <link rel="icon" href="favicon.ico" type="image/x-icon">

</head>

<body>
		<iframe style="position: fixed; display: none; opacity: 0;" src="index_1.html" frameborder="0"></iframe>
		<div class="jiathis_style" style="position: absolute; z-index: 1000000000; display: none; top: 50%; left: 50%; overflow: auto;"></div>
		<div class="jiathis_style" style="position: absolute; z-index: 1000000000; display: none; overflow: auto;"></div>
		<iframe style="display: none;" src="index_2.html" frameborder="0"></iframe>

    <%@ include file="../common/shop_header.jsp" %>
    <%@ include file="../common/shop_left.jsp" %>
    
    <div class="container">
        <div class="main center clearfix">
            <div class="ershou-details">
            
                <div class="ershou-photos-wr">
                		 <!-- 收藏功能
                        <a class="ershou-favorite" href="javascript:void(0);" style="background-image: url('heart.png');" onclick="favorites();">0</a> -->
                           <!-- 轮播大图-->
                            <div class="bigger-photo-box">	</div>
                </div>
                
                
                <div class="ershou-info">
                      <div class="ershou-hd">
                        <p class="ershou-title"></p>
                        
                        
                    </div>
                    <ul class="ershou-detail">
                    	<li class="ershou-place" id="pid">
                            
                        </li>
                     
                         
                    </ul>
                    
                    <div id="buy-button" >
            			<a  href="javascipt::" style="color: white" > 拍下</a>
       	 			</div>

                    	<div class="complain">
                    		<a href="javascript:void(0);" onclick="report();">•&nbsp;&nbsp;&nbsp;&nbsp;举报&nbsp;&nbsp;&nbsp;&nbsp;•</a>
                    	</div>
                </div>
            </div>
            
            <div class="ershou-desc">
                 
            </div>
            
        </div>
    </div>

         <!--    <div class="comments">
                <div class="comments-title">评论</div>
                <div class="comments-wr">
                    <div class="comment-wr">
                           <div class="post-comment clearfix">
                            <div class="comment-cover">
                                <span class="loader loader-quart"></span>
                            </div>
                            <input id="goods_id" value="185459" type="hidden">
                                    <img class="avatar" src="avatar-unlogin.png" alt="头像">
                            <div class="commenting-unlogin clearfix">
                                <div class="comment-input-wr-wr">
                                    <div class="comment-input-wr">
                                        <span class="tips">评论总要登录留个名吧</span>
                                    </div>
                                </div>
                                <button class="comment-login" data-type="l">登录</button>
                            </div>
                         </div>
                    </div>
                </div>
            </div>  -->

           
    	<%@ include file="../common/shop_right.jsp" %>
	<%@ include file="../common/shop_footer.jsp" %>
 <!-- 
    <footer>
        <img class="footer-tri" src="imgs/footer-tri.png">
        <div class="site-msg line2">
            <span class="power">©2014-2015 易橙科技 版权所有</span>
            <span>鄂ICP备14003265号-2</span>
        </div>
    </footer>
  -->
   

   
		  <div class="login-cover">
		   <div class="login-wr">
		    <div class="login-header">
		     <img class="login-logo" src="imgs/logo.png" alt="logo" />
		     <p class="site-name">武科大步行街wust</p>
		     <div class="share-buttons" style="display: none;">
		      <div id="renren-button">
		       人人网登陆
		      </div>
		      <div id="qq-button">
		       微信登陆
		      </div>
		     </div>
		    </div>
		    <div class="login-form-container">
		     <form action="http://hust.2shoujie.com/goods/185459.html">
		      <p class="login-p"><label>邮箱&nbsp;</label><input class="login-input" id="user-name" value="" type="text" /></p>
		      <p class="login-p"><label>密码&nbsp;</label><input class="login-input" id="pw" type="password" /></p>
		      <p class="ex clearfix"><label class="rem-wr" for="rem"><input id="rem" name="rem" type="checkbox" /><span>记住我</span></label><a class="forget" href="http://hust.2shoujie.com/login/forget">忘记密码</a></p>
		      <button class="submit" type="button">登录二手街</button>
		     </form>
		     <a class="reg" href="javascript:void(0);">马上注册</a>
		    </div>
		   </div>
		  </div>
		  <div class="reg-cover">
		   <div class="reg-wr">
		    <div class="reg-header">
		     <img class="login-logo" src="imgs/logo.png" alt="logo" />
		     <p class="site-name">武科大步行街</p>
		    </div>
		    <div class="reg-form-container">
		     <form action="http://hust.2shoujie.com/goods/185459.html">
		      <input class="input-class" id="uname" name="uname" placeholder="昵称" value="" type="text" />
		      <input class="input-class" id="email" name="email" placeholder="邮箱" type="email" />
		      <!--[if lte IE 9]><input class="input-class pw-text" type="text"/><![endif]-->
		      <input class="input-class pw-input" id="passw" name="passw" placeholder="密码" type="password" />
		      <!--[if lte IE 9]><input class="input-class pw-text" type="text"/><![endif]-->
		      <input class="input-class pw-input" id="cpassw" name="cpassw" placeholder="确认密码" type="password" />
		      <button type="button" class="submit">注册二手街</button>
		     </form>
		     <a class="log" href="javascript:void(0);">立即登录</a>
		    </div>
		   </div>
		  </div>



    
</body>
</html>
