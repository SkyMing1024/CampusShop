function getUrlParam(name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
            var r = window.location.search.substr(1).match(reg);  //匹配目标参数
            if (r != null) return unescape(r[2]); 
            return null; //返回参数值
        }
var userid = getUrlParam('id');


$(document).ready(function(){

	inituser(userid);
	
	inituserpros(userid);
})

function inituser(id){
	$.ajax({
		type:"POST",
		url:"userServlet",
		dataType:"json",
		data:{"uid":id,"flag":1},
		success:function(resp){
		var name = resp.name;
		var tel = resp.tel;
		var qq = resp.qq;
		
		var myinfo=$('<div id="account_info"><h2>账户信息</h2><ul class="infos"><li>账号</li> '
		+'<li class="right_info">'+id+'</li></ul></div><div id="base_info"><h2>基本信息<span id="edit_info">编辑</span> '
		+'<span id="save_info">保存</span></h2><ul class="infos"><li>昵称</li><li class="right_info"> '
		+'<span id="nickname_span">'+name+'</span><input value="'+name+'" id="nickname"type="text"></li></ul> '
		+'<ul class="infos"><li>手机</li><li class="right_info"><span id="phone_span">'+tel+'</span> '
		+'<input value="'+tel+'" id="phone"type="text"></li></ul><ul class="infos"><li>QQ</li><li class="right_info"> '
		+'<span id="qq_span">'+qq+'</span><input value="'+qq+'" id="qq"type="text"></li></ul></div> ')

		$("#user_big_name").html('<p>'+name+'</p>');
		$("#my_info").append(myinfo);
		}
	});

}

function inituserpros(uid){
	$.ajax({
		type:"POST",
		url:"userServlet",
		dataType:"json",
		data:{"uid":uid,"flag":2},
		success:function(resp){
		
		for(var i = 0;i<resp.length;i++){

			var mypro1 = $('<div class="enshr_each" id="prolist">  ' +
					'<div class="enshr_info"><h2><a href="product_detail.jsp?pid='+resp[i].pid+'" '+
					'title="坚果pro">'+resp[i].pname+'</a></h2><p>'+resp[i].pdesc+'</p>'+
					'<div class="enshr_state"><span class="enshrine_it" onclick="sold();">确认售出</span>'+
					'<span class="enshrine_it make_edition" onclick="off_shelf();">下架</span>'+
					'<span class="enshrine_it make_edition" onclick="refresh();">擦亮</span>'+
	                '<a href="#" target="_top"><span class="enshrine_it  make_edition">编辑</span></a> '+
	                '</div></div><a href="product_detail.jsp?pid='+resp[i].pid+'">'+
	                '<img class="enshr_ph" src="'+resp[i].pimage+'" alt="'+resp[i].pname+'"></a></div>')
			$("#onsale_pro").append(mypro1);
		}
		
		
		}
	});
}

function offshelf(pid){
    if (!confirm('下架后商品别人将看不到，请是否确认下架？')) {
        return;
    }
    $.post('productedit', 
    		{"pid" : pid,"flag":1},
    		function(res){
    			res = $.parseJSON(res);
		        if (res.code != 0) {
		        	//失败
		        	alert("res:"+res)
		        	alert(res.code)
		            alert("下架失败");
		        } else {
		        	alert(res.code)
		            location.reload();
		        }
    });
}

