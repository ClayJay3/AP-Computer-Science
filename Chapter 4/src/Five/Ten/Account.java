package Five.Ten;

import java.text.NumberFormat;

public class Account
{
   private final double RATE = 0.035;
   private long acctNumber;
   private double balance;
   private String name;
   private String error;

   //-----------------------------------------------------------------
   //  Sets up the account by defining its owner, account number,
   //  and initial balance.
   //-----------------------------------------------------------------
   public Account(String owner, long account, double initial)
   {
      name = owner;
      acctNumber = account;
      balance = initial;
   }

   //-----------------------------------------------------------------
   //  Deposits the specified amount into the account. Returns the
   //  new balance.
   //-----------------------------------------------------------------
   public double deposit(double amount)
   {
	  if (amount <= 0)
	  {
		  error = "ERROR: Deposit is not greater than 0!";
		  return balance;
	  }
	  else
	  {
		  balance = balance + amount;
	      return balance;
	  }
   }

   //-----------------------------------------------------------------
   //  Withdraws the specified amount from the account and applies
   //  the fee. Returns the new balance.
   //-----------------------------------------------------------------
   public double withdraw(double amount, double fee)
   {
	  if (amount > balance)
	  {
		  error = "ERROR: Withdraw amount is greater than balance!";
		  return balance;
	  }
	  else
	  {
		  balance = balance - amount - fee;
	      return balance;
	  }
   }

   //-----------------------------------------------------------------
   //  Adds interest to the account and returns the new balance.
   //-----------------------------------------------------------------
   public double addInterest()
   {
      balance += (balance * RATE);
      return balance;
   }

   //-----------------------------------------------------------------
   //  Returns the current balance of the account.
   //-----------------------------------------------------------------
   public double getBalance()
   {
      return balance;
   }
   
   //-----------------------------------------------------------------
   //	Returns the error (if any) witch results from an invalid
   //	value being passed into any of the above methods.
   //-----------------------------------------------------------------

   //-----------------------------------------------------------------
   //  Returns a one-line description of the account as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
   }
}