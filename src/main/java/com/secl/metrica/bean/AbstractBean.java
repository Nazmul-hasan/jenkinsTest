package com.secl.metrica.bean;

import java.io.Serializable;


@SuppressWarnings("serial")
public abstract class AbstractBean implements Serializable {
	
	protected LoginBean loginBean;
	protected String operation;
	protected String oid;	
	
	abstract public LoginBean getLoginBean();
	
	abstract public void setLoginBean(LoginBean loginBean);
	
	abstract public String getOperation();
	
	abstract public void setOperation(String operation);
	
	abstract public String getOid();
	
	abstract public void setOid(String oid);
	
}
