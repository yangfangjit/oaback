/**
 * 
 * 
 */
package com.banana.oaback.dto;


/**
 * @author Francis Yang created on Jun 15, 2017
 *
 */
public class ReturnResult<T> {
	
	private boolean status;
	
	private T data;
	
	private String message;
	
	public ReturnResult(boolean status, String message) {
		this.status = status;
		this.message = message;
	}

	public ReturnResult(boolean status, T data) {
		this.status = status;
		this.data = data;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
