package Four.Five;

public class CarTest
{
	public static void main(String[] args)
	{
		Car car1 = new Car("Camaro", "RS", 1953);
		Car car2 = new Car("Mustang", "GT", 2006);
		
		car2.setCarYear(2005);
		
		System.out.println("Car 1 Description: " + car1);
		System.out.println("Car 2 Description: This car is a " + car2.getCarYear() + " " + car2.getCarMake() + " " + car2.getCarModel() + ". " + "It is also " + car2.isAntique() + " that this car is antique.");
	}
}