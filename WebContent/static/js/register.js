$(function(){
	//验证用户名是否正确和是否已经存在
	$("input[name='nickName']").on("blur",function(){
		//2-16个任意字符 包括中文
		var patt=/^[\w\W]{2,16}$/ig;
		var nickname=$("input[name='nickName']").val();
		if(patt.test(nickname)==true && nickname!=""){
		$.ajax({
			type: "POST",
			url: "MemberinfoController/findMemberinfoByName?nickname="+nickname,
//			contentType: "application/json",
//			data:{"nickname":nickname},
			dataType: "json",
			success: function(memberinfo){
				if(memberinfo!=null){
					alert("用户名已经存在，请重新输入！");
					$("input[name='nickName']").val("");
					$("#show").html("用户已存在");
					$("#show").css("color","red");
				}else {
					$("#show").html("√");
					$("#show").css("color","green");
				}
			}
		});
		}else {
			if(nickname==""){
				
				
			}else {
				//alert("填写不正确，请重新输入");
				$("#show").html("填写错误，请重新输入");
				$("#show").css("color","red");
				$("input[name='nickName']").val("");
			}
			
		}
	});
	
	
	//验证密码是否符合要求
	$("input[name='passwd']").on("blur",function(){
		//正则表达式  6-16个任意字符 不包含中文
		var patt=/^[a-zA-Z0-9_-]{6,16}$/ig; 
		var passwd=$("input[name='passwd']").val();
		if(patt.test(passwd)==true && passwd!=""){
			$("#pw1").html("√");
			$("#pw1").css("color","green");
			
		}else {
			if(passwd==""){
				
			}else {
//				alert("填写不正确，请重新输入");
				$("#pw1").html("填写错误，请重新输入");
				$("#pw1").css("color","red");
				$("input[name='passwd']").val("");
			}
		
		}
		
	});
	
	//验证密码是否一致
	$("input[name='passwdre']").on("blur",function(){
		var passwd=$("input[name='passwd']").val();
		var passwdre=$("input[name='passwdre']").val();
		if(passwd==passwdre && passwdre!=""){
			$("#pw2").html("√");
			$("#pw2").css("color","green");
		}else {
			if(passwdre==""){
				
			}else {
//				alert("两次输入的密码不一致，请重新输入");
				$("#pw2").html("两次输入的密码不一致，请重新输入");
				$("#pw2").css("color","red");
				$("input[name='passwdre']").val("");
			}
		
		}
		
	});
	//利用正则验证邮箱是否符合要求
	$("input[name='email']").on("blur",function(){
		var patt=/^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/ig;
		var emailval=$("input[name='email']").val();
		if(patt.test(emailval) && emailval!=""){
			$("#em").html("√");
			$("#em").css("color","green");
		}else {
			if( emailval==""){
				
			}else {
				//alert("您输入的邮箱格式不正确，请重新输入！");
				$("#em").html("您输入的邮箱格式不正确，请重新输入");
				$("#em").css("color","red");
				$("input[name='email']").val("");
			}
		}
		
	});
	
	//判断密码提示问题 不能为空
	$("input[name='passwdQuestion']").on("blur",function(){
		var passwdq=$("input[name='passwdQuestion']").val();
		if(passwdq==""){
			//alert("此处不能为空，重新输入");
			$("input[name='passwdQuestion']").val("");
		}else {
			$("#pq").html("√");
			$("#pq").css("color","green");
		}
	});
	
	//利用正则验证密码提示问题答案长度不少于1位
	$("input[name='passwdAnswer']").on("blur",function(){
		var patt=/^[\w\W]{1,}$/ig;
		var passwda=$("input[name='passwdAnswer']").val();
		if(patt.test(passwda) && passwda!=""){
			$("#pa").html("√");
			$("#pq").css("color","green");
		}else {
			if(passwda==""){
				
			}else {
				//alert("密码提示问题答案少于6位，请重新输入");
				$("#pa").html("密码提示问题答案少于6位，请重新输入");
				$("#pa").css("color","red");
			}
		}
	});
	
	//判断是否有推荐人，推荐人是否存在
	$("input[name='recommender']").on("blur",function(){
		var nickname=$("input[name='recommender']").val();
		$.ajax({
			type: "POST",
			url: "MemberinfoController/findMemberinfoByName?nickname="+nickname,
			dataType: "json",
			success: function(memberinfo){
				if(memberinfo==null){
					$("input[name='recommender']").val("");
					$("#recommender").html("推荐人不存在");
					$("#recommender").css("color","red");
				}else {
					$("#recommender").html("推荐人存在");
					$("#recommender").css("color","green");
				}
			}
		});
	});
	
	
	//验证年龄是否输入正确
	$("input[name='age']").on("blur",function(){
		var age=$("input[name='age']").val();
		
		if(age>0 && age<200){
			$("#ageth").html("√");
			$("#ageth").css("color","green");
		}else {
			//alert("年龄输入错误，请重新输入");
			$("#ageth").html("年龄输入错误，请重新输入");
			$("#ageth").css("color","red");
		}
	});
	
	//验证电话号码是否符合要求
	$("input[name='phone']").on("blur",function(){
		var phone=$("input[name='phone']").val();
		var patt=/^[0-9]{11,11}$/ig;
		if(phone!="" && patt.test(phone)){
			$("#ph").html("√");
			$("#ph").css("color","green");
		}else {
			if(phone==""){
				$("#ph").html("此处可以不填");
				$("#ph").css("color","green");
			}else{
				//alert("电话号码输入错误，请重新输入");
				$("#ph").html("电话号码输入错误，请重新输入");
				$("#ph").css("color","red");
			}
			
		}
	});
	
	//填写详细信息
	$("input[name='address']").on("blur",function(){
		var address=$("input[name='address']").val();
		if(address==""){
			$("#addre").html("此处可以不填");
		}
	});
	//判断验证码是否一致
	$("input[name='authCode']").on("blur",function(){
		var authc=$("input[name='authCode']").val();
		var au=$("#randomNum").html();
	
		if(au==authc){
			
		}else {
			if(authc==""){
				
			}else {
				alert("验证码填写错误");
				$("input[name='authCode']").val("");
			}
		}
	});
	
	

});


function getCode(){
	var Number=[1,2,3,4,5,6,7,8,9,0,'a','b','c','d','e','f'];
	var code=new Array();
	for(var i=0;i<=3;i++){
		var a=Math.round(Math.random()*15);
		code[i]=Number[a];
	}
	var num=code[0]+""+code[1]+""+code[2]+""+code[3];
	document.getElementById("get").style.display="none";
	document.getElementById("randomNum").style.display="block";
	document.getElementById("randomNum").innerHTML=num;
}