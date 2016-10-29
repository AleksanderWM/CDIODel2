
/**
 * Player class is created to keep track of the player's name, and their current score in the game.
 * The way this is done is explained below.
 * @author Jens & Morten C
 */
public class Player {
	
	//Creation of attributes

	private String nameOfPlayer;
	private int Balance=1000;
	private int Bank;
	private int point;
	
	private int MIN=0;
	
	/**
	 * Creates the constructor
	 * @param name Reserves space for the player's name.
	 * @param point Reserves space for the player's points.
	 */
	public Player (String name)
	{
		nameOfPlayer = name;
		Balance=point;
	}
	
	/**
	 * Sets the player's name
	 * @param name Sets the players name
	 * @return
	 */
	public void setPlayerName(String name)
	{
		nameOfPlayer = name;
	}
	
	/**
	 * Returns the player's name.
	 * @return
	 */
	public String getPlayerName()
	{
		return nameOfPlayer;
	}
	
	public void setAccount()
	{
		Balance=Balance+fieldValue;
	}
	public int getAccount()
	{
		Bank=Balance;
		return Bank;
	}
	/**
	 * Converts the Balance from an int to a string.
	 */
	public String toString()
	{
		return Integer.toString(Balance);
	}
		
	/**
	* Calculates the player's balance. This is done by having the (int currentShakerValue) added to the score. 
	* @param currentShakerValue Adds the current shaker points to the total score.
	* @return
	*/
	public int setBalance(int Account)
	{
	Balance = Balance + Account;
	return Balance;
	}
	/**
	* Returns the player's current balance.
	* @return
	*/
	public int getBalance()
	{
	return Balance;
	}
	/*
	* Makes sure the player's balance can't get below 0
	*/
	public int minBalance()
	{
	if (Balance <= MIN){
		Balance=0;
	}
	return Balance;
	}
//	/**
//	* Converts the Balance from an int to a string.
//	*/
//	public static String toString(Account print)
//	{
//	return Integer.toString(print.Balance);
//	}
}
	

	