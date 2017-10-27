package com.pengyd.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pengyd.bean.Memberinfo;
import com.pengyd.service.IMemberinfoService;


@RequestMapping("RemoveSessionController")
@Controller
public class RemoveSessionController {
	@Autowired
	private IMemberinfoService memberinfoService;
	
	@RequestMapping("removeSession")
	public String removeSession(HttpSession session){
		Memberinfo memberinfo=(Memberinfo)session.getAttribute("memberinfo");
		memberinfo.setIsonline(0L);
		memberinfoService.updateMemberinfo(memberinfo);
		session.removeAttribute("memberinfo");
		return "login";
	}
}
