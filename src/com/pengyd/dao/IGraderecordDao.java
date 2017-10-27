package com.pengyd.dao;

import com.pengyd.bean.Graderecord;

public interface IGraderecordDao {
	//根据当前积分找到对应的Graderecord对象
	Graderecord findGraderecodeByPoint(long point);
}	
