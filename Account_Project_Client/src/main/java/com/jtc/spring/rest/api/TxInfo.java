package com.jtc.spring.rest.api;

public class TxInfo {

	private int accno;
	private double amount;

	public TxInfo() {
		// TODO Auto-generated constructor stub
	}

	public TxInfo(int accno, double amount) {
		this.accno = accno;
		this.amount = amount;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
