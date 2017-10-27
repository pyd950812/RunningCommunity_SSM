package com.pengyd.controller;





import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;

import com.pengyd.bean.Memberinfo;
import com.pengyd.service.IMemberinfoService;

@RequestMapping("MemberinfoController")
@Controller
public class MemberinfoController {
	@Autowired
	private IMemberinfoService memberinfoService;
	
	
	//通过名字找到对应的memberinfo对象        判断是否存在这个用户
	@RequestMapping(value="findMemberinfoByName",method=RequestMethod.POST)
	@ResponseBody
	public Memberinfo findMemberinfoByName(String nickname){
		Memberinfo memberinfo= memberinfoService.findMemberinfoByName(nickname);
		return memberinfo;
	} 
	
	
	
	
	
	
	
	
}
