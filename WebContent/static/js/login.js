$(function(){
	//登录操作
	$("img[name='login']").on("click",function(){
		var nickname=$("input[name='username']").val();
		var passwd=$("input[name='password']").val();
		var authLogin=$("input[name='autoLogin']").prop("checked");
		if(nickname.length==0){
			alert("用户名不能为空");
			$("input[name='username']").focus();
		}else if (passwd.length==0) {
			alert("密码不能为空！");
			$("input[name='password']").focus();
		}
		else {
			$.ajax({
				type: "POST",
				url: "LoginController/loginfunc",
				data: {"nickname":nickname,"passwd":passwd,"authLogin":authLogin},
				dataType: "text",
				success: function(data){
					if(data=="success" || data=="activity"){
						window.location.href="activity";
					}else if(data=="login"){
						window.location.href="login";
					}else {
						alert("用户名/密码不正确");
						$("input[name='password']").val("");
						$("input[name='username']").focus();
					}
				}
				
			});
		}
		
	});
		
		
});
	
function check(){
	alert("您还没有登录，请先登录");
}	
	
	
	
	
	
	
	
	
	
	
	
	