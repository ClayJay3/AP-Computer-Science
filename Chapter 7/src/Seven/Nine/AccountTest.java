package Seven.Nine;

import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{
		// Create objects and variables.
		double withdraw = 0;
		double deposit = 0; 
		double initial = 0;
		long accountNumber = 0;
		String name = "";
		Scanner userInput = new Scanner(System.in);
		
		// Create an account.
		System.out.println("-----Acount Setup-----");
		System.out.println("Enter Name Below:");
		name = userInput.nextLine();
		System.out.println("Enter Account Number Below:");
		accountNumber = userInput.nextLong();
		System.out.println("Enter an Initial Deposit Below:");
		initial = userInput.nextDouble();
		Account account1 = new Account(name, accountNumber, initial);
		
		// Make a withdraw and deposit
		System.out.println("Current Balance: " + account1.getBalance());
		System.out.println("Enter an amount to withdraw:  ($1.25 fee)");
		account1.withdraw(userInput.nextDouble(), 1.23);
		System.out.println(account1.getError());
		System.out.println("Current Balance: " + account1.getBalance());
		System.out.println("Enter an amount to deposit:");
		account1.deposit(userInput.nextDouble());
		System.out.println(account1.getError());
		System.out.println();
		System.out.println("Current Balance: " + account1.getBalance());
		
		// Lock the Account object and try to invoke a method.
		account1.setKey(12345);
		account1.lock(12345);
		System.out.println();
		System.out.println("I will now lock the object and attempt to access it.");
		System.out.println(account1.getBalance());
	}
}