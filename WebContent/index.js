$(function(){
	initProducts();
})

function initProducts(){
	$.ajax({
		type:"POST",
		url:"testServlet",
		dataType:"json",
		data:{},
		success:function(resp){
			var list;
			for(var i=0;i<resp.length;i++){
				if(resp[i].isHot=="1"){
					resp[i].isHot="推荐";
				}else{
					resp[i].isHot="新品";
				}
			}
			
			for(var i=0;i<resp.length;i++)
				$('.items').append(
				'<li class="item"><a href="http://hust.2shoujie.com/goods/185083.html" class="img" target="_top"><img src="imgs_products/bigjianguopro.png" alt="新车只用半年 一马电动车 48v 20A"></a>'
                    +' <div class="info">'
                        +' <div class="price">'+resp[i].salePrice+'</div>'
                        +' <div class="name"> '
                        +' <a href="http://hust.2shoujie.com/goods/185083.html" target="_top">'+resp[i].pname+'</a>'
                        +' </div>'
                        +' <div class="department"><span>未认证用户</span></div>'
                        +' <div class="place"><span>紫松学生公寓</span></div>'
                        +'<div class="school"><span>'+resp[i].isHot+'</span></div>'
                        +' </div>'
                 +' </li>&nbsp' )
                 if(resp[i].isHot=="新品"){
 					$('.school').css("background-color","#FFB300")
 				}
		}
	});
}