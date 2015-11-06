package com.secl.metrica.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ResponseBean implements Serializable {
	
	private boolean isSuccess;
	private String message;
	private Object data;

	public ResponseBean() {
		this.isSuccess = false;
		this.data = null;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
