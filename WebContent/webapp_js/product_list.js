function getUrlParam(name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
            var r = window.location.search.substr(1).match(reg);  //匹配目标参数
            if (r != null) return unescape(r[2]); 
            return null; //返回参数值
        }
var urlValCat = getUrlParam('cat');

var urlSearchKeyword = $("#keyword").val();

var url ="productListServlet";

//var url ="productListServlet?cat="+urlValCat+"&searchKey=a";
//var url ="productListServlet?cat="+urlValCat;



$(function(){
	initProducts();
	
})

function initProducts(){
	$.ajax({
		type:"POST",
		url:url,
		dataType:"json",
		data:{"cat":urlValCat,searchKeyword:urlSearchKeyword},
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
				'<li class="item"><a href="product_detail.jsp?pid='+resp[i].pid+'" class="img" target="_top"><img id="pro_img" src="'+resp[i].pimage+'" alt="'+resp[i].pdesc+'"></a>'
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




