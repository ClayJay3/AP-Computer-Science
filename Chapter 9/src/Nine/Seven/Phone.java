package Nine.Seven;

public class Phone extends Electronics
{
	// Create variables.
	private int ram;
	private int storage;
	private String color;
	private String processor;
	
	// Constructor.
	public Phone(String color, double weight, double cost, double powerUsage, String manufacturers, String name)
	{
		super(weight, cost, powerUsage, manufacturers, name);
		this.ram = ram;
		this.storage = storage;
		this.color = color;
		this.processor = processor;
	}
	
	// Class specific methods.
	public void ringPhone()
	{
		System.out.println("Ring-a-ding-ding");
	}
	
	/////////////////////////////////////////////////////////////
	///           Getters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public int getRam()
	{
		return ram;
	}
	public int getStorage()
	{
		return storage;
	}
	public String getColor()
	{
		return color;
	}
	public String getProccesor()
	{
		return processor;
	}
	
	/////////////////////////////////////////////////////////////
	///           Setters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public void setRam(int ram)
	{
		this.ram = ram;
	}
	public void setStorage(int storage)
	{
		this.storage = storage;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setProcessor(String processor)
	{
		this.processor = processor;
	}
}