package Eight.Six;

import java.util.ArrayList;

public class AccountSystem
{
	// Create variables, arrays, and objects.
	private int serverLoad;
	private String serverName;
	private Account[] customerAccounts = new Account[30];
	
	// Object Constructor.
	public AccountSystem(String serverName, int accounts, double initialBalance, String name)
	{
		this.serverName = serverName;
		setupAccounts(accounts, initialBalance, name);
	}
	
	// Initially setup the accounts.
	private void setupAccounts(int accounts, double initalBalance, String name)
	{
		serverLoad += accounts;
		if (serverLoad > 30)
		{
			System.out.println("ERROR: This server can only support up to 30 accounts!");
		}
		else
		{
			for (int i = 0; i < accounts; i++)
			{
				customerAccounts[i] = new Account(name, i, initalBalance);
			}
		}
	}
	
	// Deposit to a certain Account.
	public double accountDeposit(int id, double deposit)
	{
		return customerAccounts[id - 1].deposit(deposit);
	}
	
	// Withdraw from a certain Account.
	public double accountWithdraw(int id, double withdraw, double fee)
	{
		return customerAccounts[id - 1].withdraw(withdraw, fee);
	}
	
	// Add a 3% interest to all accounts.
	public void addInterest()
	{
		for (int i = 0; i < serverLoad; i++)
		{
			customerAccounts[i].addInterest(0.03);
		}
	}
	
	// Setters
	public void setServerName(String serverName)
	{
		this.serverName = serverName;
	}
	
	// Getters
	public String getServerName()
	{
		return serverName;
	}
	
	// Print info about users.
	public String toString()
	{
		String userBalances = "User Balances: \n";
		for (Account customer : customerAccounts) 
		{ 
			userBalances += customer.getBalance() + "\n"; 
		}
		return userBalances;
	}
}