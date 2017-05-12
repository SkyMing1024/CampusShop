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
			
			for(var i=0;i<resp.length;i++){
				$('.items').append(
				'<li class="item"><a href="product_detail.jsp" class="img" target="_top"><img id="pro_img" src="'+resp[i].pimage+'" alt="'+resp[i].pdesc+'"></a>'
                    +' <div class="info">'
                        +' <div class="price">'+resp[i].salePrice+'</div>'
                        +' <div class="name"> '
                        +' <a href="product_detail.jsp" target="_top">'+resp[i].pname+'</a>'
                        +' </div>'
                        +' <div class="department"><span>原价：'+resp[i].buyPrice+'</span></div>'
                        +' <div class="place"><span>上架时间：'+resp[i].creatTime+'</span></div>'
                        +'<div class="school"><span>'+resp[i].isHot+'</span></div>'
                        +' </div>'
                 +' </li>&nbsp' )
                 if(resp[i].isHot=="推荐"){
 					$('.school').css("background-color","#FFB300")
 				}
				
				
		 }
		}
	});
}