package com.pengyd.dao;

import com.pengyd.bean.Memberspace;

public interface IMemberspaceDao {
	//根据用户的id查找对应的memberspace
	Memberspace findMembersapceByInfoId(Long id);
	//插入用户的memberspace
	void insertMemberspace(Memberspace memberspace);
}
