package Three.Eight;

import java.util.Random;

public class Eight
{
	public static void main(String[] args)
	{
		double number = 0.0;
		double sin = 0.0;
		double cos = 0.0;
		double tan = 0.0;
		double rad = 0.0;
		Random rand = new Random();
		
		number = rand.nextInt(21) + 20;
		rad = (Math.PI * number) / 180;
		System.out.println("Random Number: " + number);
		sin = Math.sin(rad);
		System.out.println("Sine of random numbers: " + sin);
		cos = Math.cos(rad);
		System.out.println("Cosine of random numbers: " + cos);
		tan = Math.tan(rad);
		System.out.println("Tangent of random numbers: " + tan);
		
	}
}