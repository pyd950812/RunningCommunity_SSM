package com.pengyd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pengyd.bean.Memberspace;
import com.pengyd.dao.IMemberspaceDao;
import com.pengyd.service.IMemberspaceService;

@Service("memberspaceService")
public class MemberspaceServiceImpl implements IMemberspaceService{
	
	@Autowired
	private IMemberspaceDao memberspaceDao;
	@Override
	public Memberspace findMembersapceByInfoId(Long id) {
		Memberspace memberspace=memberspaceDao.findMembersapceByInfoId(id);
		return memberspace;
	}
	@Override
	public void insertMemberspace(Memberspace memberspace) {
		memberspaceDao.insertMemberspace(memberspace);
		
	}

}
