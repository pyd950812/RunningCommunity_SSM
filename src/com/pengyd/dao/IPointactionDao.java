package com.pengyd.dao;

import com.pengyd.bean.Pointaction;

public interface IPointactionDao {
	//根据actionname找到对应的pointaction对象
	Pointaction findPointactionByName(String actionname);
}
