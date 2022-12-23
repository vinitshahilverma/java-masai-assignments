package com.question4;

import java.io.Serializable;

public class Account implements Serializable {

	private Integer accountNo;
	private String Name;
	private Double balance;

	public Account() {
		
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", Name=" + Name + ", balance=" + balance + "]";
	}

	public Account(Integer accountNo, String name, Double balance) {
		super();
		this.accountNo = accountNo;
		Name = name;
		this.balance = balance;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

}
