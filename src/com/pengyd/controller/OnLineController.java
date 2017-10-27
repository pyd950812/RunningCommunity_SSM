package com.pengyd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pengyd.service.IMemberinfoService;

@RequestMapping("OnLineController")
@Controller
public class OnLineController {
	@Autowired
	private IMemberinfoService memberinfoService;
	
	@RequestMapping("isonline")
	@ResponseBody
	public int isonline(){
		int num=memberinfoService.findMemberIsonline();
		return num;
	}
}
