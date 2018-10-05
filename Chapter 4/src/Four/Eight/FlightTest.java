package Four.Eight;

public class FlightTest
{
	public static void main(String[] args)
	{
		// Create object pointers.
		Flight plane1 = new Flight("American Airlines", 243, "Camdenton", "Linn Creek?");
		Flight plane2 = new Flight("Jungle Airlines", 257, "Osage Beach", "Canada");
		
		// Modify objects.
		plane1.setOrigin("Kansas City");
		plane2.setDestination("Europe");
		
		// Print plane objects.
		System.out.println(plane1);
		System.out.println("Flight: " + plane2.getFlightName() + " " + plane2.getFlightNumber() + " traveling from " + plane2.getOrigin() + " to " + plane2.getDestination());
		
	}
}