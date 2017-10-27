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
<script src="static/js/main.js" type="text/javascript"></script>
<style type="text/css">
<!--
table{border-spacing:1px; border:1px solid #A2C0DA;}
td, th{padding:2px 5px;border-collapse:collapse;text-align:left; font-weight:normal; text-align:left}
thead tr th{height:30px;background:#FFFFFF;border:1px solid white;}
thead tr th.line1{background:#FFFFFF;}
thead tr th.line4{background:#C6C6C6;}
tbody tr td{height:35px;background:#CBE2FB;border:1px solid white; vertical-align:middle;}
tbody tr td.line4{background:#D5D6D8;}
tbody tr th{height:35px;background: #DFEDFF;border:1px solid white; vertical-align:middle;}
tfoot tr td{height:35px;background:#FFFFFF;border:1px solid white; vertical-align:middle; text-align:center}
-->
</style>
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
      <li><a href="LoginController/activity">首页</a></li>
      <li><a href="static/other/musicrun.html">音乐跑不停</a></li>
      <li><a href="static/other/equip.html">跑步装备库</a></li>
      <li><a href="static/other/guide.html">专业跑步指南</a></li>
      <li><a href="static/other/bbs.html">跑步论坛</a></li>
	  
      </ul>
      <span></span>
    </div>
   </div>
  
  <div id="content" align="center">
     
     <div id="center">
      
		<table width="600">
			<thead>
  			<tr>
   				<th colspan="3">
					<h4>修改会员信息</h4>
				</th>
 			</tr>
			</thead>
			
  			<tr>
				<td width="100%">
					<form action="UpdateController/updateInformate" method="post" onSubmit="return validateModifyForm(this);">
					<table width="100%" border="0" style="margin:5px 0;" cellspacing="0" cellpadding="0" align="center" >
					<thead>
		 			<tr>
						<td colSpan=3>
							请填写个人资料：（注意带有<font color=#ff0000>*</font>的项目必须填写）
						</td>
					</tr>
					</thead>
					<tbody>
					<tr>
						<th width="25%" class="line1">
							<div align="right" >
								<font color="#ff0000">*</font>昵称：
							</div>
						</th>
						<td width="30%" >
							<input type="text" maxLength="14" style="width:200px" name="nickName" value="${memberinfo.nickName }" readonly="readonly" />
						</td>
						<th width="45%" >
							<font color="#ff0000">昵称可使用长度为0-16的任何字符</font>
						</th>
					</tr>
					<tr>
						<th class="line1">
							<div align="right">
								<font color="#ff0000" >*</font> 旧密码：
							</div>
						</th>
						<td>
							<input type="text" maxLength="14" style="width:200px" name="oldPasswd" value="${memberinfo.passwd}" readonly="readonly" />
						</td>
						<th>&nbsp;
							
						</th>
					</tr>
					<tr>
						<th class="line1">
							<div align="right">
								<font color="#ff0000" >*</font> 新密码：
							</div>
						</th>
						<td>
							<input type="password" maxLength="14" style="width:200px" name="passwd" />
						</td>
						<th>
							<font color="#ff0000">密码可使用长度为6-14的任何字符，并区分英文字母大小写</font>
						</th>
					</tr>
					<!-- <tr>
						<th class="line1">
							<div align="right">
								<font color="#ff0000">*</font>密码确认：
							</div>
						</th>
						<td>
							<input type="password" maxLength="14" style="width:200px"	name=newPasswdre />
						</td>
						<th>
							<font color="#ff0000">请再输入一次密码</font>
						</th>
					</tr> -->
					<tr>
						<th class="line1">
							<div align="right">
								<font color="#ff0000">*</font>电子邮箱：
							</div>
						</th>
						<td>
							<input type="text" maxLength="30" style="width:200px" name="email"  value="${memberinfo.email}"/>
						</td>
						<th>
							<font color="#ff0000">请输入您常用的其它电子邮箱</font>
						</th>
					</tr>
					<tr>
						<th class="line1">
							<div align="right">
								<font color="#ff0000">*</font> 密码提示问题：
							</div>
						</th>
						<th>
							<input style="width:200px" type="text" name="passwdQuestion"  value="${memberinfo.passwdQuestion }" />
						</th>
						<th>
							<font color="#ff0000">例如：我的哥哥是谁？</font>
						</th>
					</tr>
					<tr>
						<th class="line1">
							<div align="right">
								<font color="#ff0000">*</font> 密码提示答案：
							</div>
						</th>
						<td>
							<input  type="text" style="width:200px" name="passwdAnswer"  value="${memberinfo.passwdAnswer }"/>
						</td>
						<th>
							<font color="#ff0000">注意：密码提示问题答案长度不少于6位</font>
						</th>
					</tr>
					<tr>
						<th class="line1">
							<div align="right" >
								<font color=#ff0000>*</font> 性别：
							</div>
						</th>
						<td>
							<input type="radio" value="0" name="gender" checked="checked"/>男
							<input type="radio" value="1" name="gender" />女
						</td>
						<th>&nbsp;	</th>
					</tr>
					<tr>
						<th class="line1">
							<div align="right">
								所在省份/城市：
							</div>
						</th>
						<td >
							<select name="provinceCity">
								 <OPTION value=0 
									  selected>请选择</OPTION> <OPTION value=北京>北京</OPTION> <OPTION 
									  value=上海>上海</OPTION> <OPTION value=天津>天津</OPTION> <OPTION 
									  value=重庆>重庆</OPTION> <OPTION value=辽宁>辽宁</OPTION> <OPTION 
									  value=广东>广东</OPTION> <OPTION value=浙江>浙江</OPTION> <OPTION 
									  value=江苏>江苏</OPTION> <OPTION value=山东>山东</OPTION> <OPTION 
									  value=四川>四川</OPTION> <OPTION value=黑龙江>黑龙江</OPTION> <OPTION 
									  value=湖南>湖南</OPTION> <OPTION value=湖北>湖北</OPTION> <OPTION 
									  value=福建>福建</OPTION> <OPTION value=陕西>陕西</OPTION> <OPTION 
									  value=河南>河南</OPTION> <OPTION value=安徽>安徽</OPTION> <OPTION 
									  value=河北>河北</OPTION> <OPTION value=吉林>吉林</OPTION> <OPTION 
									  value=江西>江西</OPTION> <OPTION value=广西>广西</OPTION> <OPTION 
									  value=山西>山西</OPTION> <OPTION value=内蒙古>内蒙古</OPTION> <OPTION 
									  value=甘肃>甘肃</OPTION> <OPTION value=贵州>贵州</OPTION> <OPTION 
									  value=新疆>新疆</OPTION> <OPTION value=云南>云南</OPTION> <OPTION 
									  value=宁夏>宁夏</OPTION> <OPTION value=海南>海南</OPTION> <OPTION 
									  value=青海>青海</OPTION> <OPTION value=西藏>西藏</OPTION> <OPTION 
									  value=港澳台>港澳台</OPTION> <OPTION value=海外>海外</OPTION> <OPTION 
									  value=其它>其它</OPTION>
							</select>
						</td>
						<th>&nbsp;
							
						</th>
					</tr>
					<tr>
						<th class="line1">
							<div align="right">
								联系电话：
							</div>
						</th>
						<td>
							<input type="text" style="width:200px" name="phone"  value="${memberinfo.phone }"/>
						</td>
						<th>
							<font color=#ff0000>请输入区号和真实的电话，以便我们与您联系</font>
						</th>
					</tr>
					<tr>
						<th class="line1">
							<div align="right">
								详细地址：
							</div>
						</th>
						<td>
							<input type="text" style="width:200px" name="address"  value="${memberinfo.address }" />
						</td>
						<th>&nbsp;</th>
					</tr>
					<tfoot>
    				<tr>
						<td colSpan="3" align="center">
							<input type="submit" value="提交" style="cursor: hand"/>
							&nbsp;&nbsp;
							<input type="reset" value="重置" style="cursor: hand"/>
						</td>
					</tr> 
					</tfoot>
					</table>
					</form>
				</td>
  			</tr>
			</table>
	        <BR /><BR />
        <div id="hots">
          <h2>我的地盘</h2>
          <ul>
          <li>
           <div>
            <img src="static/images/a.gif" />
            <a href="javascript:void(0)">基本信息</a>
            <p>可修改自己的基本信息</p>
           </div>
          </li>
          <li>
           <div>
