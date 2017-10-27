package com.pengyd.service;

import com.pengyd.bean.Graderecord;

public interface IGraderecordService {
	//根据当前积分找到对应的Graderecord对象
	Graderecord findGraderecodeByPoint(long point);
}
