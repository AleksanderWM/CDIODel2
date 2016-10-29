
/**
 * Player class is created to keep track of the player's name, and their current score in the game.
 * The way this is done is explained below.
 * @author Jens & Morten C
 */
public class Player {
	
	//Creation of attributes

	private String nameOfPlayer;
	private int Balance;
	
	/**
	 * Creates the constructor
	 * @param name Reserves space for the player's name.
	 * @param point Reserves space for the player's points.
	 */
	public Player (String name)
	{
		nameOfPlayer = name;
		Balance = 1000;
	}
	
	/**
	 * Sets the player's name
	 * @param name Sets the players name
	 * @return
	 */
	public void setPlayerName(String name)
	{
		this.nameOfPlayer = name;
	}
	
	/**
	 * Returns the player's name.
	 * @return
	 */
	public String getPlayerName()
	{
		return this.nameOfPlayer;
	}
	
	public void setAccount(int bogstav)
	{
		this.bank.setBalance(bogstav);
	}
	public int getAccount()
	{
		return this.bank.getBalance();
	}
	/**
	 * Converts the Balance from an int to a string.
	 */
	public String toString()
	{
		return Account.toString(this.bank);
	}
}
	

	