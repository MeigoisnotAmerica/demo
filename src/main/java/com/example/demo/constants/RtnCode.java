package com.example.demo.constants;

public enum RtnCode {
	SUCCESSFUL(200, "OK!"),//
	PARAM_ERROR(400, "Parameter error!!"),//
	ACCOUNT_EXISTED(400, "Account existed!!"),//
	ACCOUNT_NOT_FOUND(404, "Account not found!!"),//
	PASSWORD_INCORRECT(403, "Password incorrect!!"),//
	INSUFFICIENT_BALANCE(400,"Insufficient balance!!"),//
	;

	private int code;
	private String message;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private RtnCode(int code, String message) {
		this.code = code;
		this.message = message;
	}
}
