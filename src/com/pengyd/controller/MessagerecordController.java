package com.pengyd.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pengyd.bean.Memberinfo;
import com.pengyd.bean.Messagerecord;
import com.pengyd.service.IMemberinfoService;
import com.pengyd.service.IMessagerecordService;

@RequestMapping("MessagerecordController")
@Controller
public class MessagerecordController {
	@Autowired
	private IMessagerecordService messagerecordService;
	@Autowired
	private IMemberinfoService memberinfoService;
	
	@RequestMapping("sendMessager")
	public String sendMessager(HttpSession session,Messagerecord messagerecord){
		Memberinfo memberinfo=(Memberinfo) session.getAttribute("memberinfo");
		//设置发件人
		 messagerecord.setSender( memberinfo.getNickName());
		 messagerecordService.saveMessagerecord(messagerecord);
		 session.setAttribute("messagerecord", messagerecord);
		return "messenger/view";
	}
	
	
	@RequestMapping("findMemberinfo")
	@ResponseBody
	public String findMemberinfo(String receiver,HttpSession session){
		Memberinfo memberinfo= memberinfoService.findMemberinfoByName(receiver);
		Memberinfo memberinfo1=(Memberinfo)session.getAttribute("memberinfo");
		if(memberinfo==null){
			//用户不存在
			return "0";
		}else {
			if(memberinfo1.getNickName().equals(receiver)){
				//收件人不能是自己
				return "1";
			}
			//正常
			return "2";
		}
	}
	
	//查看对应主题的邮件
	@RequestMapping("lookMessage")
	public String lookMessage(Long id,HttpSession session){
		Messagerecord messagerecord=messagerecordService.findMessagerecordById(id);
		System.out.println(id);
		session.setAttribute("messagerecord", messagerecord);
		messagerecord.setStatus(1L);
		messagerecordService.UpdateMessagerecord(messagerecord);
		return "messenger/view";
	}
	
	
	
	
	
	
	
	
}
