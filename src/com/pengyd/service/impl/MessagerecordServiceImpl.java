package com.pengyd.service.impl;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pengyd.bean.Messagerecord;
import com.pengyd.dao.IMessagerecordDao;
import com.pengyd.service.IMessagerecordService;

@Service("messagerecordService")
public class MessagerecordServiceImpl implements IMessagerecordService{
	@Autowired
	private IMessagerecordDao messagerecordDao;
	
	
	public void saveMessagerecord(Messagerecord messagerecord) {
		//信息阅读状态: 0:未读 1:已读
		messagerecord.setStatus(0L);
		//发送状态:  0:发送完但是未删除 1:发送完并且已删除
		messagerecord.setSenderstatus(0L);
		//接收状态:  0:已经接收但未删除 1:接收而且已删除
		messagerecord.setReceiverstatus(0L);
		//设置发送的时间
		Date senddate=new Date();
		messagerecord.setSenddate(senddate);
		
		messagerecordDao.saveMessagerecord(messagerecord);
		
	}


	@Override
	public List<Messagerecord> findAllMessagerecordByReceiverName(
			String receiver) {
		List<Messagerecord> list=messagerecordDao.findAllMessagerecordByReceiverName(receiver);
		return list;
	}


	@Override
	public Messagerecord findMessagerecordById(Long id) {
		Messagerecord messagerecord=messagerecordDao.findMessagerecordById(id);
		return messagerecord;
	}


	@Override
	public void UpdateMessagerecord(Messagerecord messagerecord) {
			messagerecordDao.UpdateMessagerecord(messagerecord);
	}


	@Override
	public List<Messagerecord> findAllMessagerecordBySenderName(String sender) {
		List<Messagerecord> list=messagerecordDao.findAllMessagerecordByReceiverName(sender);
		return list;
	}

}
