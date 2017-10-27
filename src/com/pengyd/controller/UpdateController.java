package com.pengyd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pengyd.bean.Memberinfo;
import com.pengyd.service.IMemberinfoService;

@RequestMapping("UpdateController")
@Controller
public class UpdateController {
	
	@Autowired
	private IMemberinfoService memberinfoService;
		@RequestMapping("updateInformate")
		public String updateInformate(Memberinfo memberinfo){
			memberinfoService.updateOnlyMemberinfo(memberinfo);
			return "login";
		}
}
