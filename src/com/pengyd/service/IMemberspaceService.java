package com.pengyd.service;

import com.pengyd.bean.Memberspace;

public interface IMemberspaceService {
	//根据用户的id查找对应的memberspace
		Memberspace findMembersapceByInfoId(Long id);
	//插入用户的memberspace
		void insertMemberspace(Memberspace memberspace);
}
