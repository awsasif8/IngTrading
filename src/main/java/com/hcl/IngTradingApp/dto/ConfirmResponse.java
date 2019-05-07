package com.hcl.IngTradingApp.dto;

import java.io.Serializable;

public class ConfirmResponse implements Serializable{

	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
