package Nine.One;

public class Wallet
{
	public static void main(String[] args)
	{
		// Create multiple coin objects.
		MonetaryCoin coin1 = new MonetaryCoin(1);
		MonetaryCoin coin2 = new MonetaryCoin(10);
		
		// Manipulate coin objects to test fuctionality.
		coin1.setValue(3);
		coin1.flip();
		coin2.flip();
		
		// Print coin info.
		System.out.println("Coin 1 Value: " + coin1.getValue());
		System.out.println("Coin 1 flip is heads: " + coin1.isHeads());
		System.out.println("Coin 2 flip is heads: " + coin2.isHeads());
	}
}