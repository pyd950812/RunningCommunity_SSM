<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
    	String path=request.getContextPath();
        String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
    %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath %>"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="keywords" content="杰普软件(www.briup.com)" />
<meta name="description" content="杰普软件(www.briup.com)" />
<title>杰普——跑步社区</title>
<link rel="stylesheet" type="text/css" id="css" href="static/style/main.css" />
<link rel="stylesheet" type="text/css" id="css" href="static/style/style1.css" />
<link rel="stylesheet" type="text/css" id="css" href="static/style/style.css" />
<style type="text/css">
<!--
table{border-spacing:1px; border:1px solid #A2C0DA;}
td, th{padding:2px 5px;border-collapse:collapse;text-align:left; font-weight:normal;}
thead tr th{height:50px;background:#B0D1FC;border:1px solid white;}
thead tr th.line1{background:#D3E5FD;}
thead tr th.line4{background:#C6C6C6;}
tbody tr td{height:35px;background:#CBE2FB;border:1px solid white; vertical-align:middle;}
tbody tr td.line4{background:#D5D6D8;}
tbody tr th{height:35px;background: #DFEDFF;border:1px solid white; vertical-align:middle;}
tfoot tr td{height:35px;background:#FFFFFF;border:1px solid white; vertical-align:middle;}
-->
</style>
<script src="static/JQuery/jquery-1.8.3.min.js" type="text/javascript"></script>
		<script type="text/javascript" src="static/js/common.js" ></script>
		<script type="text/javascript">
			function delMessage(){
				cCount = getCheckedCount("ID");
				if (cCount == 0){
					alert("请至少一条信息!");
					return;
				}
				if (confirm("确定删除吗？")==false){
					return false;
				}
				document.forms.inboxForm.action="<%=basePath%>messenger/delReceiveMessage.action";
				document.forms.inboxForm.submit();	
			}	
			function detailMessage(){
				cCount = getCheckedCount("ID");
				if (cCount == 0){
					alert("请选择一条信息!");
					return;
				}
				if (cCount > 1){
					alert("对不起，一次只能查看一条信息!");
					return;
				}
				document.forms.inboxForm.action="<%=basePath%>messenger/detailMessage.action";
				document.forms.inboxForm.submit();		
			}
		</script>
</head>
<body>
<div id="btm">
<div id="main">

  <div id="header">
    <div id="top"></div>
    <div id="logo">
      <h1>跑步社区</h1></div>
	  <div id="logout">
	<a href="RemoveSessionController/removeSession">注  销</a> | 收  藏
	 </div>
    <div id="mainnav">
      <ul>
      <li><a href="activity">首页</a></li>
      <li><a href="../other/musicrun.html">音乐跑不停</a></li>
      <li><a href="../other/equip.html">跑步装备库</a></li>
      <li><a href="../other/guide.html">专业跑步指南</a></li>
      <li><a href="../other/bbs.html">跑步论坛</a></li>
	
      </ul>
      <span></span>
    </div>
   </div>
   
  <div id="tabs1">
  <ul>
    <li><a href="LoginController/sendInfo" title="写纸条"><span>写纸条</span></a></li>
    <li><a href="LoginController/inbox" title="收件箱"><span><b>收件箱</b></span></a></li>
    <li><a href="LoginController/outbox" title="发件箱"><span>发件箱</span></a></li>
  </ul>
</div>
<br /><br />

  <div id="content" align="center"> 
     <div id="center">
	 <br /><br />
		<form  method="post" name="inboxForm" >
			<table width="600" align="center" cellpadding="0" cellspacing="0">
				<thead>
					<tr>
						<td width="70%"><h4>收件箱</h4></td>
						<td>
							<span onclick="javascript:detailMessage();" style="cursor: pointer;">
								<img src="static/images/icon06.gif" height="14" />&nbsp;查看</span>
							<span onclick="javascript:delMessage();" style="cursor: pointer;">
								<img src="static/images/delete.gif" height="14"/>&nbsp;删除</span>
						</td>
					</tr>
				</thead>
			
				<tr>
					
					<td width="100%" colspan="2">
						<table width="100%">
							<thead>
								<tr>
									<th width="10%">
										<b>选择</b>
									</th>
									<th width="20%">
										<b>主题</b>
									</th>
									<th width="20%"> 
										<b>发信人</b>
									</th>
									<th width="30%">
										<b>发送时间</b>
									</th>
									<th width="20%">
										<b>状态</b>
									</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${receiverList }" var="messagerecord" >
								<tr>
									<td width="10%">
										<input type="checkbox" name="ID" value="219" />
									</td>
									<td width="20%">
										<a href="MessagerecordController/lookMessage?id=${messagerecord.id }">${messagerecord.title}</a>
									</td>
									<td width="20%">${messagerecord.sender }</td>
									<td width="30%">
										${messagerecord.senddate }
									</td>
									<td>
										<c:if test="${messagerecord.status ==1 }">
										<img src="static/images/icon10.gif" />
										</c:if>
										<c:if test="${messagerecord.status ==0 }">
										<img src="static/images/icon09.gif" />
										</c:if>
									</td>
								</tr>
								</c:forEach>
							</tbody>
							
							<tfoot>
							<tr>
								<td align="right" width="30%" colspan="5">
								选择：<a href="javascript:void(0)" onclick="javascript:selAllCheckbox('ID');">全部</a>-
						  			  <a href="javascript:void(0)" onclick="javascript:unselAllCheckbox('ID');">不选</a>-
						 			  <a href="javascript:void(0)" onclick="javascript:reAllCheckbox('ID');">反选</a>
				               </td>
							</tr>
							<tr>
								<td colspan="5">
									<img src="static/images/icon09.gif" />未读短信
									<img src="static/images/icon10.gif" />已读短信
								</td>
								
							</tr>
							</tfoot>
						</table>
						
					</td>
					
				</tr>
				
			</table>
		</form>
	        <br /><br />
        <div id="hots">
          <h2>我的地盘</h2>
          <ul>
          <li>
           <div>
            <img src="static/images/a.gif" />
            <a href="LoginController/modify">基本信息</a>
            <p>可修改自己的基本信息</p>
           </div>
          </li>
          <li>
           <div>
            <img src="static/images/b.gif" />
            <a href="LoginController/inbox">我的信箱</a>
            <p>写信息、收件箱、发件箱</p>
           </div>
          </li>
          <li>
           <div>
            <img src="static/images/c.gif" />
            <a href="buddyList.html">我的好友</a>
            <p>好友管理及黑名单</p>
           </div>
          </li>
          <li>
           <div>
            <img src="static/images/d.gif" />
            <a href="MemberspaceController/memberspace?nickname=${memberinfo.nickName}">个性空间</a>
            <p>创建自己的个性空间</p>
           </div>
          </li>
          </ul>
        </div> 
         
     </div>
     <div id="right">
       <h2>&nbsp;</h2>
      <ul><li></li>
      </ul>
     </div>
     <div class="clear"></div>
    
     
  </div>
  
  <div id="footer">
    <div id="copyright">
       <div id="copy">
       <p>CopyRight&copy;2013</p>
       <p>跑步社区(www.irun.com) </p>
        </div>
    </div>
    <div id="bgbottom"></div>
  </div>
  
</div>
</div>
</body>
</html>