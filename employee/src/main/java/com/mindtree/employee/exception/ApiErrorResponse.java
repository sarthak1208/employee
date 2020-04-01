package com.mindtree.employee.exception;

import org.springframework.http.HttpStatus;

public class ApiErrorResponse {
	private String cause;

	private String message;

	private HttpStatus httpStatus;

	private int httpStatusCode;

	private boolean error;

	public ApiErrorResponse() {
		
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public int getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(int httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public ApiErrorResponse(String cause, String message, HttpStatus httpStatus, int httpStatusCode, boolean error) {
		super();
		this.cause = cause;
		this.message = message;
		this.httpStatus = httpStatus;
		this.httpStatusCode = httpStatusCode;
		this.error = error;
	}
	
	
	
	

}
