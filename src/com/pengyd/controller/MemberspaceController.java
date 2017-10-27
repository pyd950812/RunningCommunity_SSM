package com.pengyd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pengyd.bean.Memberinfo;
import com.pengyd.bean.Memberspace;
import com.pengyd.service.IMemberinfoService;
import com.pengyd.service.IMemberspaceService;

@RequestMapping("MemberspaceController")
@Controller
public class MemberspaceController {
	@Autowired
	private IMemberspaceService memberspaceService;
	@Autowired
	private IMemberinfoService memberinfoService;
	
	@RequestMapping("memberspace")
	public String memberspace(String nickname,HttpSession session){
		Memberinfo memberinfo=memberinfoService.findMemberinfoByName(nickname);
		Memberspace memberspace=memberspaceService.findMembersapceByInfoId(memberinfo.getId());
		//判断该用户是否有memberspace，如果有就将memberspace放到memberinfo中去
		if(memberspace==null){
			return "member/noSpace";
		}else {
			memberinfo.setMemberSpace(memberspace);
			session.setAttribute("memberinfo", memberinfo);
			return "member/space";
		}
	}
	
	
	
	@RequestMapping(value="createMemberspace")
	public String createMemberspace(Memberspace memberspace,HttpSession session){
		Memberinfo memberinfo=(Memberinfo)session.getAttribute("memberinfo");
		long memberid=memberinfo.getId();
		memberspace.setMemberid(memberid);
		memberspaceService.insertMemberspace(memberspace);
		session.setAttribute("memberinfo", memberinfo);
		
		return "member/activity";
	}
}
