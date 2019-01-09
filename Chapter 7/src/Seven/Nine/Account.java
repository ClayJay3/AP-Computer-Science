package Seven.Nine;

import java.text.NumberFormat;

public class Account implements Lockable
{
   private final double RATE = 0.035;
   private long acctNumber;
   private double balance;
   private String name;
   private String error = "";
   private int keyPass = 0;
   private boolean isLocked = false;

   //-----------------------------------------------------------------
   //  Sets up the account by defining its owner, account number,
   //  and initial balance.
   //-----------------------------------------------------------------
   public Account(String owner, long account, double initial)
   {
	  if (account < 0 || initial < 0)
	  {
		  error = "ERROR: Initial deposit invalid!";
	  }
	  else
	  {
		  error = "";
		  name = owner;
	      acctNumber = account;
	      balance = initial;
	  }
   }

   //-----------------------------------------------------------------
   //  Deposits the specified amount into the account. Returns the
   //  new balance.
   //-----------------------------------------------------------------
   public double deposit(double amount)
   {
	  if (!isLocked)
	  {
		  if (amount <= 0)
		  {
			  error = "ERROR: Deposit is not greater than 0!";
			  return balance;
		  }
		  else
		  {
			  error = "";
			  balance = balance + amount;
		      return balance;
		  }
	  }
	  else
	  {
		  System.out.println("ERROR: This object is locked");
		  return 0.0;
	  }
   }

   //-----------------------------------------------------------------
   //  Withdraws the specified amount from the account and applies
   //  the fee. Returns the new balance.
   //-----------------------------------------------------------------
   public double withdraw(double amount, double fee)
   {
	   if (!isLocked)
	   {
		   if (amount > balance || !(amount > 0))
			  {
				  error = "ERROR: Withdraw amount is greater than balance or is not greater than 0!";
				  return balance;
			  }
			  else
			  {
				  error = "";
				  balance = balance - amount - fee;
			      return balance;
			  }
	   }
	   else
	   {
		   System.out.println("ERROR: This object is locked");
		   return 0.0;
	   }
   }

   //-----------------------------------------------------------------
   //  Adds interest to the account and returns the new balance.
   //-----------------------------------------------------------------
   public double addInterest()
   {
	   if (!isLocked)
	   {
		   balance += (balance * RATE);
		   return balance;
	   }
	   else
	   {
		   System.out.println("ERROR: This object is locked");
		   return 0.0;
	   }
   }
   
   //-----------------------------------------------------------------
   //	Locks the object.
   //-----------------------------------------------------------------
   public void lock(int keyPass) 
   {
	   if (keyPass == this.keyPass)
	   {
		   isLocked = true;
	   }
	   else
	   {
		   System.out.println("ERROR: Incorrect keyPass");
	   }
   }

   //-----------------------------------------------------------------
   //	Unlocks the object.
   //-----------------------------------------------------------------
   public void unlock(int keyPass) 
   {
	   if (keyPass == this.keyPass)
	   {
		   isLocked = false;
	   }
	   else
	   {
		   System.out.println("ERROR: Incorrect keyPass");
	   }
   }

   //-----------------------------------------------------------------
   //	Sets the key for the lockable interface.
   //-----------------------------------------------------------------
   public void setKey(int keyPass) 
   {
	   this.keyPass = keyPass;
   }

   //-----------------------------------------------------------------
   //  Returns the current balance of the account.
   //-----------------------------------------------------------------
   public double getBalance()
   {
	   if (!isLocked)
	   {
		   return balance;
	   }
	   else
	   {
		   System.out.println("ERROR: This object is locked");
		   return 0.0;
	   }
   }
   
   //-----------------------------------------------------------------
   //	Returns the error (if any) witch results from an invalid
   //	value being passed into any of the above methods.
   //-----------------------------------------------------------------
   public String getError()
   {
	   if (!isLocked)
	   {
		   return error;
	   }
	   else
	   {
		   System.out.println("ERROR: This object is locked");
		   return null;
	   }
   }
   
   //-----------------------------------------------------------------
   //	Returns if the object is locked or not.
   //-----------------------------------------------------------------
   public boolean locked() 
   {
	   if (!isLocked)
	   {
			return isLocked;
	   }
	   else
	   {
		   System.out.println("ERROR: This object is locked");
		   return false;
	   }
   }
   
   //-----------------------------------------------------------------
   //  Returns a one-line description of the account as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
	   if (!isLocked)
	   {
		   NumberFormat fmt = NumberFormat.getCurrencyInstance();
		   return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
	   }
	   else
	   {
		   System.out.println("ERROR: This object is locked");
		   return null;
	   }
   }
}