package com.pengyd.service;

import java.util.List;

import com.pengyd.bean.Pointrecord;

public interface IPointrecordService {
	//保存用户加分记录
		void insertPointcord(Pointrecord pointrecord);
	//根据用户名查出该用户的所有的加分记录
		List<Pointrecord> findAllPointrecordByNickName(String nickname);
}
