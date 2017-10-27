package com.pengyd.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.beans.factory.annotation.Autowired;

import com.pengyd.bean.Memberinfo;
import com.pengyd.service.IMemberinfoService;

/**
 * Application Lifecycle Listener implementation class SessionListener
 *
 */
@WebListener
public class SessionListener implements HttpSessionListener {
	@Autowired
	private IMemberinfoService memberinfoService;
   
    public SessionListener() {
        
    }

	
    public void sessionCreated(HttpSessionEvent arg0) {
       System.out.println("session创建了！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0) {
    	Memberinfo memberinfo=(Memberinfo)arg0.getSession().getAttribute("memberinfo");
    	memberinfo.setIsonline(0L);
    	System.out.println(memberinfo+"!!!!!!!!!!!!!!!!!!!");
    	memberinfoService.updateMemberinfo(memberinfo);
    }
	
}
