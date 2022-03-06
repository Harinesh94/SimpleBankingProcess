package com.myclass;

public class BankAccount {
	public int customerId;
	public String customerName;
	public int balance = 0;
	public int previousTransAmt;
	public boolean deposit;
	public boolean lessBalance;


	public BankAccount(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	public void showMenu() {
		System.out.println("Welcome to the SBI Bank");
		System.out.println("Please select the  option to proceed");
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit the Amount");
		System.out.println("3.Withdraw the amount");
		System.out.println("4.Previous Tansaction");
		System.out.println("5.Exit");
		System.out.println();
	}
	
	public void deposit(int amt) {
		if(amt > 0) {
			balance += amt;
			previousTransAmt = amt;
			deposit = true;
		}
	}


	public void withdraw(int amt) {
		if(amt > 0 && amt < balance) {
			balance -= amt;
			previousTransAmt = amt;
			deposit = false;
		}else {
			lessBalance = true;
		}
	}
	

}
