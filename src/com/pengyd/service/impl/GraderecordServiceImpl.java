package com.pengyd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pengyd.bean.Graderecord;
import com.pengyd.dao.IGraderecordDao;
import com.pengyd.service.IGraderecordService;

@Service("graderecordService")
public class GraderecordServiceImpl implements IGraderecordService{
	
	@Autowired
	private IGraderecordDao graderecordDao;
	
	//根据当前积分找到对应的Graderecord对象
	@Override
	public Graderecord findGraderecodeByPoint(long point) {
		 Graderecord graderecord=graderecordDao.findGraderecodeByPoint(point);
		return graderecord;
	}

}
