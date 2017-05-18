<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>商品发布表单</title>
		<script src="js/hm.js"></script>
        <script src="js/add.js"></script>
        <script src="js/release.js"></script>
        <script src="js/c.js"></script>
        <script src="js/common.js"></script>
        
        <script src="js/zh_cn.js"></script>
        <script src="js/qiniu.min.js"></script>
        <script src="js/plupload.full.min.js"></script> 
		
		
		 <script type="text/javascript" src="webapp_js/product_release.js"></script>

        <!-- <script  src="js/jquery-3.1.1.min.js"></script> -->
		<script type="text/javascript" src="js/jquery-1.5.2.min.js"></script>

        <link media="all" href="css/release_product.css" type="text/css" rel="stylesheet">
		<link media="all" href="css/index.css" type="text/css" rel="stylesheet">

<script type="text/javascript">
		 var str="${sessionScope.user.name}"
			if(!str){
				alert("请您先登录");
				window.location.href="login.jsp";
			} 
			
		 var currentShowcid2=0;
			$(document).ready(function(){
			   $("#cid").change(function(){
				   $("#cid option").each(function(i,o){
					   if($(this).attr("selected"))
					   {
						   $(".cid2").hide();
						   $(".cid2").eq(i).show();
						   currentShowcid2=i;
					   }
				   });
			   });
			   $("#cid").change();
			});
			
			/* function getSelectValue(){
				alert("1级="+$("#cid").val());
				$(".cid2").each(function(i,o){
					 if(i == currentShowcid2){
						 
						alert("2级="+$(".cid2").eq(i).val());
						cid2=$(".cid2").eq(i).val();
					 }
			   });
				alert("分类1："+cid2)
			} */
			
			function productrelease(){
				var cid2=0;
				var pname=$("#title").val(),
					pdesc=$("#desc").val(),
					buyPrice=$("#buyPrice").val(),
					salePrice=$("#salePrice").val();
				$(".cid2").each(function(i,o){
					 if(i == currentShowcid2){
						cid2=$(".cid2").eq(i).val();
					 }
			   });
				alert("分类2："+cid2+"/n"+pname+"/n"+pdesc+"/n"+buyPrice+"/n"+salePrice)
				
				$.post(
				        "productrelease",
				        {
				        	pname : pname,
				            pdesc : pdesc,
				            buyPrice : buyPrice,
				            salePrice : salePrice,
				            cid2 : cid2,
				           
				        },
				        function(res) {
				            res = $.parseJSON(res);
				            if (res.code != 0) {
				                alert(res.msg);
				                $('.form-submit').removeAttr('disabled', false);
				            } else {
				                window.location.href = res.data.goods_url;
				            }
				        }
				    );
			}
</script>		
</head>
	

<body>
	<%@ include file="common/shop_header.jsp" %>
	<div class="container">
            <div class="main center">
                <img class="release-icon-main" src="imgs/release-icon.png" alt="">
                <div class="wave-fluid"></div>
                <div class="release-title">发布商品出售</div>
                <!-- 上传图片开始 -->
                <div class="upload-wr">
                    <div class="clone-target">
                        <div class="photo">
                            <div>
                                <img src="imgs/release" alt="" class="image">
                             </div>
                            <span class="close"></span>
                        </div>
                    </div>
                    <div class="photo-area init-up">
                        <div class="upload-area" id="upload-area" style="position: relative;">
                            <div id="upload" style="z-index: 50;">
                                <span class="up-bg"></span>
                                <span class="up-img-bg">
                                    <i>
                                    </i>
                                </span>
                            </div>
                            <div id="html5_1bf7kjaid1u048gce9t1r9sk3m3_container" 
                            	class="moxie-shim moxie-shim-html5" style="position: absolute; top: 2px; left: 0px; 
                            	width: 160px; height: 160px; overflow: hidden; z-index: 49;">
                                <input id="html5_1bf7kjaid1u048gce9t1r9sk3m3" style="font-size: 999px; opacity: 0; 
                                position: absolute; top: 0px; left: 0px; width: 100%; height: 100%;" accept="image/*" 
                                capture="camera" type="file">
                                </div>
                        </div>
                        <div class="photo-caution">
                            <span>最多上传四张图片，支持jpg、png、gif格式</span></div>
                    </div>
                </div>
                <!-- 上传图片结束 -->
                <div class="form-wr">
                    <div class="form-must-wr">
                    	
                        <div class="form-item l goods-title">
                            <div class="form-key">
                                <span>商品名称</span></div>
                            <div class="form-value">
                                <div class="form-input-wr">
                                    <input id="title" name="title" placeholder="最多10个字" value="" type="text"></div>
                            </div>
                        </div>
                        
                        <div class="form-item xl goods-desc">
                            <div class="form-key">
                                <span>商品详情</span></div>
                            <div class="form-value">
                                <div class="form-input-wr">
                                    <textarea name="desc" id="desc" placeholder="建议填写物品用途、新旧程度、原价等信息，至少15个字"></textarea>
                                </div>
                            </div>
                        </div>
                        
                        
                        <div class="form-item m goods-price">
                            <div class="form-key">
                                <span>购入价格</span></div>
                            <div class="form-value">
                                <div class="form-input-wr">
                                    <input class="price" id="buyPrice" name="buyPrice" value="" type="text"></div>
                            </div>
                        </div>
                        <div class="form-item m goods-price">
                            <div class="form-key">
                                <span>售出价格</span></div>
                            <div class="form-value">
                                <div class="form-input-wr">
                                    <input class="price" id="salePrice" name="salePrice" value="" type="text"></div>
                            </div>
                        </div>
                        
                           <div class="form-item m">
                            <div class="form-key">
                                <span>分类</span>
                            </div>
                            <div class="form-value">
                                <div class="form-input-wr">
                                    <input id="cat" name="cat" value="" type="text">
                                    </div>
                            </div>
                        </div>

                        <!--选择分类信息 -->
                        <div class="form-item m goods-cat">
                            <div class="form-key">
                                <span>分类</span>
                            </div>
                             <div class="form-value">
                                <div class="form-input-wr">
    <select id="cid"> 
		<option>---大类----</option> 
		<option value="1">手机</option> 
		<option value="2">电脑</option> 
		<option value="3">影音娱乐</option>
		<option value="4">数码配件</option> 
		<option value="5">运动健身</option>
		<option value="6">衣物鞋帽</option> 
		<option value="7">生活娱乐</option> 
		<option value="8">图书教材</option> 
		<option value="9">交通出行</option> 
		<option value="10">个人技能</option> 
		<option value="11">其它</option> 	   
   </select> 
   <select class="cid2"> 
   		<option>----小类----</option> 
   </select> 
   <select class="cid2"> 
       <option value="101">手机</option> 
       <option value="102">手机配件</option> 
       
   </select>  
   <select class="cid2"> 
       <option value="201">笔记本</option> 
       <option value="202">台式机</option>
	   <option value="203">平板</option> 	   
   </select> 
   <select class="cid2"> 
        <option value="301">耳机</option>
		<option value="302">MP3</option> 
		<option value="303">游戏机</option> 
		<option value="304">键盘</option>
		<option value="305">鼠标</option> 		
   </select>
   <select class="cid2"> 
        <option value="401">硬盘</option>
		<option value="402">相机</option> 
		<option value="403">显示器</option>  		
   </select>
   <select class="cid2"> 
        <option value="501">篮球</option>
		<option value="502">足球</option> 
		<option value="503">球拍</option> 
   </select>
   <select class="cid2"> 
        <option value="601">上衣</option>
		<option value="602">裤子</option> 
		<option value="603">背包</option> 
		<option value="604">雨伞</option>
		<option value="605">鞋</option>
		<option value="606">配饰</option>
   </select>
   <select class="cid2"> 
        <option value="701">乐器</option>
		<option value="702">虚拟账号</option> 
		<option value="703">会员卡</option> 
		<option value="704">化妆品</option> 		
   </select>
   <select class="cid2"> 
        <option value="801">考研资料</option>
		<option value="802">教材</option> 
		<option value="803">课外书</option>  		
   </select>
   <select class="cid2"> 
        <option value="901">自行车</option>
		<option value="902">电动车</option> 
		<option value="903">公交卡</option>  		
   </select>
   <select class="cid2"> 
		<option value="1001">摄影</option> 
		<option value="1002">绘画</option> 		
   </select>
							   <INPUT TYPE="button" VALUE="点我" ONCLICK="getSelectValue();">
							    </div>
                            </div>
                        </div> 
                        
                        
                        
                    </div>
                    
                   
                    <button type="button" class="form-submit" onclick="productrelease();">马上发布</button>
                  </div>
            </div>
        </div>

</body>
</html>