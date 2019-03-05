package Nine.Seven;

public class Store
{
	public static void main(String[] args)
	{
		// Create objects and variables.
		Computer GamingComputer = new Computer("Black/Blue", "ATX", 15.0, 1300.0, 500.0, "NZXT, MSI, HyperX, NVIDIA", "Gaming Computer");
		Phone Phone = new Phone("Red", 300.0, 658.0, 0.0, "OnePlus", "OnePlus 6");
		
		// Manipulate Objects.
		System.out.println("Gaming Computer Power Usage: " + GamingComputer.getPowerUsage());
		System.out.println("My " + Phone.getName() + " is " + Phone.getColor());
	}
}