package Four.Six;

import java.text.DecimalFormat;

public class BoxTest
{
	public static void main(String[] args)
	{
		// Create objects.
		Box box1 = new Box(2, 5, 78.4);
		Box box2 = new Box(2, 5, 78.4);
		Box box3 = new Box(2, 5, 78.4);
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		// Modify Objects
		box1.setIsFull(true);
		box3.setIsFull(true);
		box2.setBoxDepth(6);
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println("Box Height:" + fmt.format(box3.getBoxHeight()) + " Box Width:" + fmt.format(box3.getBoxWidth()) + " Box Depth:" + fmt.format(box3.getBoxDepth()) + " and the box is " + box3.getIsFull() +  " that the box is full.");

	}
}