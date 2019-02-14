package Eight.Six;

public class Bank
{
	public static void main(String[] args)
	{
		// Create objects and variables.
		AccountSystem server1 = new AccountSystem("AccountServer1", 30, 550.50, "customer");
		
		// Test server functionality.
		System.out.println("Customer1's Account Balance After Deposit: " + server1.accountDeposit(1, 100));
		System.out.println("Customer5's Account Balance After Withdraw: " + server1.accountWithdraw(5, 20000, 2.34));
		System.out.println(server1.getError(5));
		server1.addInterest();
		System.out.println(server1);
	}
}