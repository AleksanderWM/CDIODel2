
/**
 * Player class is created to keep track of the player's name, and their current score in the game.
 * The way this is done is explained below.
 * @author Jens & Morten C
 */
public class Player {
	
	//Creation of attributes

	private String nameOfPlayer;
	private Account myAcc;
	
	private int MIN=0;
	
	/**
	 * Creates the constructor
	 * @param name Reserves space for the player's name.
	 * @param point Reserves space for the player's points.
	 */
	public Player (String name)
	{
		nameOfPlayer = name;
		myAcc = new Account();
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
	
	public Account getAccount()
	{
		return myAcc;
	}
//	public int getAccountioioio()
//	{
//		return Balance;
//	}
	/**
	 * Converts the Balance from an int to a string.
	 */
	public String toString()
	{
		return nameOfPlayer;
	}
		
	/**
	* Calculates the player's balance. This is done by having the (int currentShakerValue) added to the score. 
	* @param currentShakerValue Adds the current shaker points to the total score.
	* @return
	*/

}
	

	

	