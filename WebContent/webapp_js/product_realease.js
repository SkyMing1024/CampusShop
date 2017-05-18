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
			function getSelectValue(){
				alert("1级="+$("#cid").val());
				$(".cid2").each(function(i,o){
					 if(i == currentShowcid2){
						alert("2级="+$(".cid2").eq(i).val());
					 }
			   });
			}