package com.pengyd.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.pengyd.bean.Graderecord;
import com.pengyd.bean.Memberinfo;
import com.pengyd.bean.Pointaction;
import com.pengyd.bean.Pointrecord;
import com.pengyd.service.IGraderecordService;
import com.pengyd.service.IMemberinfoService;
import com.pengyd.service.IPointactionService;
import com.pengyd.service.IPointrecordService;

@RequestMapping("RegisterController")
@Controller
public class RegisterController {
	@Autowired
	private IMemberinfoService memberinfoService;
	@Autowired
	private IGraderecordService graderecordService;
	@Autowired
	private IPointactionService pointactionService;
    @Autowired
    private IPointrecordService pointrecordService;
    
	//注册
	@RequestMapping("register.do")
	public String register(Memberinfo memberinfo){
		System.out.println(memberinfo);
		//注册成功+50积分
		long point= memberinfo.getPoint();
		Pointaction pointaction=pointactionService.findPointactionByName("REGISTER");
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
		
		//如果推荐人存在 则推荐人加20积分  值可能为null，或者可能为空的字符串
		String recommenderName=memberinfo.getRecommender();
		if(recommenderName!="" && recommenderName.trim().length()!=0){
			Memberinfo m= memberinfoService.findMemberinfoByName(recommenderName);
			if(m!=null){
				//给推荐人加积分
				long pointRecommender =m.getPoint();
				Pointaction pointactionTUIJIAN=pointactionService.findPointactionByName("RECOMMEND");
				pointRecommender=pointRecommender+pointactionTUIJIAN.getPoint();
				m.setPoint(pointRecommender);
				
				
				//记录加分记录
				SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date date1=new Date();
				String receivedateTUIJIAN=simpleDateFormat1.format(date1);
				Pointrecord pointrecordTUIJIAN=new Pointrecord(pointactionTUIJIAN.getId(), recommenderName, receivedateTUIJIAN);
				pointrecordService.insertPointcord(pointrecordTUIJIAN);
				memberinfoService.updateMemberinfo(m);
			}
		}
		//设置注册时间
		Date registerdate=new Date();
		memberinfo.setRegisterdate(registerdate);
		//设置用户账户的状态
		memberinfo.setStatus(0L);
		//设置用户是否在线  刚注册时是不在线的
		memberinfo.setIsonline(0L);
		//设置用户最近登录的时间
		memberinfo.setLatestdate(null);
		memberinfoService.insertMemberinfo(memberinfo);
		memberinfoService.updateMemberinfo(memberinfo);
		
		return  "redirect:/RegisterController/login.do";
	}
	
	@RequestMapping("login.do")
	public String registerDo(){
		 return "login";
	}
	
}
