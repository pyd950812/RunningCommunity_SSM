package com.pengyd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pengyd.bean.Pointrecord;
import com.pengyd.dao.IPointrecordDao;
import com.pengyd.service.IPointrecordService;
@Service("pointrecordService")
public class PointrecordServiceImpl implements IPointrecordService{
	
	@Autowired
	private IPointrecordDao pointrecordDao;
	
	
	@Override
	public void insertPointcord(Pointrecord pointrecord) {
		pointrecordDao.insertPointcord(pointrecord);
	}

	@Override
	public List<Pointrecord> findAllPointrecordByNickName(String nickname) {
		List<Pointrecord> list= pointrecordDao.findAllPointrecordByNickName(nickname);
		return list;
	}

}
