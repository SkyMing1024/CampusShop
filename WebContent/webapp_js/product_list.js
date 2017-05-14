function getUrlParam(name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
            var r = window.location.search.substr(1).match(reg);  //匹配目标参数
            if (r != null) return unescape(r[2]); 
            return null; //返回参数值
        }
var urlValCat = getUrlParam('cat');

var urlValRank = getUrlParam('rank')

var url ="productListServlet";



//alert('当前页面url参数:'+window.location)

//var url ="productListServlet?cat="+urlValCat+"&searchKey=a";
//var url ="productListServlet?cat="+urlValCat;

$(function(){
//	alert("urlValCat:"+typeof urlValCat+"\n"+"urlValRank:"+urlValRank)
//	if(urlValRank!=null||urlValCat==1){
//		initProducts();
//	}else{
//		alert("test")
//	}
	initProducts();
})
function initProducts(){
	$.ajax({
		type:"POST",
		url:url,
		dataType:"json",
		data:{"cat":urlValCat,'rank':urlValRank},
		success:function(resp){
			var list;
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
                        +' </div>'
                 +' </li>&nbsp' )
		 }
		}
	});
}




