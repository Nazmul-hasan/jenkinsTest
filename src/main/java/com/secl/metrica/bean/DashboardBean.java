package com.secl.metrica.bean;


@SuppressWarnings("serial")
public class DashboardBean extends AbstractBean {
	
	private long connect;
	private long init;
	private long kill;
	private long disconnect;
	
	public long getConnect() {
		return connect;
	}
	
	public void setConnect(long connect) {
		this.connect = connect;
	}
	
	public long getInit() {
		return init;
	}
	
	public void setInit(long init) {
		this.init = init;
	}
	
	public long getKill() {
		return kill;
	}
	
	public void setKill(long kill) {
		this.kill = kill;
	}

	public long getDisconnect() {
		return disconnect;
	}

	public void setDisconnect(long disconnect) {
		this.disconnect = disconnect;
	}

	@Override
	public LoginBean getLoginBean() {
		return loginBean;
	}

	@Override
	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}

	@Override
	public String getOperation() {
		return operation;
	}

	@Override
	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public String getOid() {
		return oid;
	}

	@Override
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	
	
}



