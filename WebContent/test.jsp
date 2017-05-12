<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>



<link href="css/bootstrap-table.min.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script  src="js/jquery-3.1.1.min.js"></script>



<script src="js/bootstrap.min.js"></script>

<script type="text/javascript" src="js/bootstrap-table-zh-CN.min.js"></script>
<script type="text/javascript" src="js/bootstrap-table.min.js"></script>
<script>
	$(function(){
		
		init();
		
	});
	function init(){
		$.ajax({
			type:"POST",
			url:"testServlet",
			dataType:"json",
			data:{},
			success:function(resp){
				 $('#table').bootstrapTable({
				        data: resp
				    });
			}
		});
	}
</script>
</head>
<body>
	
	<center >
	<!-- <form action="testServlet" method="post">
			<input type="submit" value="提交" />
	</form> -->
		
		<br>
	</center> 
	<br>------------
	<table  id="table" class="table table-hover table-bordered">
			<thead>
				<tr>
					<th data-field="pid">编号</th>
					<th data-field="pname">名称</th>
					<th data-field="salePrice">价格</th>
					<th data-field="buyPrice">购入价格</th>
					<th data-field=beloneto>主人</th>
					<th data-field="cid2">分类</th>
					<th data-field="creatTime">发布日期</th>
				</tr>
			</thead>
	</table>
	<br><br>-------------------------
	
	

	<%-- <form action="testServlet" method="post">
		id:<input type="text" name="pid" />
			<input type="submit" value="提交" />
	</form>
	<center >
		<table border="1" cellpadding="10">
			<c:forEach  items="${list }" var="pro">
				<tr>
					<td>${pro.pid}</td>
					<td>${pro.pname }</td>
					<td>${pro.buyPrice}</td>
					<td>${pro.salePrice}</td>
					<td>${pro.pdesc}</td>
					<td>${pro.pimage}</td>
					<td>${pro.beloneto}</td>
					<td><a href="#">编辑</a></td>
				</tr>
			</c:forEach>
		</table>
	</center> --%>
	
	
</body>
</html>