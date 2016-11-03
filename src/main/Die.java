package main;
/**
 * @Author Emil
 * edited by Aleksander
 * This class holds the responsibility to manage the individual dies..
 */
public class Die 
{
	private final int MAX = 6; 	// Maximum face value
	private int faceValue;

	/**
	 * @param Die Constructor. Creates a Die object.
	 * @param faceValue Sets the dies facevalue to 0
	 */
	public Die()	
	{
		faceValue = 0;
	}
	
	/**
	 * Sets the die to a random value between 1 and 6.
	 */
	void setRoll()
	{
		faceValue = (int)(Math.random() * MAX) + 1;
	}
	
	/**
	 * Returns the faceValue
	 * @return faceValue
	 */
	public int getRoll()
	{			
		return faceValue;
	}
	/**
	 * Converts the faceValue from integer to string.	
	 */
	public String toString() 
	{
		return Integer.toString(faceValue);
	}
}
