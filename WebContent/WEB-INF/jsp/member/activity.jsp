<%@page import="com.sun.swing.internal.plaf.metal.resources.metal"%>
<%@page import="com.pengyd.bean.Memberinfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
    	String path=request.getContextPath();
        String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
    %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
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
<script type="text/javascript" src="static/JQuery/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="static/js/activity.js"></script>
<script src="static/js/main.js" type="text/javascript"></script>
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
      <li class="current"><a href="activity">首页</a></li>
      <li><a href="static/other/musicrun.html">音乐跑不停</a></li>
      <li><a href="static/other/equip.html">跑步装备库</a></li>
      <li><a href="static/other/guide.html">专业跑步指南</a></li>
      <li><a href="static/other/bbs.html">跑步论坛</a></li>
	  
      </ul>
      <span><table width="100%" border="0">
								<tr>
									<td align="right">
										上一次登录时间：中国标准时间 ${memberinfo.latestdate }
									</td>
									<td align="center">
										欢迎，&nbsp;
										<a href="isCreateSpace.action">
										<font color="red" id="activityname">${memberinfo.nickName}</font> </a>&nbsp;
									</td>
									<td align="left">
										当前您的积米：&nbsp;&nbsp;
										<font color="red">${memberinfo.point } </font>&nbsp;&nbsp;
										当前等级：
										<font color="red">${memberinfo.graderecord.gradename }</font>
									</td>
								</tr>
							</table> </span>    </div>
   </div>
  

  <div id="content">
     <div align="left">
	  
		<span></span>
	 </div>
	 
     <div id="left">
       
        <div id="tabs0">
             <ul class="menu0" id="menu0">
              <li onmouseover="setTab(0)" class="lisovers">社区新闻1</li>
              <li onmouseover="setTab(1)">社区新闻2</li>
              <li onmouseover="setTab(2)">社区新闻3</li>
              <li onmouseover="setTab(3)">社区新闻4</li>
             </ul>
         <div class="main0" id="main0">
          <div class="block">
                      <img src="static/images/net.jpg" />

            <p>
                   1999年,盖茨撰写了《未来时速:数字神经系统和商务新思维》（
                   Business @ the Speed of Thought: Using a Digital Nervous System）一书，
                   向人们展示了计算机技术是如何以崭新的方式来解决商业问题的。这本书在超过60个国家以25种语言出版。
            </p>

          </div>
          <div>
                       <img src="static/images/php.jpg" />

             <p>
除了对计算机和软件的热爱之外，盖茨对生物技术也很有兴趣。他是ICOS公司董事会的一员，这是一家专注于蛋白质基体及小分子疗法的公司。他也是很多其它生物技术公司的投资人             </p>

          </div>
          <div>
                      <img src="static/images/net.jpg" />

            <p>
对于盖茨来说，慈善事业也是非常重要的。他和他的妻子Melinda已经捐赠了近 58亿美元建立了一个基金，支持在全球医疗健康和教育领域的慈善事业，希望随着人类进入21世纪，这些关键领域的科技进步能使全人类都受益            </p>
          </div>
          <div>
                       <img src="static/images/php.jpg" />

             <p>
到今天为止，盖茨和他的妻子Melinda Gates建立的基金已经将25多亿美元用于了全球的健康事业，将14亿多美元用于改善人们的学习条件，其中包括为盖茨图书馆购置计算机设备、为美国和加拿大的低收入社区的公共图书馆提供互联网培训和互联网访问服务             </p>
          </div>
          </div>
          <div class="clear"></div>
        </div>
        
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
            <a href="LoginController/matchFriend">我的好友</a>
            <p>好友管理及黑名单</p>
           </div>
          </li>
          <li>
           <div>
            <img src="static/images/d.gif" />
              <a href="MemberspaceController/memberspace?nickname=${memberinfo.nickName}" id="myspace">个性空间</a>
            <p>创建自己的个性空间</p>
           </div>
          </li>
          </ul>
        </div> 
         
     </div>
     
     <div id="right">
	 <table width="300">
		<tr>
			<td colspan="2" align="left">用户 ip 所在地：本机地址 杰普科技有限公司</td>
			
		</tr>
		<tr>
			<td align="left">您是本社区的第10位来访者</td>
			<td align="left"><font color="green"><b>在线人数：<span id="online">2</span></b></font></td>
		</tr>
		
	</table>
        <div id="demo">
        <div id="indemo">
        <div id="demo1">
        <a href="#"><img src="static/images/1.gif" border="0" width="90" height="80"/></a>
        <a href="#"><img src="static/images/2.gif" border="0" width="90" height="80"/></a>
        <a href="#"><img src="static/images/3.gif" border="0" width="90" height="80"/></a>
        <a href="#"><img src="static/images/4.gif" border="0" width="90" height="80" /></a>
        <a href="#"><img src="static/images/1.gif" border="0" width="90" height="80" /></a>
        <a href="#"><img src="static/images/2.gif" border="0" width="90" height="80" /></a>
        <a href="#"><img src="static/images/3.gif" border="0" width="90" height="80"/></a>
        <a href="#"><img src="static/images/4.gif" border="0" width="90" height="80" /></a>
        </div>
        <div id="demo2"></div>
        </div>
        </div>
      <h2> 积分排行榜</h2>
      <ul>
     
      <%
      		List<Memberinfo> list=(List<Memberinfo>)application.getAttribute("listTen");
     			 for(int i=0;i<=9;i++){
    	  			Memberinfo m=list.get(i);
    	  			%>
    			
        <li><a id="nickn<%=i %>" onclick="look(<%=i %>)"  style="cursor: pointer;"><%=m.getNickName()  %></a></li>
      <%  }%>
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