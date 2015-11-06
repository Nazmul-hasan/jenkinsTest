package com.secl.metrica.manager.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.secl.metrica.bean.LoginBean;
import com.secl.metrica.manager.SessionManager;

public class SessionManagerImpl implements SessionManager {
	
	private Map<String, Map<String, LoginBean>> session = new ConcurrentHashMap<String, Map<String, LoginBean>>();
	
	@Override
	public void setUserInSession(LoginBean model){
		Map<String, LoginBean> userInfo = null;
		if(!session.containsKey(model.getLoginid())){
			userInfo = new ConcurrentHashMap<String, LoginBean>();
		}
		else {
			userInfo = session.get(model.getLoginid());
		}
		userInfo.put(model.getSessionId(), model);
		session.put(model.getLoginid(), userInfo);
	}
	
	@Override
	public LoginBean getUserInSession(LoginBean model){
		return session.get(model.getLoginid()).get(model.getSessionId());
	}

	@Override
	public void clearSession(LoginBean model) {
		if(session.containsKey(model.getLoginid())){
			session.get(model.getLoginid()).remove(model.getSessionId());
		}		
	}
	
	@Override
	public boolean isValid(LoginBean model) {
		if(!session.containsKey(model.getLoginid())){
			return false;
		}
		else if(!session.get(model.getLoginid()).containsKey(model.getSessionId())){
			return false;
		}
		return true;
	}
	

}
