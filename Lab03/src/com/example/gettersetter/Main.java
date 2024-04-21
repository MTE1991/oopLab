package com.example.gettersetter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount();
		acc1.setAccountNo("123456789");
		acc1.setBalance(10.69);
		System.out.println("Account No. -> " + acc1.getAccountNo());
		System.out.println("Balance -> " + acc1.getBalance() + "$");
	}

}
