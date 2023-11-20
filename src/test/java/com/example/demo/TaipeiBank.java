package com.example.demo;

public class TaipeiBank {
	private String branch;
	private String user;
	private int balance;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int saving(int amount) {
		if(amount > 0) {
		balance += amount;
		}
		return balance;
	}

	public int withdraw(int amount) {
		if(amount > 0 && balance > amount) {
		balance -= amount;
		}
		return balance;
	}
}

