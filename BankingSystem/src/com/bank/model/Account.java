package com.bank.model;

public class Account {
   
	private String  accounnumber;
	private String  accountBalance;
	private String  accountType;
	private String  accountOpeningDate;
	
	
	public String getAccounnumber() {
		return accounnumber;
	}
	public void setAccounnumber(String accounnumber) {
		this.accounnumber = accounnumber;
	}
	public String getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountOpeningDate() {
		return accountOpeningDate;
	}
	public void setAccountOpeningDate(String accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}
	@Override
	public String toString() {
		return " accounnumber=" + accounnumber + ", accountBalance=" + accountBalance
				+ ", accountType=" + accountType + ", accountOpeningDate=" + accountOpeningDate + "]";
	}
	
	
	
}
