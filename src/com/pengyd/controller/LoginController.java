package com.pengyd.controller;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pengyd.bean.Graderecord;
import com.pengyd.bean.Memberinfo;
import com.pengyd.bean.Memberspace;
import com.pengyd.bean.Messagerecord;
import com.pengyd.bean.Pointaction;
import com.pengyd.bean.Pointrecord;
import com.pengyd.service.IGraderecordService;
import com.pengyd.service.IMemberinfoService;
import com.pengyd.service.IMemberspaceService;
import com.pengyd.service.IMessagerecordService;
import com.pengyd.service.IPointactionService;
import com.pengyd.service.IPointrecordService;


@RequestMapping("LoginController")
@Controller
public class LoginController {
	
	@Autowired
	private IMemberinfoService memberinfoService;
	@Autowired
	private IGraderecordService graderecordService;
	@Autowired
	private IPointactionService pointactionService;
    @Autowired
    private IPointrecordService pointrecordService;
    @Autowired
    private IMessagerecordService messagerecordService;
    @Autowired
    private IMemberspaceService memberspaceService;

	@RequestMapping("loginfunc")
	@ResponseBody
	public String loginfunc(String nickname,String passwd,Boolean authLogin,HttpServletResponse response,HttpServletRequest request,HttpSession session){
	Memberinfo memberinfo= memberinfoService.findMemberinfoByName(nickname);

	//判断用户名密码是否正确
	if(memberinfo==null || !memberinfo.getPasswd().equals(passwd) ){
		return "error";
	}else{
		//登录加积分
		long point= memberinfo.getPoint();
		Pointaction pointaction=pointactionService.findPointactionByName("LOGIN");
		point=point+pointaction.getPoint();
		memberinfo.setPoint(point);
		//根据现在的积分找到对应的graderecord对象  并设置到memberinfo对象中
		Graderecord graderecord= graderecordService.findGraderecodeByPoint(point);
		memberinfo.setGraderecord(graderecord);
		//设置gradeid
		memberinfo.setGradeid(graderecord.getId());
		
		//记录加分记录
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		String receivedate=simpleDateFormat.format(date);
		Pointrecord pointrecord=new Pointrecord(pointaction.getId(), memberinfo.getNickName(), receivedate);
		pointrecordService.insertPointcord(pointrecord);
		
		
		//上一次登录的时间
        Date thedate=memberinfo.getLatestdate();
		//设置最近一次登录的时间
		Date latestdate=new Date();
		memberinfo.setLatestdate(latestdate);
		//设置用户是否在线
		memberinfo.setIsonline(1L);
		memberinfoService.updateMemberinfo(memberinfo);
		//把现在对象的时间设为上一次的时间  因为页面上要拿
		memberinfo.setLatestdate(thedate);
		session.setAttribute("memberinfo", memberinfo);
			
		
		//判断是否勾选了自动登录
		if(authLogin){
			Cookie cookie1=new Cookie("authLogin", URLEncoder.encode((nickname+","+passwd)));
			cookie1.setPath(request.getContextPath());
			cookie1.setMaxAge(60*60*24*365);
			response.addCookie(cookie1);
		}
		
		
//		Cookie[] cookies=request.getCookies();
//		if(cookies!=null){
//			for(Cookie c:cookies){
//				if(c.getName().equals("authLogin")){
//					String cook=c.getValue();
//					System.out.println(cook);
//					String username=cook.split(",")[0];
//					System.out.println(username);
//					Memberinfo memberinfo2= memberinfoService.findMemberinfoByName(username);
//					System.out.println(memberinfo2);
//					session.setAttribute("memberinfo", memberinfo2);
//					return "activity";
//				}
//			}
//		}
		
		return "success";
		}
		
	}
	
	
	
	@RequestMapping("activity")
	public String activity(){

		return "member/activity";
	}
	@RequestMapping("modify")
	public String modify(){

		return "member/modify";
	}
	@RequestMapping("passwd_missing")
	public String passwd_missing(){

		return "passwd_missing";
	}
	
	@RequestMapping("noSpace")
	public String noSpace(){

		return "member/noSpace";
	}
	
	
	@RequestMapping("space")
	public String space(){

		return "member/space";
	}
	
	@RequestMapping("otherspace")
	public String otherspace(HttpServletRequest request,HttpSession session){
		String nickname=request.getParameter("nickName");
		Memberinfo memberinfo= memberinfoService.findMemberinfoByName(nickname);
		Memberspace memberspace= memberspaceService.findMembersapceByInfoId(memberinfo.getId());
		memberinfo.setMemberSpace(memberspace);
		session.setAttribute("otherMember", memberinfo);
		return "member/lookspace";
	}
	
	
	@RequestMapping("createSpace")
	public String createSpace(){

		return "member/createSpace";
	}
	
	@RequestMapping("inbox")
	public String inbox(HttpSession session){
		Memberinfo memberinfo=(Memberinfo)session.getAttribute("memberinfo");
		List<Messagerecord> receiverList= messagerecordService.findAllMessagerecordByReceiverName(memberinfo.getNickName());
		session.setAttribute("receiverList", receiverList);
		return "messenger/inbox";
	}
	
	@RequestMapping("outbox")
	public String outbox(HttpSession session){
		Memberinfo memberinfo=(Memberinfo)session.getAttribute("memberinfo");
		List<Messagerecord> senderList= messagerecordService.findAllMessagerecordBySenderName(memberinfo.getNickName());
		session.setAttribute("senderList", senderList);
		return "messenger/outbox";
	}
	
	@RequestMapping("sendInfo")
	public String sendInfo(){

		return "messenger/sendInfo";
	}
	
	@RequestMapping("matchFriend")
	public String matchFriend(){

		return "matchFriend";
	}
	
	@RequestMapping("boddyList")
	public String boddyList(){

		return "boddyList";
	}
	
	@RequestMapping("blackList")
	public String blackList(){

		return "blackList";
	}
	
	
}
