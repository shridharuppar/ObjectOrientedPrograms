package com.bridgelabz.objectorientedpgm;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account(1000.0);

		account.credit(500.0);
		// %.2f - This is a format specifier for a floating-point number with 2 decimal
		// places.
		System.out.printf("Balance after credit: $%.2f\n", + account.getBalance());

		account.debit(200.0);
		System.out.printf("Balance after debit: $%.2f\n", + account.getBalance());

		account.debit(300.0);
		System.out.printf("Balance after debit: $%.2f\n", + account.getBalance());
	}
}
