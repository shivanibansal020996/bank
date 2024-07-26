package com.bank.model;

public class Customer{
	
	private Integer id;
	private String customerName;
	private String phonenumber;
	private Account acc;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + ", phonenumber=" + phonenumber + ", acc=" + acc
				+ "]";
	}
	
	
	
}
