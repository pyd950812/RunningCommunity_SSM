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
thead tr th{background:#B0D1FC;border:1px solid white;}
thead tr th.line1{background:#D3E5FD;}
thead tr th.line4{background:#C6C6C6;}
tbody tr td{height:35px;background:#CBE2FB;border:1px solid white; vertical-align:middle;}
tbody tr td.line4{background:#D5D6D8;}
tbody tr th{height:35px;background: #DFEDFF;border:1px solid white; vertical-align:middle;}
tfoot tr td{height:35px;background:#F5F5F5;border:1px solid white; vertical-align:middle; text-align:right}
-->
</style>

<script src="static/JQuery/jquery-1.8.3.min.js" type="text/javascript"></script>
<script type="text/javascript" src="static/js/common.js" ></script>

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
	 <br /><br />
		<table width="600" border="0" align="center" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<td colspan="2" height="40">
						<h4>-&gt;好友速配</h4>
					</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td width="100%">
						<form action="#" method="post" name="matchFriendForm">
						<table width="100%" cellspacing="1" cellpadding="3" align="center">
							<tr>
								<td colspan="4">
									<b>找到您跑步世界的另一半，您可以 <a href="#"><FONT color=#ff0000>马上速配</FONT></a> 一位跑友</b>
								</td>
							</tr>
							<tr>
								<td colspan="4"><b>更可以按要求检索</b></td>
							</tr>
							<tr>
         						 <td align="center">年龄范围：
         						 	<select name="age">
                  						<option value="10-19">10-19岁</option>
                  						<option value="20-29">20-29岁</option>
                  						<option value="30-39">30-39岁</option>
                  						<option value="unlimited" selected="selected">不限</option>
                    				</select>
                    			</td>
           						<td align="center">性别：
                					<select name="gender">
               							<option value="0">男</option>
              							<option value="1">女</option>
               							<option value="unlimited" selected="selected">不限</option>
                					</select>
                				</td>
                				<td align="center">所在省/城市：
                					<select name="provinceCity">
                    					<option value="1">上海</option>
                    					<option value="2">北京</option>
                    					<option value="3">天津</option>
                    					<option selected="selected" value="unlimited">不限</option>
                    				</select> 
                    			</td>
                    			<td align="center">
            						<input type="submit" name="Submit2" value="开始检索" />                 
          						</td>
         					</tr>
						</table>
						</form>
					</td>
				</tr>
			</tbody>		
					
			<table width="100%" cellspacing="1" cellpadding="3" align="center">
				<tfoot>
				<tr height="25">
					<td width="15%" align="center">张三</td>
					<td width="15%" align="center">女</td>
					<td width="15%" align="center">22</td>
					<td width="15%" align="center">上海</td>
					<td width="20%" align="center">
						<a href="#">添加好友</a>
					</td>
					<td width="20%" align="center">
						<a href="#">发送短信</a>
					</td>
				</tr>
				<tr height="25">
					<td width="15%" align="center">李四</td>
					<td width="15%" align="center">男</td>
					<td width="15%" align="center">33</td>
					<td width="15%" align="center">内蒙古</td>
					<td width="20%" align="center">
						<a href="#">添加好友</a>
					</td>
					<td width="20%" align="center">
						<a href="#">发送短信</a>
					</td>
				</tr>
				<tr height="25">
					<td width="15%" align="center">王五</td>
					<td width="15%" align="center">男</td>
					<td width="15%" align="center">30</td>
					<td width="15%" align="center">北京</td>
					<td width="20%" align="center">
						<a href="#">添加好友</a>
					</td>
					<td width="20%" align="center">
						<a href="#">发送短信</a>
					</td>
				</tr>
				<tr height="25">
					<td width="15%" align="center">赵四</td>
					<td width="15%" align="center">女</td>
					<td width="15%" align="center">25</td>
					<td width="15%" align="center">天津</td>
					<td width="20%" align="center">
						<a href="#">添加好友</a>
					</td>
					<td width="20%" align="center">
						<a href="#">发送短信</a>
					</td>
				</tr>
				
				<tr height="25">
					<td width="15%" align="center">科比</td>
					<td width="15%" align="center">男</td>
					<td width="15%" align="center">50</td>
					<td width="15%" align="center">重庆</td>
					<td width="20%" align="center">
						<a href="#">添加好友</a>
					</td>
					<td width="20%" align="center">
						<a href="#">发送短信</a>
					</td>
				</tr>
				</tfoot>
			</table>
		</table>
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