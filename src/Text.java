/**
 * The Text class holds and controls all text that may be printed to the user.
 * The primary reasoning for reserving all text to a specific class is to ease any proces of translation.
 * @author Emil and Aleksander
 */
public class Text {
	
	String start;
	String turn;
	String end;
	CustomField field;
	Player player;
	Shaker shake;

	// Creates an array of CustomFields with their separate descriptions and value.
	
	public CustomField[] fieldDescription =
		{
			new CustomField(" ", 0),
			new CustomField(" ", 0),
			new CustomField("Tower", 250),
			new CustomField("Crater", -100),
			new CustomField("Palace Gates", +100),
			new CustomField("Cold Desert", -20),
			new CustomField("Walled city", +180),
			new CustomField("Monastery", 0),
			new CustomField("Black cave", -70),
			new CustomField("Huts in the mountain", +60),
			new CustomField("The Werewall", -80),
			new CustomField("The pit", -50),
			new CustomField("Goldmine", +650),
		};
	
	/**
	 * @param getFieldDescription Returns the fieldDescription of a single field in response to the array reference
	 * @param point the reference to the fields reference in the constructed array
	 */
	public String getFieldDescription(int point)
	{ 
		
		return fieldDescription[point].getFieldText();
		
	}
	
	/**
	 * @param getFieldValue Returns the fieldVaule of a single field in response to the array reference
	 * @param point the reference to the fields reference in the constructed array
	 */
	public int getFieldValue(int point)
	{
		return fieldDescription[point].getValue();
	}

	/**
	 * @param printStartDescription prints the introduction text described in the method
	 */
	public void printStartDescription()
	{
		
		System.out.println("Hello Players! today we will be playing a game of dices\nThe object of the game is to get 3000 money!!\nYou will each start with 1000 money\nGood luck to both of you! Player one please start your turn\n");
		
	}

	/**
	 * @param printEndDescription prints the conclusion text described in the method
	 */
	public void printEndDescription()
	{
		System.out.println("You won the game");
		
	}

	/**
	 * @param turnDescription prints the dynamic text to the player informing of the actions being done on the specific turn
	 * @param player the Player object of whom the turn description shall be printed
	 * @param shake the Shake object signifying the dice roll of the turn
	 */
	public void turnDescription(Player player, Shaker shake)
	{
		if(shake.getShake()!=10)
			{
			System.out.println(player.getPlayerName() + " rolled " + shake + "\nYou landed on " + getFieldDescription(shake.getShake()) + "\nYour balance is changed by " + getFieldValue(shake.getShake()) + " to:");
			}
		else
			{
			System.out.println(player.getPlayerName() + " rolled " + shake + "\nYou landed on " + getFieldDescription(shake.getShake()) + "\nYou get an extra turn but your balance is changed by " + getFieldValue(shake.getShake()) + " to:");
			}
	}
	
	

}
