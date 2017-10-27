package com.pengyd.service;

import com.pengyd.bean.Pointaction;

public interface IPointactionService {
	//根据actionname找到对应的pointaction对象
		Pointaction findPointactionByName(String actionname);
}
