package com.pengyd.init;

import java.util.List;

import javax.servlet.ServletContext;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.ServletContextAware;

import com.pengyd.bean.Memberinfo;
import com.pengyd.service.IMemberinfoService;


//相当于application的监听器
public class InitData implements InitializingBean,ServletContextAware{
	@Autowired
	private IMemberinfoService memberinfoService;
	
	
	@Override
	public void setServletContext(ServletContext application) {
		//tomcat启动时，将所有的用户查找到
		List<Memberinfo> listTen=memberinfoService.findMemberinfoTen();
		application.setAttribute("listTen", listTen);
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		
	}

}
