package com.example.demo.vo;

import com.example.demo.constants.RtnCode;
import com.example.demo.entity.Atm;

public class AtmResponse {

	private RtnCode rtncode;
	private Atm atm;

	public AtmResponse(Atm atm, RtnCode rtncode) {
		super();
		this.rtncode = rtncode;
		this.atm = atm;
	}

	public AtmResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RtnCode getRtncode() {
		return rtncode;
	}

	public void setRtncode(RtnCode rtncode) {
		this.rtncode = rtncode;
	}

	public Atm getAtm() {
		return atm;
	}

	public void setAtm(Atm atm) {
		this.atm = atm;
	}

//	private int code;
//	private String message;

//	public AtmResponse(int code, String message, Atm atm) {
//		super();
//		this.code = code;
//		this.message = message;
//		this.atm = atm;
//	}

//	public int getCode() {
//		return code;
//	}
//
//	public void setCode(int code) {
//		this.code = code;
//	}
//
//	public String getMessage() {
//		return message;
//	}
//
//	public void setMessage(String message) {
//		this.message = message;
//	}

//	public Atm getAtm() {
//		return atm;
//	}
//
//	public void setAtm(Atm atm) {
//		this.atm = atm;
//	}

}
