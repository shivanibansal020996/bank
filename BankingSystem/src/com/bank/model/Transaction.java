package com.bank.model;

public class Transaction {
	
	private Integer custid;
	private String Date;
	private String transid;
	private String acountno;
	private String creditordebit;
	private String availablebalance;
	private String description;
	private String phonenumber;
	private String amountcredit;
	private String amountdebit;
	
	
	
	public String getAcountno() {
		return acountno;
	}
	public void setAcountno(String acountno) {
		this.acountno = acountno;
	}
	public Integer getCustid() {
		return custid;
	}
	public void setCustid(Integer custid) {
		this.custid = custid;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTransid() {
		return transid;
	}
	public void setTransid(String transid) {
		this.transid = transid;
	}
	
	public String getCreditordebit() {
		return creditordebit;
	}
	public void setCreditordebit(String creditordebit) {
		this.creditordebit = creditordebit;
	}
	public String getAvailablebalance() {
		return availablebalance;
	}
	public void setAvailablebalance(String availablebalance) {
		this.availablebalance = availablebalance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAmountcredit() {
		return amountcredit;
	}
	public void setAmountcredit(String amountcredit) {
		this.amountcredit = amountcredit;
	}
	public String getAmountdebit() {
		return amountdebit;
	}
	public void setAmountdebit(String amountdebit) {
		this.amountdebit = amountdebit;
	}
	@Override
	public String toString() {
		return "Transaction [custid=" + custid + ", Date=" + Date + ", transid=" + transid + ", creditordebit="
				+ creditordebit + ", availablebalance=" + availablebalance + ", description=" + description
				+ ", phonenumber=" + phonenumber + ", amountcredit=" + amountcredit + ", amountdebit=" + amountdebit
				+ "]";
	}
	
	
	
	
	
	
	




}
