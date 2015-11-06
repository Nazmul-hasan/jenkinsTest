package com.secl.metrica.converter;


import com.secl.metrica.bean.LoginBean;

import com.secl.metrica.entity.LoginInfo;


public class EntityToBeanConverter {

	public static LoginBean convertLoginInfoToBean(LoginInfo domain) {
		LoginBean loginBean = new LoginBean();
		loginBean.setLoginid(domain.getLoginid());
		
		
		
		return loginBean;
	}

}

