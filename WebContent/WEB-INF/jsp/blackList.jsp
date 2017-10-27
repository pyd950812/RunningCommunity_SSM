<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
    	String path=request.getContextPath();
        String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath %>"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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
<script type="text/javascript" src="../../js/common.js" ></script>
<script type="text/javascript">
			
		function addFriend(){
			document.forms.blackListForm.action="<%=basePath%>messenger/memberList.jsp";
			document.forms.blackListForm.submit();		
		}
		function delBuddy(){
			cCount = getCheckedCount("nickName");
			if (cCount == 0){
				alert("请至少一条信息!");
				return;
			}
			if (confirm("确定删除吗？")==false){
				return false;
			}
			document.forms.blackListForm.action="<%=basePath%>messenger/deleteBuddy.action";
			document.forms.blackListForm.submit();		
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
    <li><a href="LoginController/matchFriend" title="好友速配"><span><b>好友速配</b></span></a></li>
    <li><a href="LoginController/boddyList" title="好友名单"><span>好友名单</span></a></li>
    <li><a href="LoginController/blackList" title="黑名单"><span>黑名单</span></a></li>
  </ul>
</div>
<br /><br />

  <div id="content" align="center"> 
     <div id="center">
	 <BR /><BR />
		<form  method="post" name="blackListForm" >
			<table width="600" align="center" cellpadding="0" cellspacing="0">
				<thead>
					<tr>
						<td width="70%"><h4>黑名单</h4></td>
						<td valign="bottom">
							<span onclick="javascript:delBuddy();">
								<img src="static/images/delete.gif" height="14"/>&nbsp;删除</span>
						</td>
					</tr>
					
				</thead>
				
				<tr>
					<td colspan="2" width="100%">
						<table width="100%">
							<thead>
							<tr>
								<th width="10%" align="center" class="line1" scope="col">
									<b>选择</b>
								</th>
								<th width="20%" align="center" scope="col">
									<b>姓名</b>
								</th>
								<th width="20%" align="center" scope="col">
									<b>性别</b>
								</th>
								<th width="20%" align="center" scope="col">
									<b>年龄</b>
								</th>
								<th width="20%" align="center" scope="col">
									<b>来自</b>
								</th>
								<th width="10%" align="center">
									<b>操作</b>
								</th>
							</tr>
							</thead>
							
							<tbody>								
							<tr>
								<th width="10%" align="center">
									<input type="checkbox" name="nickName" value="briup2" />
								</th>
								<td width="20%" align="center">
									张三
								</td>
								<td width="20%" align="center">男</td>
								<td width="20%" align="center" >33</td>
								<td width="20%" align="center">内蒙古</td>
								<td width="10%" align="center">
									<img src="static/images/button_delete.gif" alt="移动到好友名单" onclick="window.location='../pages/messenger/moveToBlackList.do?blackName=briup2'" style="cursor:hand"/>
								</td>
							</tr>
														
							<tr>
								<th width="10%" align="center">
									<input type="checkbox" name="nickName" value="briup4" />
								</th>
								<td width="20%" align="center">
									李四
								</td>
								<td width="20%" align="center">男</td>
								<td width="20%" align="center" >32</td>
								<td width="20%" align="center">其它</td>
								<td width="10%" align="center">
									<img src="static/images/button_delete.gif" alt="移动到好友名单" onclick="window.location='../pages/messenger/moveToBlackList.do?blackName=briup4'" style="cursor:hand"/>
								</td>
							</tr>
							<tr>
								<th width="10%" align="center">
									<input type="checkbox" name="nickName" value="briup5" />
								</th>
								<td width="20%" align="center">
									赵六
								</td>
								<td width="20%" align="center">男</td>
								<td width="20%" align="center" >32</td>
								<td width="20%" align="center">其它</td>
								<td width="10%" align="center">
									<img src="static/images/button_delete.gif" alt="移动到好友名单" onclick="window.location='../pages/messenger/moveToBlackList.do?blackName=briup5'" style="cursor:hand"/>
								</td>
							</tr>
														
							<tr>
								<th width="10%" align="center">
									<input type="checkbox" name="nickName" value="briup6" />
								</th>
								<td width="20%" align="center">
									科比
								</td>
								<td width="20%" align="center">男</td>
								<td width="20%" align="center" >23</td>
								<td width="20%" align="center">内蒙古</td>
								<td width="10%" align="center">
									<img src="static/images/button_delete.gif" alt="移动到好友名单" onclick="window.location='../pages/messenger/moveToBlackList.do?blackName=briup6'" style="cursor:hand"/>
								</td>
							</tr>
							</tbody>						
							
							<tfoot>
							<tr>
								<td align="right" width="30%" colspan="6">
								选择：<a href="javascript:void(0)" onclick="javascript:selAllCheckbox('nickName');">全部</a>-
						  			  <a href="javascript:void(0)" onclick="javascript:unselAllCheckbox('nickName');">不选</a>-
						 			  <a href="javascript:void(0)" onclick="javascript:reAllCheckbox('nickName');">反选</a>
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
            <a href="javascript:void(0)">我的好友</a>
            <p>好友管理及黑名单</p>
           </div>
          </li>
          <li>
           <div>
            <img src="static/images/d.gif" />
            <a href="javascript:void(0)">个性空间</a>
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
