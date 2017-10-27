package com.pengyd.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pengyd.bean.Memberinfo;
import com.pengyd.bean.Memberspace;
import com.pengyd.service.IMemberinfoService;
import com.pengyd.service.IMemberspaceService;

@RequestMapping("LookSpaceController")
@Controller
public class LookSpaceController {
	@Autowired
	private IMemberspaceService memberspaceService;
	@Autowired
	private IMemberinfoService memberinfoService;
	
	@RequestMapping("lookSpace")
	@ResponseBody
	public String lookSpace(String nickName,HttpSession session){
	
		long memberid=memberinfoService.findMemberinfoByName(nickName).getId();
		Memberspace memberspace= memberspaceService.findMembersapceByInfoId(memberid);
		Memberinfo memberinfo=(Memberinfo)session.getAttribute("memberinfo");
		if(memberspace==null){
			//该用户没有个性空间
			return  "1";
		}else if(memberspace.getMemberid()==memberinfo.getId()){
			//查看自己的个性空间
			return "2";
		}else {
			//查看别人的个性空间
			return "3";
		}
		
	}
}
