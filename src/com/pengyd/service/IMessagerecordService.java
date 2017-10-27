package com.pengyd.service;

import java.util.List;

import com.pengyd.bean.Messagerecord;

public interface IMessagerecordService {
	//保存发件信息
		void saveMessagerecord(Messagerecord messagerecord);
	//根据收件人的名字找到收件箱中所有的邮件
		List<Messagerecord> findAllMessagerecordByReceiverName(String receiver);
	//根据邮件的id找到对应的邮件
		Messagerecord findMessagerecordById(Long id);
	//更新messagerrcord
		void UpdateMessagerecord(Messagerecord messagerecord);
	//根据发件人的名字找到收件箱中所有的邮件
		List<Messagerecord> findAllMessagerecordBySenderName(String sender);
}
