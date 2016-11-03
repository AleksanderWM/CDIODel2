package main;
/**
 * @author Emil and Aleksander
 * The Text class holds and controls all text that may be printed to the user.
 * The primary reasoning for reserving all text to a specific class is to ease any process of translation.
 * In future projects we will be creating a text file, for the game to load, and easing the translation process.
 */
public class Text {


	/**
	 *  Creates an array of CustomFields with their separate descriptions and value.
	 */
	CustomField[] fieldArray =
		{
			new CustomField(" "," ", 0, " "),
			new CustomField(" "," ", 0, "icons/BridgeIcon.png"),
			new CustomField("Tower","You encounter a tower, unlike in fairytales this tower does not hold a princess. It does however hold 250 Gold coins. Take these with you on your quest.", 250,"icons/TowerIcon.jpg"),
			new CustomField("Crater","You encounter a crater. You fall into it, and while stumbling down lose 100 Gold coins.", -100,"icons/CraterIcon.jpg"),
			new CustomField("Palace Gates","You encounter the Palace Gates. You trick someone into paying you a 100 Gold coins fee for passing through the gates.", +100,"icons/PalaceGatesIcon.jpg"),
			new CustomField("Cold Desert","You have wandered into the Cold Deserts, to keep yourself warm, you light your goldcoins on fire. You burn through 20 Gold coins, but are now warm.", -20,"icons/ColdDesertIcon.jpg"),
			new CustomField("Walled City","You encounter a Walled City. The city desperately needs foreigners to populate their genepool, so they pay you 180 Goldc oins to stay overnight.", +180,"icons/WalledCityIcon.jpg"),
			new CustomField("Monastery","You visit a Monastery in your travels. They let you spend the night, without any fees. You do however not get any Gold coins this round.", 0,"icons/MonasteryIcon.jpg"),
			new CustomField("Black cave","You have come across the Black cave. You discover it is a brothel, and happily spend 70 Gold coins to stay the night.", -70,"icons/BlackCaveIcon.jpg"),
			new CustomField("Huts in the mountain","You discover some huts in a mountain. You search through them, and find 70 Gold coins. Nobody lives here, so you put them in your pocket.", +60,"icons/MountainHutIcon.jpg"),
			new CustomField("The Werewall","You encounter the Werewall. The warewolfs scare you, and you drop 80 Gold coins. You discover that they were actually Girl Scout’s trying out new methods instead of selling cookies. You ran so fast that you get an extra turn", -80,"icons/WareWallIcon.jpg"),
			new CustomField("The Pit","You encounter a pit. Just like your spending habits in the real world, you throw money in to this pit as well. You lose 50 Gold coins.", -50,"icons/PitIcon.jpg"),
			new CustomField("Goldmine","You find an abandoned Goldmine. You go inside and find gold worth 650 Gold coins. This must be your lucky day!", +650,"icons/GoldmineIcon.jpg"),
		};
	
	/**
	 * @param getFieldDescription Returns the fieldDescription of a single field in response to the array reference
	 * @param point the reference to the fields reference in the constructed array
	 */
	private String getFieldDescription(int point)
	{ 
		return fieldArray[point].getFieldDescription();
	}
	
	/**
	 * @param getFieldValue Returns the fieldVaule of a single field in response to the array reference
	 * @param point the reference to the fields reference in the constructed array
	 */
	int getFieldValue(int point)
	{
		return fieldArray[point].getValueInt();
	}

	/**
	 * @param printStartDescription prints the introduction text described in the method
	 */
	public String getStartDescription()
	{
		return ("Hello Players! Today we will be playing a game of dices\nThe object of the game is to get 3000 money!!\nYou will each start with 1000 money\nGood luck to both of you!\nPlayer one please start your turn\n");
	}

	/**
	 * @param printEndDescription prints the conclusion text described in the method
	 */
	public String getEndDescription()
	{
		return "You won the game";
	}

	/**
	 * @param turnDescription prints the dynamic text to the player informing of the actions being done on the specific turn
	 * @param player the Player object of whom the turn description shall be printed
	 * @param shake the Shake object signifying the dice roll of the turn
	 */
	
	String getTurnDescription(Player player, Shaker shake)
	{
		return player.getPlayerName() + " rolled " + shake + ".\n"+ getFieldDescription(shake.getShake());
	}
	/**
	 * Returns the Welcome tekst.
	 * @return Welcome
	 */
	public String getWelcome()
	{
		return "Welcome!";
	}
	/**
	 * Returns the Start Game string
	 * @return Start Game
	 */
	public String getStartGame()
	{
		return "Start Game";
	}
	/**
	 * Returns the Start string
	 * @return Start
	 */
	public String getStartField()
	{
		return "START";
	}
	/**
	 * Returns a blank space.
	 * @return 
	 */
	public String getBlankSpace()
	{
		return " ";
	}
	/**
	 * Returns the 's turn! string
	 * @return 's turn!
	 */
	public String getPlayerTurn()
	{
		return "'s turn!";
	}
	
	/**
	 * Returns the Take turn! string
	 * @return Take turn!
	 */
	public String getTakeTurn()
	{
		return "Take turn!";
	}
	
	/**
	 * Returns the End turn string
	 * @return End Turn
	 */
	public String getEndTurn()
	{
		return "End Turn";
	}
}

