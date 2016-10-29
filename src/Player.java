
/**
 * Player class is created to keep track of the player's name, and their current score in the game.
 * The way this is done is explained below.
 * @author Jens & Morten C
 */
public class Player {
	
	//Creation of attributes

	private String nameOfPlayer;
	private int Balance;
	
	private int MIN=0;
	
	/**
	 * Creates the constructor
	 * @param name Reserves space for the player's name.
	 * @param point Reserves space for the player's points.
	 */
	public Player (String name, int point)
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
	
	public void setAccount(int point)
	{
		Balance=Balance+point;
		if (Balance <= MIN){
			Balance=0;
		}
	}
	public int getAccount()
	{
		return Balance;
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

}
	

	

	