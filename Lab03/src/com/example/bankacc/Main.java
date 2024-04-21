package com.example.bankacc;

public class Main {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("Mizanur Rahman", "123456", "23/08/2001");
		acc1.depositBalance(100);
		System.out.println(acc1.getBalance());
		acc1.withdrawBalance(60);
		System.out.println(acc1.getBalance());
	}

}
