package main;
public class Die 
{
	private final int MAX = 6; 	// Maximum face value
	private int faceValue;

	// Constructor
	public Die()	
	{
		faceValue = 0;
	}
	
	//Method for rolling die to achieve random face value
	public void setRoll()
	{
		faceValue = (int)(Math.random() * MAX) + 1;
	}
	
	//Set roll to a defined value
	public int getRoll()
	{			
		return faceValue;
	}
		
	public String toString() 
	{
		return Integer.toString(faceValue);
	}
	
}
