package com.pengyd.service;

import java.util.List;

import com.pengyd.bean.Memberinfo;

public interface IMemberinfoService {
	//通过名字找到对应的Memberinfo
		Memberinfo findMemberinfoByName(String nickname);
	//插入用户
	    void insertMemberinfo(Memberinfo memberinfo);
    //更新用户信息
		void updateMemberinfo(Memberinfo memberinfo);
	//积分前10的用户
		List<Memberinfo> findMemberinfoTen(); 
	//更新指定的用户的信息
		void updateOnlyMemberinfo(Memberinfo memberinfo);
		
    //找出在线的所有用户的人数
	int findMemberIsonline();
}
