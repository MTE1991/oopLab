package com.example.bankacc;

public class BankAccount {
	private String name;
	private String accountNo;
	private String dob; // Format: DD/MM/YYYY
	private double balance = 0;
	
	public BankAccount(String name, String accountNo, String dob) {
		this.name = name;
		this.accountNo = accountNo;
		this.dob = dob;
	}
	
	public void depositBalance(double amount) {
		if (amount <= 0) {
			System.out.println("Insufficient amount!");
			return;
		}
		balance += amount;
	}
	
	public double withdrawBalance(double amount) {
		if (amount <= 0) {
			System.out.println("Error! Amount can't be negative.");
			return balance;
		}
		if (balance < amount) {
			System.out.println("Insufficient balance!");
			return balance;
		}
		balance -= amount;
		return balance; // balance after withdrawal
	}

	public double getBalance() {
		return balance;
	}

}
