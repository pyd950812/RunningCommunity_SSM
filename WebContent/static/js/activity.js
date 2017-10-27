//$(function(){
//  $(".nickn").on("click",function(){
//	  var nick=$(".nickn").html();
//	  alert(nick);
//	  $.ajax({
//		  type: "post",
//		  url: "LookSpaceController/lookSpace",
//		  data: {"nickName":nick},
//		  dataType: "text",
//		  success: function(data) {
//			if(data==1){
//				alert("该用户没有个性空间！");
//				return false;
//			}else if(data==2){
//				window.location.href="member/space?nickName="+nick;
//			}else if(data==3){
//				window.location.href="member/space";
//			}
//		}
//	  });
//  });
//	
//});	
  function look(x){
		var i=x;
		var nickname=document.getElementById("nickn"+i).innerHTML;

		var ajax=new XMLHttpRequest();
		ajax.open("get","LookSpaceController/lookSpace?nickName="+nickname, true);
		ajax.onreadystatechange=function(){
			if(ajax.readyState==4 && ajax.status==200){
				var data=ajax.responseText;
				if(data==1){
					alert("该用户没有个性空间！");
					return false;
				}else if(data==2){
					//查看自己的空间
				
					window.location.href="LoginController/otherspace?nickName="+nickname;
				}else if(data==3){
					//查看别人的空间
				
					window.location.href="LoginController/otherspace?nickName="+nickname;
				}
			}
		};
		ajax.send(); 
		}
 $(function(){
	 timestamp=0;
	 isonline();
 });
 function isonline() {
	
		$.ajax({
			type: "post",
			url: "OnLineController/isonline",
			dataType: "text",
			success: function(data){
				 $("#online").html(data);
			}
			
		});	
		
		setTimeout("isonline()",200000);
	}