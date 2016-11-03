package main;
/**
 * @author Aleksander and Morten N
 * Edited by Emil and Nick
 */
public class Shaker {
	
	//Creation of attributes and new instance
	private int shakeValue;
	private Die die1 = new Die();
	private Die die2 = new Die();
	
	/**
	 * Creates the constructor, Shaker.
	 */
	public Shaker()
	{
		shakeValue = 0;
	}
	
	/**
	 * Rolls the dice, but doesn't return a value.
	 */
	public void setShake()
	{
		die1.setRoll();
		die2.setRoll();
	}
	
	/**
	 * Returns the value of the roll.
	 * @return
	 */
	public int getShake()
	{
		shakeValue = die1.getRoll() + die2.getRoll();
		return shakeValue;
	}
	
	/**
	 * Returns the value of Die1 from the roll.
	 * @return
	 */
	public Die getDie1()
	{
		return die1;
	}
	
	/**
	 * Returns the value of Die2 from the roll.
	 * @return
	 */
	public Die getDie2()
	{
		return die2;
	}
	
	/**
	 * Converts the shakeValue from an int to a string.
	 */
	public String toString()
	{
		return Integer.toString(shakeValue);
	}
}