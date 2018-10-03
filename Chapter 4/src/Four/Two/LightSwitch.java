package Four.Two;

public class LightSwitch
{
	public static void main(String[] args)
	{
		// Creates object pointers.
		Bulb light1 = new Bulb();
		Bulb light2 = new Bulb();
		
		// Turn on bulb 1
		light1.on();
		
		System.out.println("Light 1 State: " + light1);
		System.out.println("Light 2 State: " + light2);
	}
}