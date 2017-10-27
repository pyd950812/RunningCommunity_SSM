package com.pengyd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pengyd.bean.Pointaction;
import com.pengyd.dao.IPointactionDao;
import com.pengyd.service.IPointactionService;

@Service("pointactionService")
public class PointactionServiceImpl implements IPointactionService{
	@Autowired
	private IPointactionDao pointactionDao;
	
	@Override
	public Pointaction findPointactionByName(String actionname) {
		Pointaction pointaction=pointactionDao.findPointactionByName(actionname);
		return pointaction;
	}

}
