$(function(){
	initProductWithUserInfo();
	
	$("#buy-button").click(function(){
		alert("kasd:"+proInfo.pid);
	})
	
})

var proInfo;
var urlValPid;
var url;

function getUrlParam(name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
            var r = window.location.search.substr(1).match(reg);  //匹配目标参数
            if (r != null) return unescape(r[2]); 
            return null; //返回参数值
        }
urlValPid = getUrlParam('pid');

url="productServlet";
function initProductWithUserInfo(){
	
	$.ajax({
		type:"POST",
		url:url,
		dataType:"json",
		data:{"pid":urlValPid},
		success:function(resp){
			
			proInfo = resp;
			
			$(".bigger-photo-box").html(' <a class="bigger-photo hide show" rel="img_group" href="#">' +
					' <img class="bigger" src=" '+resp.pimage+'"  alt=" '+resp.pname+' "></a> '
			);
			$("p[class='ershou-title']").html(resp.pname).after('<div class=" discount">  '+
               	' <span class="buy-price">原价：'+resp.buyPrice+'</span><span class="ershou-price">步行街价：'+resp.salePrice+'</span> '+
                ' </div>').after('<p class="bro-counts">浏览了<span>'+resp.readTimes+'</span>次</p>');
			$("#pid").append('<div class="name"><span>商品编号</span></div><div class="value"><span id="pid">'+resp.pid+'</span></div>'
			).after(
					'<li class="ershou-time"><div class="name"><span>发布时间</span></div>'+
					'<div class="value"><span class="real-time"id="creat_time">'+resp.creatTime+'</span></div></li>'
					
			).after(
					' <li class="ershou-tel"><div class="name"><span>联系方式</span></div> '+
					' <div class="value">手机：<span class="user-num"id="user_tel">'+resp.tel+'</span>'+
					' &nbsp;&nbsp;QQ:<span class="user-num"id="user_qq">'+resp.qq+'</span></div></li>'
			).after(

					'<li class="ershou-place"><div class="name"><span>交易地点</span></div> '+
                    '<div class="value">'+resp.area+'</div></li> '		
			).after(
					'<li class="ershou-cert"><div class="name"><span>学院</span></div> '+
                    ' <div class="value"><span id="user_college">'+resp.college+'</span>'+
                    ' <span id="user_grade"></span></div></li>'
			).after(
					'<li class="ershou-seller"> <div class="name"><span>卖家</span></div> '+
                    ' <a href="#" target="_top"><div class="value"> '+
                    ' <span class="value-name" id="userid">'+resp.name+'</span></div></a></li>'		
			)
			
			$("div[class='ershou-desc']").append(
					'<div class="desc clearfix"><a href="http://hust.2shoujie.com/profile/107281"target="_top"> '+
					'<img id="user_ph"src="imgs/'+resp.photo+'"></a><p id="user_cmt">'+resp.pdesc+'</p></div>'
			
			)
			
			
			
			
			
			
			
			//$("div[class='discount']").html('<span class="buy-price">原价：'+resp.buyPrice+'</span><span class="ershou-price">步行街价：'+resp.salePrice+'</span> ')
			
		}
	});
	
	
	
	
}