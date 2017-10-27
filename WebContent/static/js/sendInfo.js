$(function(){
	//判断收件人不能是自己或者不存在
	$("input[name='receiver']").on("blur",function(){
		 var receiver= $("input[name='receiver']").val();
		 $.ajax({
			 type: "post",
			 url:  "MessagerecordController/findMemberinfo",
			 data: {"receiver":receiver},
			 dataType: "text",
			 success: function(data){
				 if(data=="0"){
					 alert("用户不存在");
					 $("input[name='receiver']").val("");
				 }else if (data=="1") {
					alert( "收件人不能是自己");
					 $("input[name='receiver']").val("");
				}
			 }
		 });
		
	});
	
	
});