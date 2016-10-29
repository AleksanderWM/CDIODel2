public class Die 
{
	private final static int MAX = 6; 	// Maximum face value
	private static int faceValue;

	// Constructor
	public Die()	
	{
		faceValue = 0;
	}
	
	
	//Method for rolling die to achieve random face value
	public static void setRoll()
	{
		faceValue = (int)(Math.random() * MAX) + 1;
	}
	
	//Set roll to a defined value
	public static int getRoll()
	{			
		return faceValue;
	}
		
	public String toString() 
	{
		return Integer.toString(faceValue);
	}
	
}