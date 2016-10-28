
/**
 * Player class is created to keep track of the player's name, and their current score in the game.
 * The way this is done is explained below.
 * @author Jens & Morten C
 */
public class Player {
	
	//Creation of attributes

	private String nameOfPlayer;
	Account Account = new Account();
	/**
	 * Creates the constructor
	 * @param name Reserves space for the player's name.
	 * @param point Reserves space for the player's points.
	 */
	public Player (String name, int point)
	{
		nameOfPlayer = name;
		Account.Balance = point;
	
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
		
	}
	public int getAccount()
	{
		return Account.Balance;
	}
	/**
	 * Converts the Balance from an int to a string.
	 */
	public String toString()
	{
		String result = Integer.toString(Account.Balance);
		return result;
	}
}
	

	